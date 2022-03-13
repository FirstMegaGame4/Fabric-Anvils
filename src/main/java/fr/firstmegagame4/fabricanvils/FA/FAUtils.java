package fr.firstmegagame4.fabricanvils.FA;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

public class FAUtils {

    public static String modIndentifier = "fabricanvils";

    public static Identifier FAIdentifier(String path) {
        return new Identifier(modIndentifier, path);
    }

    public static void registerBlock(String blockId, BlockItem blockItem, Block block) {
        Registry.register(Registry.BLOCK, FAIdentifier(blockId), block);
        Registry.register(Registry.ITEM, FAIdentifier(blockId), blockItem);
    }

    public static void registerAnvil(String origin, String blockId, BlockItem blockItem, Block block) {
        registerBlock(origin + "/" + blockId, blockItem, block);
    }

}
