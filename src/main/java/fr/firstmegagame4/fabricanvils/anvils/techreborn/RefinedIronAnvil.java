package fr.firstmegagame4.fabricanvils.anvils.techreborn;

import fr.firstmegagame4.fabricanvils.FA.Blocks.FATechRebornBlocks;
import fr.firstmegagame4.fabricanvils.anvils.MetalAnvil;
import fr.firstmegagame4.fabricanvils.screenhandlers.techreborn.RefinedIronAnvilScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class RefinedIronAnvil extends MetalAnvil {

    public RefinedIronAnvil(Settings settings) {
        super(settings);
    }

    public void onDestroyedOnLanding(World world, BlockPos pos, FallingBlockEntity fallingBlockEntity) {
        super.onDestroyedOnLanding(world, pos, fallingBlockEntity);
        this.damageAnvil(world, pos, fallingBlockEntity, RefinedIronAnvil.getLandingState(fallingBlockEntity.getBlockState()));
    }

    @Nullable
    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((syncId, inventory, player) -> new RefinedIronAnvilScreenHandler(
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
        if (fallingState.isOf(FATechRebornBlocks.REFINED_IRON_ANVIL)) {
            return FATechRebornBlocks.CHIPPED_REFINED_IRON_ANVIL.getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else if (fallingState.isOf(FATechRebornBlocks.CHIPPED_REFINED_IRON_ANVIL)) {
            return FATechRebornBlocks.DAMAGED_REFINED_IRON_ANVIL.getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else return null;
    }

}
