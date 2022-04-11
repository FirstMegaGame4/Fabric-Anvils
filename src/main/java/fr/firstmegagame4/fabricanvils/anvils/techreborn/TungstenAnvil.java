package fr.firstmegagame4.fabricanvils.anvils.techreborn;

import fr.firstmegagame4.fabricanvils.FA.Blocks.FATechRebornBlocks;
import fr.firstmegagame4.fabricanvils.anvils.SuperiorMetalAnvil;
import fr.firstmegagame4.fabricanvils.screenhandlers.techreborn.TungstenAnvilScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class TungstenAnvil extends SuperiorMetalAnvil {

    public TungstenAnvil(Settings settings) {
        super(settings);
    }

    public void onDestroyedOnLanding(World world, BlockPos pos, FallingBlockEntity fallingBlockEntity) {
        super.onDestroyedOnLanding(world, pos, fallingBlockEntity);
        this.damageAnvil(world, pos, fallingBlockEntity, TungstenAnvil.getLandingState(fallingBlockEntity.getBlockState()));
    }

    @Nullable
    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((syncId, inventory, player) -> new TungstenAnvilScreenHandler(
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
        if (fallingState.isOf(FATechRebornBlocks.TUNGSTEN_ANVIL)) {
            return FATechRebornBlocks.CHIPPED_TUNGSTEN_ANVIL.getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else if (fallingState.isOf(FATechRebornBlocks.CHIPPED_TUNGSTEN_ANVIL)) {
            return FATechRebornBlocks.DAMAGED_TUNGSTEN_ANVIL.getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else return null;
    }

}
