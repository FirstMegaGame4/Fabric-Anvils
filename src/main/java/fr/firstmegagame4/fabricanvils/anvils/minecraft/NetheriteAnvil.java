package fr.firstmegagame4.fabricanvils.anvils.minecraft;

import fr.firstmegagame4.fabricanvils.FA.Blocks.MinecraftBlocks;
import fr.firstmegagame4.fabricanvils.anvils.AdvancedMetalAnvil;
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

public class NetheriteAnvil extends AdvancedMetalAnvil {

    public NetheriteAnvil() {
        super(FabricBlockSettings.of(Material.METAL).strength(50.0F, 1200F).sounds(BlockSoundGroup.NETHERITE));
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
        if (fallingState.isOf(MinecraftBlocks.NETHERITE_ANVIL)) {
            return MinecraftBlocks.CHIPPED_NETHERITE_ANVIL.getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else if (fallingState.isOf(MinecraftBlocks.CHIPPED_NETHERITE_ANVIL)) {
            return MinecraftBlocks.DAMAGED_NETHERITE_ANVIL.getDefaultState().with(FACING, fallingState.get(FACING));
        }
        else return null;
    }

    @Override
    public SoundEvent getForgeSound() {
        return SoundEvents.BLOCK_NETHERITE_BLOCK_PLACE;
    }

    @Override
    public SoundEvent getBreakSound() {
        return SoundEvents.BLOCK_NETHERITE_BLOCK_BREAK;
    }

}
