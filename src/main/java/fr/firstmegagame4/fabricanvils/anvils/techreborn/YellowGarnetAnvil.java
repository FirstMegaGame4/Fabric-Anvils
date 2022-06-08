package fr.firstmegagame4.fabricanvils.anvils.techreborn;

import fr.firstmegagame4.fabricanvils.FA.Blocks.TechRebornBlocks;
import fr.firstmegagame4.fabricanvils.anvils.InferiorMetalAnvil;
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

public class YellowGarnetAnvil extends InferiorMetalAnvil {

    public YellowGarnetAnvil() {
        super(FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.METAL).hardness(5.0F));
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
        if (fallingState.isOf(TechRebornBlocks.YELLOW_GARNET_ANVIL)) {
            return TechRebornBlocks.CHIPPED_YELLOW_GARNET_ANVIL.getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else if (fallingState.isOf(TechRebornBlocks.CHIPPED_YELLOW_GARNET_ANVIL)) {
            return TechRebornBlocks.DAMAGED_YELLOW_GARNET_ANVIL.getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else return null;
    }

}
