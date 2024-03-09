package fr.firstmegagame4.fabricanvils.init.item;

import fr.firstmegagame4.fabricanvils.FabricAnvils;
import fr.firstmegagame4.fabricanvils.init.block.MinecraftBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FAItemGroup {

	private static final List<Item> ITEMS = new ArrayList<>();

	private static final RegistryKey<ItemGroup> FABRIC_ANVILS = RegistryKey.of(RegistryKeys.ITEM_GROUP, FabricAnvils.createId("anvils"));

	public static void registerItem(Item item) {
		Objects.requireNonNull(item, "item must not be null");

		ITEMS.add(item);
	}

	public static void registerItem(Block block) {
		Objects.requireNonNull(block, "block must not be null");

		registerItem(block.asItem());
	}

	public static void register() {
		Registry.register(Registries.ITEM_GROUP, FABRIC_ANVILS, FabricItemGroup.builder()
			.displayName(Text.literal("Fabric Anvils"))
			.icon(() -> MinecraftBlocks.BIRCH_ANVIL.get().getItem().getDefaultStack())
			.entries((context, entries) -> ITEMS.forEach(entries::add)).build()
		);
	}
}
