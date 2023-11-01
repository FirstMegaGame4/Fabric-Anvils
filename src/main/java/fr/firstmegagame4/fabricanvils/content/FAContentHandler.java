package fr.firstmegagame4.fabricanvils.content;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FAContentHandler {

    private static final List<ContentHolder> CONTENTS = new ArrayList<>();

    public static void registerContentHolder(ContentHolder holder) {
        FAContentHandler.CONTENTS.add(holder);
    }

    public static void registerModIntegrationContents(Consumer<ModIntegrationContentHandler> handler) {
        handler.accept(new ModIntegrationContentHandler());
    }

    public static void init() {
        FAContentHandler.CONTENTS.stream()
            .filter(holder -> FabricLoader.getInstance().isModLoaded(holder.getModId()))
            .forEach(holder -> holder.getContent().init().register());
    }

    @Environment(EnvType.CLIENT)
    public static void initClient() {
        FAContentHandler.CONTENTS.stream()
            .filter(holder -> FabricLoader.getInstance().isModLoaded(holder.getModId()))
            .forEach(holder -> holder.getContent().registerClient());
    }

    public static class ModIntegrationContentHandler {

        private ModIntegrationContentHandler() {
            super();
        }

        public void put(ContentHolder holder) {
            FAContentHandler.registerContentHolder(holder);
        }
    }
}
