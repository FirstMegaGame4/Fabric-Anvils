package fr.firstmegagame4.fabricanvils.anvils.minecraft;

import fr.firstmegagame4.fabricanvils.FA.Blocks.FAMinecraftBlocks;
import fr.firstmegagame4.fabricanvils.anvils.BaseAnvil;
import fr.firstmegagame4.fabricanvils.screenhandlers.minecraft.GoldenAnvilScreenHandler;
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

public class GoldenAnvil extends BaseAnvil {

    public GoldenAnvil(Settings settings) {
        super(settings);
    }

    public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
        world.playSound(null, pos, SoundEvents.BLOCK_METAL_PLACE, SoundCategory.BLOCKS, 10F, 1F);
    }

    @Override
    public void onDestroyedOnLanding(World world, BlockPos pos, FallingBlockEntity fallingBlockEntity) {
        world.playSound(null, pos, SoundEvents.BLOCK_METAL_PLACE, SoundCategory.BLOCKS, 10F, 1F);
        BlockState newBlockState = GoldenAnvil.getLandingState(fallingBlockEntity.getBlockState());
        if (newBlockState != null) world.setBlockState(pos, newBlockState);
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
        entity.setHurtEntities(1.50F, 30);
    }

    @Nullable
    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((syncId, inventory, player) -> new GoldenAnvilScreenHandler(
                SoundEvents.BLOCK_METAL_PLACE,
                SoundEvents.BLOCK_METAL_BREAK,
                1F,
                syncId,
                inventory,
                ScreenHandlerContext.create(world, pos)),
                TITLE
        );
    }

    @Nullable
    public static BlockState getLandingState(BlockState fallingState) {
        if (fallingState.isOf(FAMinecraftBlocks.GOLDEN_ANVIL)) {
            return FAMinecraftBlocks.DAMAGED_GOLDEN_ANVIL.getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else return null;
    }

}
