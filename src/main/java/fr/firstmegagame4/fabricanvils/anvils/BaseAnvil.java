package fr.firstmegagame4.fabricanvils.anvils;

import net.minecraft.block.AnvilBlock;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

public class BaseAnvil extends AnvilBlock {

    protected static final Text TITLE;

    public BaseAnvil(Settings settings) {
        super(settings);
    }

    static {
        TITLE = new TranslatableText("container.repair");
    }

}
