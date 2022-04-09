package fr.firstmegagame4.fabricanvils.screenhandlers.techreborn;

import fr.firstmegagame4.fabricanvils.anvils.techreborn.YellowGarnetAnvil;
import fr.firstmegagame4.fabricanvils.screenhandlers.InferiorMetalAnvilScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.sound.SoundEvent;

public class YellowGarnetAnvilScreenHandler extends InferiorMetalAnvilScreenHandler {

    public YellowGarnetAnvilScreenHandler(SoundEvent forgeSound, SoundEvent breakSound, float chanceBreak, int syncId, PlayerInventory inventory, ScreenHandlerContext context) {
        super(forgeSound, breakSound, chanceBreak, syncId, inventory, context);
    }

    @Override
    public BlockState getLandingState(BlockState blockState) {
        return YellowGarnetAnvil.getLandingState(blockState);
    }

}
