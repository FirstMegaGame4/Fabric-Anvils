package fr.firstmegagame4.fabricanvils.FA;

import fr.firstmegagame4.fabricanvils.FA.Blocks.FABYGBlocks;
import fr.firstmegagame4.fabricanvils.FA.Blocks.FAMinecraftBlocks;
import fr.firstmegagame4.fabricanvils.FA.Blocks.FATechRebornBlocks;

public class FARenderLayers {

    public static void registerMinecraftRenderLayers() {
        FAMinecraftBlocks.registerRenderLayers();
    }

    public static void registerBYGRenderLayers() {
        FABYGBlocks.registerRenderLayers();
    }

    public static void registerTechRebornRenderLayers() {
        FATechRebornBlocks.registerRenderLayers();
    }

}
