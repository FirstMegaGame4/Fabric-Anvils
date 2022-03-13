package fr.firstmegagame4.fabricanvils.screenhandlers;

import fr.firstmegagame4.fabricanvils.FA.FATags;
import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import fr.firstmegagame4.fabricanvils.FabricAnvilsClient;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.AnvilBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;

public class CustomAnvilScreenHandler extends AnvilScreenHandler {

    public static float chanceBreak;
    public static SoundEvent forgeSound;
    public static SoundEvent breakSound;
    public static int xpLimit;

    public CustomAnvilScreenHandler(SoundEvent forgeSound, SoundEvent breakSound, float chanceBreak, int syncId, PlayerInventory inventory, ScreenHandlerContext context) {
        super(syncId, inventory, context);
        CustomAnvilScreenHandler.forgeSound = forgeSound;
        CustomAnvilScreenHandler.breakSound = breakSound;
        CustomAnvilScreenHandler.chanceBreak = chanceBreak;
        this.context.run(((world, blockPos) -> {
            if (world.getBlockState(blockPos).isIn(FATags.FABRICANVILS)) {
                CustomAnvilScreenHandler.xpLimit = this.getXPLimit();
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

        this.input.setStack(0, ItemStack.EMPTY);
        this.input.setStack(1, ItemStack.EMPTY);

        this.context.run((world, pos) -> {
            BlockState blockState = world.getBlockState(pos);
            if (!player.getAbilities().creativeMode && blockState.isIn(FATags.FABRICANVILS) && player.getRandom().nextFloat() < chanceBreak) {
                BlockState blockState2 = this.getLandingState(blockState);
                if (blockState2 == null) {
                    world.removeBlock(pos, false);
                    world.playSound(null, pos, breakSound, SoundCategory.BLOCKS, 10F, 1F);
                } else {
                    world.setBlockState(pos, blockState2, 2);
                    world.playSound(null, pos, forgeSound, SoundCategory.BLOCKS, 10F, 1F);
                }
            } else {
                world.playSound(null, pos, forgeSound, SoundCategory.BLOCKS, 10F, 1F);
            }

        });
    }

    public BlockState getLandingState(BlockState blockState) {
        return AnvilBlock.getLandingState(blockState);
    }

    public int getXPLimit() {
        return 40;
    }

}
