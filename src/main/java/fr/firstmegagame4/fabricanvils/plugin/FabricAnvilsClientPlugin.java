package fr.firstmegagame4.fabricanvils.plugin;

import fr.firstmegagame4.fabricanvils.AnvilItem;
import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.entry.EntryRegistry;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import net.minecraft.util.registry.Registry;

import java.util.Collections;

public class FabricAnvilsClientPlugin implements REIClientPlugin {
    public static final CategoryIdentifier<DefaultAnvilInfoDisplay> ANVIL_INFO = CategoryIdentifier.of(FAUtils.FAIdentifier("plugin/anvil_information"));

    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new AnvilInfoCategory());
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        EntryRegistry.getInstance().getEntryStacks().filter(entry -> Registry.ITEM.get(entry.getIdentifier()) instanceof AnvilItem).forEach(
            entry -> registry.add(new DefaultAnvilInfoDisplay(Collections.singletonList(Registry.ITEM.get(entry.getIdentifier()).getDefaultStack())))
        );
    }
}
