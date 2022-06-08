package fr.firstmegagame4.fabricanvils.anvils;

import fr.firstmegagame4.fabricanvils.AnvilItem;
import net.minecraft.block.AnvilBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class CustomAnvil extends AnvilBlock {

    protected static final Text TITLE;

    protected final AnvilItem blockItem;

    public CustomAnvil(Settings settings) {
        super(settings);
        this.blockItem = new AnvilItem(this);
    }

    public AnvilItem getItem() {
        return this.blockItem;
    }

    public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
        this.playLandingAnvilSound(world, pos, this.getSoundGroup(fallingBlockState).getPlaceSound());
    }

    public void onDestroyedOnLanding(World world, BlockPos pos, FallingBlockEntity fallingBlockEntity) {
        this.playDestroyLandingAnvilSound(world, pos, this.getSoundGroup(fallingBlockEntity.getBlockState()).getBreakSound());
    }

    protected void playLandingAnvilSound(World world, BlockPos pos, SoundEvent soundEvent) {
        world.playSound(null, pos, soundEvent, SoundCategory.BLOCKS, 10F, 1F);
    }

    protected void playDestroyLandingAnvilSound(World world, BlockPos pos, SoundEvent soundEvent) {
        world.playSound(null, pos, soundEvent, SoundCategory.BLOCKS, 25F, 1F);
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
        entity.setHurtEntities(2.0F, 40);
    }

    public SoundEvent getForgeSound() {
        return SoundEvents.BLOCK_METAL_PLACE;
    }

    public SoundEvent getBreakSound() {
        return SoundEvents.BLOCK_METAL_BREAK;
    }

    public float getDamagingChance() {
        return 0.12F;
    }

    public int getXPLimit() {
        return 40;
    }

    @Nullable
    public BlockState getStateOnLanding(BlockState fallingState) {
        return AnvilBlock.getLandingState(fallingState);
    }

    @Deprecated
    public static BlockState getLandingState(BlockState state) {
        return AnvilBlock.getLandingState(state);
    }

    static {
        TITLE = Text.translatable("container.repair");
    }

}
