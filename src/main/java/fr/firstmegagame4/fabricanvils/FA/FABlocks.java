package fr.firstmegagame4.fabricanvils.FA;

import fr.firstmegagame4.fabricanvils.FA.Blocks.FABYGBlocks;
import fr.firstmegagame4.fabricanvils.FA.Blocks.FAMinecraftBlocks;
import fr.firstmegagame4.fabricanvils.FA.Blocks.FATechRebornBlocks;

public class FABlocks {

    public static void registerMinecraftBlocks() {
        FAMinecraftBlocks.register();
    }

    public static void registerBYGBlocks() {
        FABYGBlocks.register();
    }

    public static void registerTechRebornBlocks() {
        FATechRebornBlocks.register();
    }

}
