package fr.firstmegagame4.fabricanvils.init.item;

import fr.firstmegagame4.fabricanvils.FabricAnvils;
import fr.firstmegagame4.fabricanvils.init.block.MinecraftBlocks;
import fr.firstmegagame4.fabricanvils.init.FAUtils;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class FAItemGroup {

	private static final Set<Item> ITEMS = new HashSet<>();

	private static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, FabricAnvils.createId("anvils"));

	public static void registerItem(Item item) {
		Objects.requireNonNull(item, "item must not be null");

		ITEMS.add(item);
	}

	public static void registerItem(Block block) {
		Objects.requireNonNull(block, "block must not be null");

		registerItem(block.asItem());
	}

	public static void register() {
		Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
			.displayName(Text.literal("Fabric Anvils"))
			.icon(() -> MinecraftBlocks.BIRCH_ANVIL.get().asItem().getDefaultStack())
			.entries((context, entries) -> {
				ITEMS.stream().sorted(Comparator.comparing((item) -> item.getName().getString())).forEach(entries::add);
			}).build()
		);
	}
}
