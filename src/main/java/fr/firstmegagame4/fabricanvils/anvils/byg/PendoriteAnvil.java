package fr.firstmegagame4.fabricanvils.anvils.byg;

import fr.firstmegagame4.fabricanvils.FA.Blocks.FABYGBlocks;
import fr.firstmegagame4.fabricanvils.anvils.EvenMoreAdvancedMetalAnvil;
import fr.firstmegagame4.fabricanvils.screenhandlers.byg.PendoriteAnvilScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class PendoriteAnvil extends EvenMoreAdvancedMetalAnvil {

    public PendoriteAnvil(Settings settings) {
        super(settings);
    }

    public void onDestroyedOnLanding(World world, BlockPos pos, FallingBlockEntity fallingBlockEntity) {
        super.onDestroyedOnLanding(world, pos, fallingBlockEntity);
        this.damageAnvil(world, pos, fallingBlockEntity, PendoriteAnvil.getLandingState(fallingBlockEntity.getBlockState()));
    }

    @Nullable
    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((syncId, inventory, player) -> new PendoriteAnvilScreenHandler(
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
        if (fallingState.isOf(FABYGBlocks.PENDORITE_ANVIL)) {
            return FABYGBlocks.CHIPPED_PENDORITE_ANVIL.getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else if (fallingState.isOf(FABYGBlocks.CHIPPED_PENDORITE_ANVIL)) {
            return FABYGBlocks.DAMAGED_PENDORITE_ANVIL.getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else return null;
    }

}
