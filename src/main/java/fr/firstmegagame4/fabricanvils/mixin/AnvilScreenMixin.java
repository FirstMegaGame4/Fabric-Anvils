package fr.firstmegagame4.fabricanvils.mixin;

import fr.firstmegagame4.fabricanvils.FabricAnvilsClient;
import fr.firstmegagame4.fabricanvils.screen.CustomAnvilScreenHandler;
import net.minecraft.client.gui.screen.ingame.AnvilScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(AnvilScreen.class)
public class AnvilScreenMixin {
    @ModifyConstant(method = "drawForeground", constant = @Constant(intValue = 40))
    public int xpLimit(int value) {
        if (FabricAnvilsClient.xpLimitOnClient) return FabricAnvilsClient.anvilXpLimit;
        else return CustomAnvilScreenHandler.xpLimit;
    }
}
