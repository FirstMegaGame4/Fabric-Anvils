package fr.firstmegagame4.fabricanvils.anvil.byg;

import fr.firstmegagame4.fabricanvils.init.block.BYGBlocks;
import fr.firstmegagame4.fabricanvils.anvil.MoreAdvancedMetalAnvil;
import fr.firstmegagame4.fabricanvils.screen.CustomAnvilScreenHandler;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class AmetrineAnvil extends MoreAdvancedMetalAnvil {

    public AmetrineAnvil() {
        super(FabricBlockSettings.create().hardness(3.0F).sounds(BlockSoundGroup.GLASS));
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
        if (fallingState.isOf(BYGBlocks.BYGContent.AMETRINE_ANVIL)) {
            return BYGBlocks.BYGContent.CHIPPED_AMETRINE_ANVIL.getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else if (fallingState.isOf(BYGBlocks.BYGContent.CHIPPED_AMETRINE_ANVIL)) {
            return BYGBlocks.BYGContent.DAMAGED_AMETRINE_ANVIL.getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else return null;
    }

    @Override
    public boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

    @Override
    public SoundEvent getForgeSound() {
        return SoundEvents.BLOCK_GLASS_PLACE;
    }

    @Override
    public SoundEvent getBreakSound() {
        return SoundEvents.BLOCK_GLASS_BREAK;
    }
}
