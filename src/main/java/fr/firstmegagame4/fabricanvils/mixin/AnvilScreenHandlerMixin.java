package fr.firstmegagame4.fabricanvils.mixin;

import fr.firstmegagame4.fabricanvils.FA.FATags;
import fr.firstmegagame4.fabricanvils.screenhandlers.CustomAnvilScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.screen.AnvilScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AnvilScreenHandler.class)
public class AnvilScreenHandlerMixin {
    @Inject(method = "canUse", at = @At("HEAD"), cancellable = true)
    private void changeTag(BlockState state, CallbackInfoReturnable<Boolean> cir) {
        if (state.isIn(FATags.FABRICANVILS)) cir.setReturnValue(true);
    }
    @ModifyConstant(method = "updateResult", constant = @Constant(intValue = 40))
    private int xpLimit(int value) {
        return CustomAnvilScreenHandler.xpLimit;
    }
}
