package fr.firstmegagame4.fabricanvils.plugin;

import fr.firstmegagame4.fabricanvils.AnvilItem;
import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import fr.firstmegagame4.fabricanvils.anvils.CustomAnvil;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.entry.EntryRegistry;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.plugin.client.BuiltinClientPlugin;
import net.minecraft.tag.BlockTags;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.registry.Registry;

public class FabricAnvilsClientPlugin implements REIClientPlugin {
    public static final CategoryIdentifier<DefaultAnvilInfoDisplay> ANVIL_INFO = CategoryIdentifier.of(FAUtils.FAIdentifier("plugin/anvil_information"));

    @Override
    public void registerCategories(CategoryRegistry registry) {
        EntryRegistry.getInstance().getEntryStacks().filter(
                entry -> (Registry.ITEM.get(entry.getIdentifier()) instanceof AnvilItem) || (Registry.BLOCK.get(entry.getIdentifier()).getDefaultState().isIn(BlockTags.ANVIL))
        ).forEach(entry -> BuiltinClientPlugin.getInstance().registerInformation(entry, new TranslatableText("plugin.fabricanvils.anvil_information"), components -> {
                assert entry.getIdentifier() != null;

                String[] anvilPath = entry.getIdentifier().getPath().split("/");
                String anvilId;
                if (anvilPath.length != 1) anvilId = anvilPath[1]; else anvilId = anvilPath[0];

                MutableText breakingChance = new TranslatableText("plugin.fabricanvils.anvil_information.breaking_chance");
                MutableText experienceLimit = new TranslatableText("plugin.fabricanvils.anvil_information.experience_limit");

                if (anvilId.startsWith("chipped")) components.add(new TranslatableText("plugin.fabricanvils.anvil_information.chipped_anvil"));
                else if (anvilId.startsWith("damaged")) components.add(new TranslatableText("plugin.fabricanvils.anvil_information.damaged_anvil"));
                else components.add(new TranslatableText("plugin.fabricanvils.anvil_information.intact_anvil"));

                if (Registry.ITEM.get(entry.getIdentifier()) instanceof AnvilItem anvilItem) {
                    CustomAnvil anvil = (CustomAnvil) anvilItem.getBlock();
                    components.add(breakingChance.append(Text.of(": " + ((int) anvil.getChanceBreak()*100) + "%")));
                    components.add(experienceLimit.append(Text.of(": " + anvil.getXPLimit())));
                }
                else {
                    components.add(breakingChance.append(Text.of(": 12%")));
                    components.add(experienceLimit.append(Text.of(": 40")));
                }

                return components;
        }));
    }
}
