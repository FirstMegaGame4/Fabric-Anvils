package fr.firstmegagame4.fabricanvils.init.block;

import fr.firstmegagame4.fabricanvils.anvil.CustomAnvil;
import fr.firstmegagame4.fabricanvils.anvil.NetherWoodAnvil;
import fr.firstmegagame4.fabricanvils.content.Content;
import fr.firstmegagame4.fabricanvils.content.ContentHolder;

public class CinderscapesBlocks implements ContentHolder {

    @Override
    public String getModId() {
        return "cinderscapes";
    }

    @Override
    public Content getContent() {
        return new CinderscapesContent(this);
    }

    public record CinderscapesContent(ContentHolder holder) implements Content {

        public static CustomAnvil SCORCHED_ANVIL;
        public static CustomAnvil UMBRAL_ANVIL;

        @Override
        public ContentHolder getHolder() {
            return this.holder;
        }

        @Override
        public Content init() {
            SCORCHED_ANVIL = new NetherWoodAnvil();
            UMBRAL_ANVIL = new NetherWoodAnvil();

            return this;
        }

        @Override
        public void register() {
            this.registerModAnvil("scorched_anvil", SCORCHED_ANVIL);
            this.registerModAnvil("umbral_anvil", UMBRAL_ANVIL);
        }

        @Override
        public void registerClient() {
        }
    }
}
