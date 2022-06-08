package fr.firstmegagame4.fabricanvils.FA.Blocks;

import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import fr.firstmegagame4.fabricanvils.anvils.CustomAnvil;

public interface BlocksInit {

    String getModId();

    default void registerModAnvil(String blockId, CustomAnvil block) {
        FAUtils.registerAnvil(this.getModId(), blockId, block);
    }

    BlocksInit init();

    void register();

    void registerClient();
}
