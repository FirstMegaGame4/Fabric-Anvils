package fr.firstmegagame4.fabricanvils.anvils;

import fr.firstmegagame4.fabricanvils.FA.FABlocks;
import fr.firstmegagame4.fabricanvils.screenhandlers.GoldenAnvilScreenHandler;
import net.minecraft.block.AnvilBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class GoldenAnvil extends AnvilBlock {

    private static final Text TITLE;

    public GoldenAnvil(Settings settings) {
        super(settings);
    }

    public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
        world.playSound(null, pos, SoundEvents.BLOCK_STONE_PLACE, SoundCategory.BLOCKS, 10F, 1F);
    }

    @Override
    public void onDestroyedOnLanding(World world, BlockPos pos, FallingBlockEntity fallingBlockEntity) {
        world.playSound(null, pos, SoundEvents.BLOCK_STONE_PLACE, SoundCategory.BLOCKS, 10F, 1F);
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
        entity.setHurtEntities(1.50F, 30);
    }

    @Nullable
    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((syncId, inventory, player) -> new GoldenAnvilScreenHandler(
                SoundEvents.BLOCK_STONE_PLACE,
                SoundEvents.BLOCK_STONE_BREAK,
                0.40F,
                syncId,
                inventory,
                ScreenHandlerContext.create(world, pos)),
                TITLE
        );
    }

    @Nullable
    public static BlockState getLandingState(BlockState fallingState) {
        if (fallingState.isOf(FABlocks.GOLDEN_ANVIL)) {
            return FABlocks.DAMAGED_GOLDEN_ANVIL.getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else return null;
    }

    static {
        TITLE = new TranslatableText("container.repair");
    }

}
