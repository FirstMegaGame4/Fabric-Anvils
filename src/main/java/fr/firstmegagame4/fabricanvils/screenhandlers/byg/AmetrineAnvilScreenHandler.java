package fr.firstmegagame4.fabricanvils.screenhandlers.byg;

import fr.firstmegagame4.fabricanvils.anvils.byg.AmetrineAnvil;
import fr.firstmegagame4.fabricanvils.screenhandlers.MoreAdvancedMetalAnvilScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.sound.SoundEvent;

public class AmetrineAnvilScreenHandler extends MoreAdvancedMetalAnvilScreenHandler {

    public AmetrineAnvilScreenHandler(SoundEvent forgeSound, SoundEvent breakSound, float chanceBreak, int syncId, PlayerInventory inventory, ScreenHandlerContext context) {
        super(forgeSound, breakSound, chanceBreak, syncId, inventory, context);
    }

    @Override
    public BlockState getLandingState(BlockState blockState) {
        return AmetrineAnvil.getLandingState(blockState);
    }

}
