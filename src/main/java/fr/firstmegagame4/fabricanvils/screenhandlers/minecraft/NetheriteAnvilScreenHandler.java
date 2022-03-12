package fr.firstmegagame4.fabricanvils.screenhandlers.minecraft;

import fr.firstmegagame4.fabricanvils.anvils.minecraft.NetheriteAnvil;
import fr.firstmegagame4.fabricanvils.screenhandlers.AdvancedMetalAnvilScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.sound.SoundEvent;

public class NetheriteAnvilScreenHandler extends AdvancedMetalAnvilScreenHandler {

    public NetheriteAnvilScreenHandler(SoundEvent forgeSound, SoundEvent breakSound, float chanceBreak, int syncId, PlayerInventory inventory, ScreenHandlerContext context) {
        super(forgeSound, breakSound, chanceBreak, syncId, inventory, context);
    }

    @Override
    public BlockState getLandingState(BlockState blockState) {
        return NetheriteAnvil.getLandingState(blockState);
    }

}
