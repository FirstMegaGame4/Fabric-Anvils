package fr.firstmegagame4.fabricanvils.screenhandlers.minecraft;

import fr.firstmegagame4.fabricanvils.screenhandlers.CustomAnvilScreenHandler;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.sound.SoundEvent;

public class CopperAnvilScreenHandler extends CustomAnvilScreenHandler {

    public CopperAnvilScreenHandler(SoundEvent forgeSound, SoundEvent breakSound, float chanceBreak, int syncId, PlayerInventory inventory, ScreenHandlerContext context) {
        super(forgeSound, breakSound, chanceBreak, syncId, inventory, context);
    }

    @Override
    public int getXPLimit() {
        return 30;
    }
}
