package fr.firstmegagame4.fabricanvils.anvils;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MetalAnvil extends BaseAnvil {

    public MetalAnvil(Settings settings) {
        super(settings);
    }

    public void damageAnvil(World world, BlockPos pos, BlockState landingState) {
        if (landingState != null) world.setBlockState(pos, landingState);
    }

}
