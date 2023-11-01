package fr.firstmegagame4.fabricanvils.mixin;

import fr.firstmegagame4.fabricanvils.init.FATags;
import fr.firstmegagame4.fabricanvils.FabricAnvilsClient;
import fr.firstmegagame4.fabricanvils.screen.CustomAnvilScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.AnvilScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AnvilScreenHandler.class)
public class AnvilScreenHandlerMixin extends ForgingScreenHandlerMixin {
    @Inject(method = "canUse", at = @At("HEAD"), cancellable = true)
    private void changeTag(BlockState state, CallbackInfoReturnable<Boolean> cir) {
        if (state.isIn(FATags.FABRICANVILS)) cir.setReturnValue(true);
    }

    @Inject(method = "onTakeOutput", at = @At(value = "INVOKE", target = "Lnet/minecraft/screen/Property;set(I)V", shift = At.Shift.AFTER), cancellable = true)
    private void onTakeOutput(PlayerEntity player, ItemStack stack, CallbackInfo ci) {
        this.context.run(((world, pos) -> {
            if (world.getBlockState(pos).isIn(FATags.FABRICANVILS)) ci.cancel();
        }));
    }

    @ModifyConstant(method = "updateResult", constant = @Constant(intValue = 40))
    private int xpLimit(int value) {
        if (FabricAnvilsClient.xpLimitOnClient) return FabricAnvilsClient.anvilXpLimit;
        return CustomAnvilScreenHandler.xpLimit;
    }

    @ModifyConstant(method = "updateResult", constant = @Constant(intValue = 39))
    private int xpLimitWhenRenaming(int value) {
        if (FabricAnvilsClient.xpLimitOnClient) return FabricAnvilsClient.anvilXpLimit - 1;
        return CustomAnvilScreenHandler.xpLimit - 1;
    }
}
