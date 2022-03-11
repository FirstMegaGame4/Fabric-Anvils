package fr.firstmegagame4.fabricanvils.screenhandlers.minecraft;

import fr.firstmegagame4.fabricanvils.anvils.minecraft.DiamondAnvil;
import fr.firstmegagame4.fabricanvils.screenhandlers.CustomAnvilScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.sound.SoundEvent;

public class DiamondAnvilScreenHandler extends CustomAnvilScreenHandler {

    public DiamondAnvilScreenHandler(SoundEvent forgeSound, SoundEvent breakSound, float chanceBreak, int syncId, PlayerInventory inventory, ScreenHandlerContext context) {
        super(forgeSound, breakSound, chanceBreak, syncId, inventory, context);
    }

    @Override
    public BlockState getLandingState(BlockState blockState) {
        return DiamondAnvil.getLandingState(blockState);
    }

    @Override
    public int getXPLimit() {
        return 80;
    }
}
