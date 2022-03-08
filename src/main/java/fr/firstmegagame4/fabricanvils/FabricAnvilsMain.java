package fr.firstmegagame4.fabricanvils;

import fr.firstmegagame4.fabricanvils.FA.FABlocks;
import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricAnvilsMain implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("fabricanvils");
	public static final ItemGroup FABRICANVILS_GROUP = FabricItemGroupBuilder.build(
			new Identifier(FAUtils.modIndentifier, "anvils"),
			() -> new ItemStack(FABlocks.OAK_ANVIL_ITEM)
	);

	@Override
	public void onInitialize() {

		LOGGER.info("___ Fabric Anvils ___");

		registerBlock("oak_anvil", FABlocks.OAK_ANVIL_ITEM, FABlocks.OAK_ANVIL);
		registerBlock("spruce_anvil", FABlocks.SPRUCE_ANVIL_ITEM, FABlocks.SPRUCE_ANVIL);
		registerBlock("birch_anvil", FABlocks.BIRCH_ANVIL_ITEM, FABlocks.BIRCH_ANVIL);
		registerBlock("jungle_anvil", FABlocks.JUNGLE_ANVIL_ITEM, FABlocks.JUNGLE_ANVIL);
		registerBlock("acacia_anvil", FABlocks.ACACIA_ANVIL_ITEM, FABlocks.ACACIA_ANVIL);
		registerBlock("dark_oak_anvil", FABlocks.DARK_OAK_ANVIL_ITEM, FABlocks.DARK_OAK_ANVIL);
		registerBlock("crimson_anvil", FABlocks.CRIMSON_ANVIL_ITEM, FABlocks.CRIMSON_ANVIL);
		registerBlock("warped_anvil", FABlocks.WARPED_ANVIL_ITEM, FABlocks.WARPED_ANVIL);

		registerBlock("stone_anvil", FABlocks.STONE_ANVIL_ITEM, FABlocks.STONE_ANVIL);
		registerBlock("golden_anvil", FABlocks.GOLDEN_ANVIL_ITEM, FABlocks.GOLDEN_ANVIL);
		registerBlock("damaged_golden_anvil", FABlocks.DAMAGED_GOLDEN_ANVIL_ITEM, FABlocks.DAMAGED_GOLDEN_ANVIL);

		registerBlock("copper_anvil", FABlocks.COPPER_ANVIL_ITEM, FABlocks.COPPER_ANVIL);

	}

	public void registerItem(String itemId, Item item) {
		Registry.register(Registry.ITEM, new Identifier(FAUtils.modIndentifier, itemId), item);
	}

	public void registerBlock(String blockId, BlockItem blockItem, Block block) {
		Registry.register(Registry.BLOCK, new Identifier(FAUtils.modIndentifier, blockId), block);
		Registry.register(Registry.ITEM, new Identifier(FAUtils.modIndentifier, blockId), blockItem);
	}

}
