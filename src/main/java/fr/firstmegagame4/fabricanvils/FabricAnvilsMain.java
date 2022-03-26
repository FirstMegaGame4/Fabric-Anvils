package fr.firstmegagame4.fabricanvils;

import fr.firstmegagame4.fabricanvils.FA.Blocks.FAMinecraftBlocks;
import fr.firstmegagame4.fabricanvils.FA.FABlocks;
import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricAnvilsMain implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("fabricanvils");
	public static final ItemGroup FABRICANVILS_GROUP = FabricItemGroupBuilder.build(
			new Identifier(FAUtils.modIndentifier, "anvils"),
			() -> new ItemStack(FAMinecraftBlocks.BIRCH_ANVIL_ITEM)
	);

	@Override
	public void onInitialize() {

		LOGGER.info("Fabric Anvils, by FirstMegaGame4");

		FABlocks.registerMinecraftBlocks();

		if (FabricLoader.getInstance().isModLoaded("byg")) FABlocks.registerBYGBlocks();

		if (FabricLoader.getInstance().isModLoaded("techreborn")) FABlocks.registerTechRebornBlocks();

	}

}
