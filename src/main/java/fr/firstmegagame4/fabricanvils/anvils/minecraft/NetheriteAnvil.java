package fr.firstmegagame4.fabricanvils.anvils.minecraft;

import fr.firstmegagame4.fabricanvils.FA.Blocks.FAMinecraftBlocks;
import fr.firstmegagame4.fabricanvils.anvils.BaseAnvil;
import fr.firstmegagame4.fabricanvils.screenhandlers.minecraft.NetheriteAnvilScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class NetheriteAnvil extends BaseAnvil {

    public NetheriteAnvil(Settings settings) {
        super(settings);
    }

    public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
        world.playSound(null, pos, SoundEvents.BLOCK_NETHERITE_BLOCK_PLACE, SoundCategory.BLOCKS, 10F, 1F);
    }

    public void onDestroyedOnLanding(World world, BlockPos pos, FallingBlockEntity fallingBlockEntity) {
        world.playSound(null, pos, SoundEvents.BLOCK_NETHERITE_BLOCK_PLACE, SoundCategory.BLOCKS, 10F, 1F);
        BlockState newBlockState = NetheriteAnvil.getLandingState(fallingBlockEntity.getBlockState());
        if (newBlockState != null) world.setBlockState(pos, newBlockState);
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
        entity.setHurtEntities(3.0F, 50);
    }

    @Nullable
    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((syncId, inventory, player) -> new NetheriteAnvilScreenHandler(
                SoundEvents.BLOCK_NETHERITE_BLOCK_PLACE,
                SoundEvents.BLOCK_NETHERITE_BLOCK_BREAK,
                0.03F,
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

}
