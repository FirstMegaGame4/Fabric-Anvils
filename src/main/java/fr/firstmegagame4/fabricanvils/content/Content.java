package fr.firstmegagame4.fabricanvils.content;

import fr.firstmegagame4.fabricanvils.init.FAUtils;
import fr.firstmegagame4.fabricanvils.anvil.CustomAnvil;

public interface Content {

    ContentHolder getHolder();

    default void registerModAnvil(String blockId, CustomAnvil block) {
        FAUtils.registerAnvil(this.getHolder().getModId(), blockId, block);
    }

    Content init();

    void register();

    void registerClient();
}
