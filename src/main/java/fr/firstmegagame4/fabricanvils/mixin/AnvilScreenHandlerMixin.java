package fr.firstmegagame4.fabricanvils.mixin;

import fr.firstmegagame4.fabricanvils.screenhandlers.CustomAnvilScreenHandler;
import net.minecraft.screen.AnvilScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(AnvilScreenHandler.class)
public class AnvilScreenHandlerMixin {
    @ModifyConstant(method = "updateResult", constant = @Constant(intValue = 40))
    private int xpLimit(int value) {
        return CustomAnvilScreenHandler.xpLimit;
    }
}
