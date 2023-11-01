package fr.firstmegagame4.fabricanvils.init.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class AnvilItem extends BlockItem {
    public AnvilItem(Block block) {
        super(block, new FabricItemSettings());
    }
}
