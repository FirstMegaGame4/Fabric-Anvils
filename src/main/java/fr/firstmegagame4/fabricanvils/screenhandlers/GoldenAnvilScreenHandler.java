package fr.firstmegagame4.fabricanvils.screenhandlers;

import fr.firstmegagame4.fabricanvils.anvils.GoldenAnvil;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.sound.SoundEvent;

public class GoldenAnvilScreenHandler extends CustomAnvilScreenHandler {

    public GoldenAnvilScreenHandler(SoundEvent forgeSound, SoundEvent breakSound, float chanceBreak, int syncId, PlayerInventory inventory, ScreenHandlerContext context) {
        super(forgeSound, breakSound, chanceBreak, syncId, inventory, context);
    }

    @Override
    public BlockState getLandingState(BlockState blockState) {
        return GoldenAnvil.getLandingState(blockState);
    }
}
