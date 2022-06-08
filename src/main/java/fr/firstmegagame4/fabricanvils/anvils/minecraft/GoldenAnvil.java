package fr.firstmegagame4.fabricanvils.anvils.minecraft;

import fr.firstmegagame4.fabricanvils.FA.Blocks.MinecraftBlocks;
import fr.firstmegagame4.fabricanvils.anvils.FragileMetalAnvil;
import fr.firstmegagame4.fabricanvils.screenhandlers.CustomAnvilScreenHandler;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class GoldenAnvil extends FragileMetalAnvil {

    public GoldenAnvil() {
        super(FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.METAL).hardness(4.0F));
    }

    public void onDestroyedOnLanding(World world, BlockPos pos, FallingBlockEntity fallingBlockEntity) {
        super.onDestroyedOnLanding(world, pos, fallingBlockEntity);
        this.damageAnvil(world, pos, fallingBlockEntity, this.getStateOnLanding(fallingBlockEntity.getBlockState()));
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

    @Nullable
    public BlockState getStateOnLanding(BlockState fallingState) {
        if (fallingState.isOf(MinecraftBlocks.GOLDEN_ANVIL)) {
            return MinecraftBlocks.DAMAGED_GOLDEN_ANVIL.getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else return null;
    }

}
