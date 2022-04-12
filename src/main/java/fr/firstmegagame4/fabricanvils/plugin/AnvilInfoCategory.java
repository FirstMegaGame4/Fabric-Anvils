package fr.firstmegagame4.fabricanvils.plugin;

import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

public class AnvilInfoCategory implements DisplayCategory {
    @Override
    public Renderer getIcon() {
        return EntryStacks.of(Items.ANVIL);
    }

    @Override
    public Text getTitle() {
        return new TranslatableText("category.fabricanvils.anvil_information");
    }

    @Override
    public CategoryIdentifier getCategoryIdentifier() {
        return CategoryIdentifier.of(FAUtils.FAIdentifier("anvil_information"));
    }
}
