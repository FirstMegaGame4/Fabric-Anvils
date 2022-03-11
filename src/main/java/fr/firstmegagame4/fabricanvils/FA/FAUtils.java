package fr.firstmegagame4.fabricanvils.FA;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FAUtils {

    public static String modIndentifier = "fabricanvils";

    public static void registerBlock(String blockId, BlockItem blockItem, Block block) {
        Identifier identifier = new Identifier(FAUtils.modIndentifier, blockId);
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, blockItem);
    }

    public static void registerAnvil(String blockId, BlockItem blockItem, Block block) {
        registerBlock(blockId, blockItem, block);
        // Add Dynamic FABRICANVILS Tag Assignment in the future
    }

}
