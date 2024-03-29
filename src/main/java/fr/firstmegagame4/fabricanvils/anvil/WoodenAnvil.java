package fr.firstmegagame4.fabricanvils.anvil;

import fr.firstmegagame4.fabricanvils.screen.CustomAnvilScreenHandler;
import net.minecraft.block.*;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class WoodenAnvil extends CustomAnvil {

    public WoodenAnvil(Settings settings) {
        super(settings);
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
        entity.setHurtEntities(1.0F, 20);
    }

    @Nullable
    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((syncId, inventory, player) -> new CustomAnvilScreenHandler(
                this,
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

    public float getDamagingChance() {
        return 1.00F;
    }

    public int getXPLimit() {
        return 10;
    }

}
