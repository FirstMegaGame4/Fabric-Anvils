package fr.firstmegagame4.fabricanvils.anvil.techreborn;

import fr.firstmegagame4.fabricanvils.init.block.TechRebornBlocks;
import fr.firstmegagame4.fabricanvils.anvil.SuperiorMetalAnvil;
import fr.firstmegagame4.fabricanvils.screen.CustomAnvilScreenHandler;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ChromiumAnvil extends SuperiorMetalAnvil {

    public ChromiumAnvil() {
        super(FabricBlockSettings.create().mapColor(MapColor.LIGHT_GRAY).hardness(5.0F).sounds(BlockSoundGroup.METAL));
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
        if (fallingState.isOf(TechRebornBlocks.TechRebornContent.CHROMIUM_ANVIL)) {
            return TechRebornBlocks.TechRebornContent.CHIPPED_CHROMIUM_ANVIL.getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else if (fallingState.isOf(TechRebornBlocks.TechRebornContent.CHIPPED_CHROMIUM_ANVIL)) {
            return TechRebornBlocks.TechRebornContent.DAMAGED_CHROMIUM_ANVIL.getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else return null;
    }
}
