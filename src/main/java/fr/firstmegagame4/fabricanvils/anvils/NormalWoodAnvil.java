package fr.firstmegagame4.fabricanvils.anvils;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.MapColor;
import net.minecraft.sound.BlockSoundGroup;

public class NormalWoodAnvil extends WoodenAnvil {
    public NormalWoodAnvil() {
        super(FabricBlockSettings.create().burnable().hardness(3.0F).mapColor(MapColor.OAK_TAN).sounds(BlockSoundGroup.WOOD));
    }
}
