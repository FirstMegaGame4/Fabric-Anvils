package fr.firstmegagame4.fabricanvils.screenhandlers.techreborn;

import fr.firstmegagame4.fabricanvils.anvils.techreborn.HotTungstensteelAnvil;
import fr.firstmegagame4.fabricanvils.screenhandlers.AdvancedMetalAnvilScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.sound.SoundEvent;

public class HotTungstensteelAnvilScreenHandler extends AdvancedMetalAnvilScreenHandler {

    public HotTungstensteelAnvilScreenHandler(SoundEvent forgeSound, SoundEvent breakSound, float chanceBreak, int syncId, PlayerInventory inventory, ScreenHandlerContext context) {
        super(forgeSound, breakSound, chanceBreak, syncId, inventory, context);
    }

    @Override
    public BlockState getLandingState(BlockState blockState) {
        return HotTungstensteelAnvil.getLandingState(blockState);
    }

}
