package fr.firstmegagame4.fabricanvils;

import fr.firstmegagame4.fabricanvils.FA.FABlocks;
import fr.firstmegagame4.fabricanvils.FA.FATags;
import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricAnvilsMain implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("fabricanvils");
	public static final ItemGroup FABRICANVILS_GROUP = FabricItemGroupBuilder.build(
			new Identifier(FAUtils.modIndentifier, "anvils"),
			() -> new ItemStack(FABlocks.BIRCH_ANVIL_ITEM)
	);

	@Override
	public void onInitialize() {
		LOGGER.info("Fabric Anvils, by FirstMegaGame4");

		registerAnvil("oak_anvil", FABlocks.OAK_ANVIL_ITEM, FABlocks.OAK_ANVIL);
		registerAnvil("spruce_anvil", FABlocks.SPRUCE_ANVIL_ITEM, FABlocks.SPRUCE_ANVIL);
		registerAnvil("birch_anvil", FABlocks.BIRCH_ANVIL_ITEM, FABlocks.BIRCH_ANVIL);
		registerAnvil("jungle_anvil", FABlocks.JUNGLE_ANVIL_ITEM, FABlocks.JUNGLE_ANVIL);
		registerAnvil("acacia_anvil", FABlocks.ACACIA_ANVIL_ITEM, FABlocks.ACACIA_ANVIL);
		registerAnvil("dark_oak_anvil", FABlocks.DARK_OAK_ANVIL_ITEM, FABlocks.DARK_OAK_ANVIL);
		registerAnvil("crimson_anvil", FABlocks.CRIMSON_ANVIL_ITEM, FABlocks.CRIMSON_ANVIL);
		registerAnvil("warped_anvil", FABlocks.WARPED_ANVIL_ITEM, FABlocks.WARPED_ANVIL);

		registerAnvil("stone_anvil", FABlocks.STONE_ANVIL_ITEM, FABlocks.STONE_ANVIL);

		registerAnvil("golden_anvil", FABlocks.GOLDEN_ANVIL_ITEM, FABlocks.GOLDEN_ANVIL);
		registerAnvil("damaged_golden_anvil", FABlocks.DAMAGED_GOLDEN_ANVIL_ITEM, FABlocks.DAMAGED_GOLDEN_ANVIL);

		registerAnvil("copper_anvil", FABlocks.COPPER_ANVIL_ITEM, FABlocks.COPPER_ANVIL);

		registerAnvil("diamond_anvil", FABlocks.DIAMOND_ANVIL_ITEM, FABlocks.DIAMOND_ANVIL);
		registerAnvil("chipped_diamond_anvil", FABlocks.CHIPPED_DIAMOND_ANVIL_ITEM, FABlocks.CHIPPED_DIAMOND_ANVIL);
		registerAnvil("damaged_diamond_anvil", FABlocks.DAMAGED_DIAMOND_ANVIL_ITEM, FABlocks.DAMAGED_DIAMOND_ANVIL);

		registerAnvil("netherite_anvil", FABlocks.NETHERITE_ANVIL_ITEM, FABlocks.NETHERITE_ANVIL);
		registerAnvil("chipped_netherite_anvil", FABlocks.CHIPPED_NETHERITE_ANVIL_ITEM, FABlocks.CHIPPED_NETHERITE_ANVIL);
		registerAnvil("damaged_netherite_anvil", FABlocks.DAMAGED_NETHERITE_ANVIL_ITEM, FABlocks.DAMAGED_NETHERITE_ANVIL);
	}

	public void registerBlock(String blockId, BlockItem blockItem, Block block) {
		Identifier identifier = new Identifier(FAUtils.modIndentifier, blockId);
		Registry.register(Registry.BLOCK, identifier, block);
		Registry.register(Registry.ITEM, identifier, blockItem);
	}

	public void registerAnvil(String blockId, BlockItem blockItem, Block block) {
		registerBlock(blockId, blockItem, block);
		// Add Dynamic FABRICANVILS Tag Assignment in the future
	}

}
