package fr.firstmegagame4.fabricanvils.screenhandlers.byg;

import fr.firstmegagame4.fabricanvils.anvils.byg.PendoriteAnvil;
import fr.firstmegagame4.fabricanvils.screenhandlers.AdvancedMetalAnvilScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.sound.SoundEvent;

public class PendoriteAnvilScreenHandler extends AdvancedMetalAnvilScreenHandler {

    public PendoriteAnvilScreenHandler(SoundEvent forgeSound, SoundEvent breakSound, float chanceBreak, int syncId, PlayerInventory inventory, ScreenHandlerContext context) {
        super(forgeSound, breakSound, chanceBreak, syncId, inventory, context);
    }

    @Override
    public BlockState getLandingState(BlockState blockState) {
        return PendoriteAnvil.getLandingState(blockState);
    }

}
