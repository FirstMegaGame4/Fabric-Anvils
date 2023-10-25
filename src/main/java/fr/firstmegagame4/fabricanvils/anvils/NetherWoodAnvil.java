package fr.firstmegagame4.fabricanvils.anvils;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.MapColor;
import net.minecraft.sound.BlockSoundGroup;

public class NetherWoodAnvil extends WoodenAnvil {
    public NetherWoodAnvil() {
        super(FabricBlockSettings.create().hardness(3.0F).mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.NETHER_STEM));
    }
}
