package fr.firstmegagame4.fabricanvils.integration.rei.plugin;

import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DefaultAnvilInfoDisplay extends BasicDisplay {

    public DefaultAnvilInfoDisplay(List<ItemStack> entries) {
        this(Collections.emptyList(), Collections.singletonList(EntryIngredients.ofItemStacks(entries)));
    }

    public DefaultAnvilInfoDisplay(List<EntryIngredient> inputs, List<EntryIngredient> outputs) {
        this(inputs, outputs, Optional.of(FabricAnvilsClientPlugin.ANVIL_INFO.getIdentifier()));
    }

    public DefaultAnvilInfoDisplay(List<EntryIngredient> inputs, List<EntryIngredient> outputs, Optional<Identifier> location) {
        super(inputs, outputs, location);
    }

    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return FabricAnvilsClientPlugin.ANVIL_INFO;
    }

    public EntryIngredient getEntries() {
        return this.getOutputEntries().get(0);
    }

}
