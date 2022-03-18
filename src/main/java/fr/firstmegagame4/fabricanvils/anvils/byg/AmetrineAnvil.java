package fr.firstmegagame4.fabricanvils.anvils.byg;

import fr.firstmegagame4.fabricanvils.FA.Blocks.FABYGBlocks;
import fr.firstmegagame4.fabricanvils.anvils.MoreAdvancedMetalAnvil;
import fr.firstmegagame4.fabricanvils.screenhandlers.byg.AmetrineAnvilScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class AmetrineAnvil extends MoreAdvancedMetalAnvil {

    public AmetrineAnvil(Settings settings) {
        super(settings);
    }

    public void onDestroyedOnLanding(World world, BlockPos pos, FallingBlockEntity fallingBlockEntity) {
        super.onDestroyedOnLanding(world, pos, fallingBlockEntity);
        this.damageAnvil(world, pos, fallingBlockEntity, AmetrineAnvil.getLandingState(fallingBlockEntity.getBlockState()));
    }

    @Nullable
    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((syncId, inventory, player) -> new AmetrineAnvilScreenHandler(
                this.getForgeSound(),
                this.getBreakSound(),
                this.getChanceBreak(),
                syncId,
                inventory,
                ScreenHandlerContext.create(world, pos)),
                TITLE
        );
    }

    @Nullable
    public static BlockState getLandingState(BlockState fallingState) {
        if (fallingState.isOf(FABYGBlocks.AMETRINE_ANVIL)) {
            return FABYGBlocks.CHIPPED_AMETRINE_ANVIL.getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else if (fallingState.isOf(FABYGBlocks.CHIPPED_AMETRINE_ANVIL)) {
            return FABYGBlocks.DAMAGED_AMETRINE_ANVIL.getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else return null;
    }

    @Override
    public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
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
