package fr.firstmegagame4.fabricanvils.FA;

import fr.firstmegagame4.fabricanvils.anvils.CustomAnvil;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FAUtils {

    public static String modIndentifier = "fabricanvils";

    public static Identifier FAIdentifier(String path) {
        return new Identifier(modIndentifier, path);
    }

    public static void setCutout(Block block) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
    }

    public static void setTranslucent(Block block) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getTranslucent());
    }

    public static void registerAnvil(String origin, String blockId, CustomAnvil block) {
        registerBlock(origin + "/" + blockId, block, block.getItem());
    }

    public static void registerBlock(String blockId, Block block, BlockItem blockItem) {
        Registry.register(Registry.BLOCK, FAIdentifier(blockId), block);
        Registry.register(Registry.ITEM, FAIdentifier(blockId), blockItem);
    }

}
