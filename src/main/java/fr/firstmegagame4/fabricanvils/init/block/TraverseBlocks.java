package fr.firstmegagame4.fabricanvils.init.block;

import fr.firstmegagame4.fabricanvils.anvil.CustomAnvil;
import fr.firstmegagame4.fabricanvils.anvil.NormalWoodAnvil;
import fr.firstmegagame4.fabricanvils.content.Content;
import fr.firstmegagame4.fabricanvils.content.ContentHolder;

public class TraverseBlocks implements ContentHolder {

    @Override
    public String getModId() {
        return "traverse";
    }

    @Override
    public Content getContent() {
        return new TraverseContent(this);
    }

    public record TraverseContent(ContentHolder holder) implements Content {

        public static CustomAnvil FIR_ANVIL;

        @Override
        public ContentHolder getHolder() {
            return this.holder;
        }

        @Override
        public Content init() {
            FIR_ANVIL = new NormalWoodAnvil();

            return this;
        }

        @Override
        public void register() {
            this.registerModAnvil("fir_anvil", FIR_ANVIL);
        }

        @Override
        public void registerClient() {
        }
    }
}
