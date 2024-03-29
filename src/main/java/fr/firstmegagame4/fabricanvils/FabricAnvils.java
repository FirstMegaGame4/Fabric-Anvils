package fr.firstmegagame4.fabricanvils;

import fr.firstmegagame4.fabricanvils.content.FAContentHandler;
import fr.firstmegagame4.fabricanvils.init.block.*;
import fr.firstmegagame4.fabricanvils.init.item.FAItemGroup;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricAnvils implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("fabricanvils");

	@Override
	public void onInitialize() {
		LOGGER.info("Fabric Anvils, by FirstMegaGame4");

		FAContentHandler.registerContentHolder(new MinecraftBlocks());

		FAContentHandler.registerModIntegrationContentHandlers(handler -> {
			// handler.put(new BYGBlocks()); Isn't available for 1.20.1 ATM.
			handler.put(new TechRebornBlocks());
			handler.put(new CinderscapesBlocks());
			handler.put(new TerrestriaBlocks());
			handler.put(new TraverseBlocks());
		});

		FAContentHandler.init();

		// No new items can be registered to the item group after this call.
		FAItemGroup.register();
	}

	public static String id() {
		return "fabricanvils";
	}

	public static Identifier createId(String path) {
		return new Identifier(FabricAnvils.id(), path);
	}
}
