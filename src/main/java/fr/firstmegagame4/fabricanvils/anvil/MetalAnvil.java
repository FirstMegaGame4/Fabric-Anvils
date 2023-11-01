package fr.firstmegagame4.fabricanvils.anvil;

import net.minecraft.block.BlockState;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MetalAnvil extends CustomAnvil {

    public static boolean destroyByFalling;

    public MetalAnvil(Settings settings) {
        super(settings.requiresTool());
    }

    public void damageAnvil(World world, BlockPos pos, FallingBlockEntity fallingBlockEntity, BlockState landingState) {
        if (landingState != null) {
            if (world.getBlockState(pos).isAir()) world.setBlockState(pos, landingState);
            else if (destroyByFalling) fallingBlockEntity.dropItem(fallingBlockEntity.getBlockState().getBlock());
        }
    }

}
