package fr.firstmegagame4.fabricanvils.integration.rei.plugin;

import fr.firstmegagame4.fabricanvils.FabricAnvils;
import fr.firstmegagame4.fabricanvils.init.item.AnvilItem;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.entry.EntryRegistry;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;

import java.util.Collections;
import java.util.Objects;

public class FabricAnvilsClientPlugin implements REIClientPlugin {

	public static final CategoryIdentifier<DefaultAnvilInfoDisplay> ANVIL_INFO = CategoryIdentifier.of(FabricAnvils.createId("plugin/anvil_information"));

	@Override
	public void registerCategories(CategoryRegistry registry) {
		registry.add(new AnvilInfoCategory());
		registry.setPlusButtonArea(new AnvilInfoCategory().getCategoryIdentifier(), bounds -> new Rectangle(0, 0, 0, 0));
	}

	@Override
	public void registerDisplays(DisplayRegistry registry) {
		EntryRegistry.getInstance().getEntryStacks().filter(entry -> Registries.ITEM.get(entry.getIdentifier()) instanceof AnvilItem).forEach(
			entry -> {
				registry.add(new DefaultAnvilInfoDisplay(Collections.singletonList(Registries.ITEM.get(entry.getIdentifier()).getDefaultStack())));
				if (Objects.requireNonNull(entry.getIdentifier()).getPath().equals("minecraft/damaged_copper_anvil")) {
					for (Item item : new Item[]{Items.ANVIL, Items.CHIPPED_ANVIL, Items.DAMAGED_ANVIL}) {
						registry.add(new DefaultAnvilInfoDisplay(Collections.singletonList(item.getDefaultStack())));
					}
				}
			}
		);
	}
}
