package fr.firstmegagame4.fabricanvils.mixin;

import net.minecraft.screen.ForgingScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ForgingScreenHandler.class)
public class ForgingScreenHandlerMixin {
    @Shadow @Final protected ScreenHandlerContext context;
}
