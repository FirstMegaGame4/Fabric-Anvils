package fr.firstmegagame4.fabricanvils;

import fr.firstmegagame4.fabricanvils.FA.Blocks.*;
import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import fr.firstmegagame4.fabricanvils.FA.Items.FAItemGroup;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class FabricAnvilsMain implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("fabricanvils");

	@Override
	public void onInitialize() {

		LOGGER.info("Fabric Anvils, by FirstMegaGame4");

		Arrays.stream(new BlocksInit[] {
				new MinecraftBlocks(),
				new BYGBlocks(),
				new TechRebornBlocks(),
				new CinderscapesBlocks(),
				new TerrestriaBlocks(),
				new TraverseBlocks(),
		}).forEach(blocks -> {if (FAUtils.isModLoaded(blocks.getModId())) blocks.init().register();});

		// No new items can be registered to the item group after this call.
		FAItemGroup.register();
	}
}
