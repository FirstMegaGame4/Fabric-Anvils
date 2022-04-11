package fr.firstmegagame4.fabricanvils.screenhandlers;

import fr.firstmegagame4.fabricanvils.anvils.CustomAnvil;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;

public class WoodenAnvilScreenHandler extends CustomAnvilScreenHandler {
    public WoodenAnvilScreenHandler(CustomAnvil anvil, int syncId, PlayerInventory inventory, ScreenHandlerContext context) {
        super(anvil, 10, syncId, inventory, context);
    }
}
