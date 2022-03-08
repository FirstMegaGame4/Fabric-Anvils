package fr.firstmegagame4.fabricanvils.anvils;

import fr.firstmegagame4.fabricanvils.screenhandlers.CustomAnvilScreenHandler;
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

public class CopperAnvil extends AnvilBlock {

    private static final Text TITLE;

    public CopperAnvil(Settings settings) {
        super(settings);
    }

    public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
        world.playSound(null, pos, SoundEvents.BLOCK_COPPER_PLACE, SoundCategory.BLOCKS, 10F, 1F);
    }

    @Override
    public void onDestroyedOnLanding(World world, BlockPos pos, FallingBlockEntity fallingBlockEntity) {
        world.playSound(null, pos, SoundEvents.BLOCK_COPPER_PLACE, SoundCategory.BLOCKS, 10F, 1F);
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
        entity.setHurtEntities(1.75F, 30);
    }

    @Nullable
    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((syncId, inventory, player) -> new CustomAnvilScreenHandler(
                SoundEvents.BLOCK_COPPER_PLACE,
                SoundEvents.BLOCK_COPPER_BREAK,
                0.25F,
                syncId,
                inventory,
                ScreenHandlerContext.create(world, pos)),
                TITLE
        );
    }

    static {
        TITLE = new TranslatableText("container.repair");
    }

}
