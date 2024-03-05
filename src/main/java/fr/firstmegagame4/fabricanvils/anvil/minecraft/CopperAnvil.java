package fr.firstmegagame4.fabricanvils.anvil.minecraft;

import fr.firstmegagame4.fabricanvils.init.block.MinecraftBlocks;
import fr.firstmegagame4.fabricanvils.anvil.InferiorMetalAnvil;
import fr.firstmegagame4.fabricanvils.screen.CustomAnvilScreenHandler;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class CopperAnvil extends InferiorMetalAnvil {

    public CopperAnvil() {
        super(FabricBlockSettings.create().mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.COPPER).hardness(4.0F));
    }

    public void onDestroyedOnLanding(World world, BlockPos pos, FallingBlockEntity fallingBlockEntity) {
        super.onDestroyedOnLanding(world, pos, fallingBlockEntity);
        this.damageAnvil(world, pos, fallingBlockEntity, this.getStateOnLanding(fallingBlockEntity.getBlockState()));
    }

    @Nullable
    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((syncId, inventory, player) -> new CustomAnvilScreenHandler(
                this,
                syncId,
                inventory,
                ScreenHandlerContext.create(world, pos)),
                TITLE
        );
    }

    @Nullable
    public BlockState getStateOnLanding(BlockState fallingState) {
        if (fallingState.isOf(MinecraftBlocks.COPPER_ANVIL.get())) {
            return MinecraftBlocks.CHIPPED_COPPER_ANVIL.get().getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else if (fallingState.isOf(MinecraftBlocks.CHIPPED_COPPER_ANVIL.get())) {
            return MinecraftBlocks.DAMAGED_COPPER_ANVIL.get().getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else return null;
    }

    @Override
    public SoundEvent getForgeSound() {
        return SoundEvents.BLOCK_COPPER_PLACE;
    }

    @Override
    public SoundEvent getBreakSound() {
        return SoundEvents.BLOCK_COPPER_PLACE;
    }
}
