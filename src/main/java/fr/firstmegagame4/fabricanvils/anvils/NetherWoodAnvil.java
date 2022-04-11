package fr.firstmegagame4.fabricanvils.anvils;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class NetherWoodAnvil extends WoodenAnvil {
    public NetherWoodAnvil() {
        super(FabricBlockSettings.of(Material.NETHER_WOOD).hardness(3.0F).sounds(BlockSoundGroup.NETHER_STEM));
    }
}
