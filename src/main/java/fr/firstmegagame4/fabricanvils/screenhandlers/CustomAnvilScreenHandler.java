package fr.firstmegagame4.fabricanvils.screenhandlers;

import fr.firstmegagame4.fabricanvils.FA.FATags;
import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import fr.firstmegagame4.fabricanvils.FabricAnvilsClient;
import fr.firstmegagame4.fabricanvils.anvils.CustomAnvil;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;

public class CustomAnvilScreenHandler extends AnvilScreenHandler {

    public CustomAnvil customAnvil;
    public static int xpLimit;

    public CustomAnvilScreenHandler(CustomAnvil customAnvil, int syncId, PlayerInventory inventory, ScreenHandlerContext context) {
        super(syncId, inventory, context);
        this.customAnvil = customAnvil;
        this.context.run(((world, blockPos) -> {
            if (world.getBlockState(blockPos).isIn(FATags.FABRICANVILS)) {
                CustomAnvilScreenHandler.xpLimit = customAnvil.getXPLimit();
            }
            else {
                CustomAnvilScreenHandler.xpLimit = 40;
            }
        }));
    }

    @Override
    public void updateResult() {
        this.context.run(((world, blockPos) -> {
            if (!world.isClient) {
                PacketByteBuf buf = PacketByteBufs.create();
                buf.writeInt(CustomAnvilScreenHandler.xpLimit);
                ServerPlayNetworking.send((ServerPlayerEntity) this.player, FAUtils.FAIdentifier("anvilxplimit"), buf);
            }
            else {
                FabricAnvilsClient.xpLimitOnClient = false;
            }
        }));
        super.updateResult();
    }

    protected void onTakeOutput(PlayerEntity player, ItemStack stack) {
        super.onTakeOutput(player, stack);
        this.context.run((world, pos) -> {
            BlockState blockState = world.getBlockState(pos);
            if (!player.getAbilities().creativeMode && blockState.isIn(FATags.FABRICANVILS) && player.getRandom().nextFloat() < this.customAnvil.getDamagingChance()) {
                BlockState blockState2 = this.customAnvil.getStateOnLanding(blockState);
                if (blockState2 == null) {
                    world.removeBlock(pos, false);
                    world.playSound(null, pos, this.customAnvil.getBreakSound(), SoundCategory.BLOCKS, 10F, 1F);
                } else {
                    world.setBlockState(pos, blockState2, 2);
                    world.playSound(null, pos, this.customAnvil.getForgeSound(), SoundCategory.BLOCKS, 10F, 1F);
                }
            } else {
                world.playSound(null, pos, this.customAnvil.getForgeSound(), SoundCategory.BLOCKS, 10F, 1F);
            }
        });
    }

}
