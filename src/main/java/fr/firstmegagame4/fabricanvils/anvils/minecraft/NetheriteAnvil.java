package fr.firstmegagame4.fabricanvils.anvils.minecraft;

import fr.firstmegagame4.fabricanvils.FA.Blocks.FAMinecraftBlocks;
import fr.firstmegagame4.fabricanvils.anvils.AdvancedMetalAnvil;
import fr.firstmegagame4.fabricanvils.screenhandlers.minecraft.NetheriteAnvilScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class NetheriteAnvil extends AdvancedMetalAnvil {

    public NetheriteAnvil(Settings settings) {
        super(settings);
    }

    public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
        this.playLandingAnvilSound(world, pos, SoundEvents.BLOCK_NETHERITE_BLOCK_PLACE);
    }

    public void onDestroyedOnLanding(World world, BlockPos pos, FallingBlockEntity fallingBlockEntity) {
        this.playDestroyLandingAnvilSound(world, pos, SoundEvents.BLOCK_NETHERITE_BLOCK_PLACE);
        this.damageAnvil(world, pos, NetheriteAnvil.getLandingState(fallingBlockEntity.getBlockState()));
    }

    @Nullable
    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((syncId, inventory, player) -> new NetheriteAnvilScreenHandler(
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
        if (fallingState.isOf(FAMinecraftBlocks.NETHERITE_ANVIL)) {
            return FAMinecraftBlocks.CHIPPED_NETHERITE_ANVIL.getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else if (fallingState.isOf(FAMinecraftBlocks.CHIPPED_NETHERITE_ANVIL)) {
            return FAMinecraftBlocks.DAMAGED_NETHERITE_ANVIL.getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else return null;
    }

    @Override
    public SoundEvent getForgeSound() {
        return SoundEvents.BLOCK_NETHERITE_BLOCK_PLACE;
    }

    @Override
    public SoundEvent getBreakSound() {
        return SoundEvents.BLOCK_NETHERITE_BLOCK_BREAK;
    }

}
