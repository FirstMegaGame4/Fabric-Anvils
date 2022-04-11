package fr.firstmegagame4.fabricanvils.anvils;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class NormalWoodAnvil extends WoodenAnvil {
    public NormalWoodAnvil() {
        super(FabricBlockSettings.of(Material.WOOD).hardness(3.0F).sounds(BlockSoundGroup.WOOD));
    }
}
