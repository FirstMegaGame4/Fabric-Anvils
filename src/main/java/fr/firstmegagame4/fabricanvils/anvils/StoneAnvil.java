package fr.firstmegagame4.fabricanvils.anvils;

import fr.firstmegagame4.fabricanvils.screenhandlers.CustomAnvilScreenHandler;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class StoneAnvil extends CustomAnvil {

    public StoneAnvil() {
        super(FabricBlockSettings.of(Material.STONE).hardness(3.0F).sounds(BlockSoundGroup.STONE).requiresTool());
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
        entity.setHurtEntities(1.50F, 30);
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
        return SoundEvents.BLOCK_STONE_PLACE;
    }

    public SoundEvent getBreakSound() {
        return SoundEvents.BLOCK_STONE_BREAK;
    }

    public float getChanceBreak() {
        return 0.40F;
    }

    public int getXPLimit() {
        return 20;
    }

}
