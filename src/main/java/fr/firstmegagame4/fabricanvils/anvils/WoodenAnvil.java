package fr.firstmegagame4.fabricanvils.anvils;

import fr.firstmegagame4.fabricanvils.screenhandlers.WoodenAnvilScreenHandler;
import net.minecraft.block.*;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class WoodenAnvil extends BaseAnvil {

    public WoodenAnvil(Settings settings) {
        super(settings);
    }

    public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
        this.playLandingAnvilSound(world, pos, SoundEvents.BLOCK_WOOD_PLACE);
    }

    public void onDestroyedOnLanding(World world, BlockPos pos, FallingBlockEntity fallingBlockEntity) {
        this.playDestroyLandingAnvilSound(world, pos, SoundEvents.BLOCK_WOOD_PLACE);
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
        entity.setHurtEntities(1.0F, 20);
    }

    @Nullable
    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((syncId, inventory, player) -> new WoodenAnvilScreenHandler(
                this.getForgeSound(),
                this.getBreakSound(),
                this.getChanceBreak(),
                syncId,
                inventory,
                ScreenHandlerContext.create(world, pos)),
                TITLE
        );
    }

    public SoundEvent getForgeSound() {
        return SoundEvents.BLOCK_WOOD_PLACE;
    }

    public SoundEvent getBreakSound() {
        return SoundEvents.BLOCK_WOOD_BREAK;
    }

    public float getChanceBreak() {
        return 1.00F;
    }
}
