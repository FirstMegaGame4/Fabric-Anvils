package fr.firstmegagame4.fabricanvils.screenhandlers;

import fr.firstmegagame4.fabricanvils.anvils.CustomAnvil;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;

public class EvenMoreAdvancedMetalAnvilScreenHandler extends CustomAnvilScreenHandler {
    public EvenMoreAdvancedMetalAnvilScreenHandler(CustomAnvil anvil, int syncId, PlayerInventory inventory, ScreenHandlerContext context) {
        super(anvil, 190, syncId, inventory, context);
    }
}
