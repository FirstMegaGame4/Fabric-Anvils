package fr.firstmegagame4.fabricanvils.plugin;

import fr.firstmegagame4.fabricanvils.AnvilItem;
import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import fr.firstmegagame4.fabricanvils.anvils.CustomAnvil;
import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.entry.EntryStack;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.item.Items;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.registry.Registry;
import org.apache.commons.compress.utils.Lists;

import java.util.List;
import java.util.Objects;

public class AnvilInfoCategory implements DisplayCategory<DefaultAnvilInfoDisplay> {
    @Override
    public Renderer getIcon() {
        return EntryStacks.of(Items.ANVIL);
    }

    @Override
    public Text getTitle() {
        return new TranslatableText("plugin.fabricanvils.anvil_information");
    }

    @Override
    public CategoryIdentifier<DefaultAnvilInfoDisplay> getCategoryIdentifier() {
        return CategoryIdentifier.of(FAUtils.FAIdentifier("plugin/anvil_information"));
    }

    @Override
    public int getMaximumDisplaysPerPage() {
        return 1;
    }

    @Override
    public int getDisplayHeight() {
        return 56*2+2;
    }

    @Override
    public int getDisplayWidth(DefaultAnvilInfoDisplay display) {
        return 180;
    }

    @Override
    public List<Widget> setupDisplay(DefaultAnvilInfoDisplay display, Rectangle bounds) {
        List<Widget> widgets = Lists.newArrayList();

        EntryStack<?> entry = display.getEntries().get(0);

        AnvilItem anvilItem = (AnvilItem) Registry.ITEM.get(display.getEntries().get(0).getIdentifier());
        CustomAnvil anvil = (CustomAnvil) anvilItem.getBlock();

        CustomAnvil nextAnvilBlock = FAUtils.nextAnvil(anvil);
        CustomAnvil previousAnvilBlock = FAUtils.previousAnvil(anvil);

        String[] anvilPath = Objects.requireNonNull(entry.getIdentifier()).getPath().split("/");
        String anvilId;
        if (anvilPath.length != 1) anvilId = anvilPath[1]; else anvilId = anvilPath[0];

        MutableText breakingChance = new TranslatableText("plugin.fabricanvils.anvil_information.breaking_chance");
        MutableText experienceLimit = new TranslatableText("plugin.fabricanvils.anvil_information.experience_limit");

        Point point = new Point(bounds.x + 8, bounds.y + 8);

        Point anvilStatesPoint = new Point(bounds.getCenterX(), point.y - 2);
        Point anvilSlotPoint = new Point(anvilStatesPoint.x - 10, anvilStatesPoint.y + 18);
        Point previousAnvilArrowPoint = new Point(anvilSlotPoint.x - 38, anvilSlotPoint.y);
        Point previousAnvilSlotPoint = new Point(previousAnvilArrowPoint.x - 24, previousAnvilArrowPoint.y);
        Point nextAnvilArrowPoint = new Point(anvilSlotPoint.x + 28, anvilSlotPoint.y);
        Point nextAnvilSlotPoint = new Point(nextAnvilArrowPoint.x + 34, nextAnvilArrowPoint.y);

        widgets.add(Widgets.createRecipeBase(new Rectangle(bounds.x, bounds.y, bounds.width, bounds.height/2-2)));

        widgets.add(Widgets.createLabel(anvilStatesPoint, new TranslatableText("plugin.fabricanvils.anvil_information.anvil_states")));

        widgets.add(Widgets.createResultSlotBackground(anvilSlotPoint));
        widgets.add(Widgets.createSlot(anvilSlotPoint).disableBackground().entry(EntryStacks.of(anvilItem)));

        if (previousAnvilBlock != null) {
            widgets.add(Widgets.createArrow(previousAnvilArrowPoint));
            widgets.add(Widgets.createSlot(previousAnvilSlotPoint).entry(EntryStacks.of(previousAnvilBlock.getItem())));
        }

        if (nextAnvilBlock != null) {
            widgets.add(Widgets.createArrow(nextAnvilArrowPoint));
            widgets.add(Widgets.createSlot(nextAnvilSlotPoint).entry(EntryStacks.of(nextAnvilBlock.getItem())));
        }

        widgets.add(Widgets.createRecipeBase(new Rectangle(bounds.x, bounds.y + 58, bounds.width, bounds.height/2-2)));

        Point anvilStatusPoint = new Point(point.x, anvilSlotPoint.y + 42);
        Point breakingChancePoint = new Point(point.x, anvilStatusPoint.y + 16);
        Point experienceLimitPoint = new Point(point.x, breakingChancePoint.y + 16);

        if (anvilId.startsWith("chipped")) widgets.add(Widgets.createLabel(anvilStatusPoint, new TranslatableText("plugin.fabricanvils.anvil_information.chipped_anvil")).leftAligned());
        else if (anvilId.startsWith("damaged")) widgets.add(Widgets.createLabel(anvilStatusPoint, new TranslatableText("plugin.fabricanvils.anvil_information.damaged_anvil")).leftAligned());
        else widgets.add(Widgets.createLabel(anvilStatusPoint, new TranslatableText("plugin.fabricanvils.anvil_information.intact_anvil")).leftAligned());

        widgets.add(Widgets.createLabel(breakingChancePoint, breakingChance.append(Text.of(": " + (anvil.getChanceBreak() * 100) + "%"))).leftAligned());
        widgets.add(Widgets.createLabel(experienceLimitPoint, experienceLimit.append(Text.of(": " + anvil.getXPLimit()))).leftAligned());

        return widgets;
    }
}
