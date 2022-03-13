package fr.firstmegagame4.fabricanvils.mixin;

import fr.firstmegagame4.fabricanvils.FabricAnvilsClient;
import fr.firstmegagame4.fabricanvils.screenhandlers.CustomAnvilScreenHandler;
import net.minecraft.block.AnvilBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AnvilBlock.class)
public class AnvilMixin {
    @Inject(method = "onUse", at = @At("HEAD"))
    private void injectXPLimitReload(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit, CallbackInfoReturnable<ActionResult> cir) {
        if (state.isIn(BlockTags.ANVIL)) {
            if (FabricAnvilsClient.xpLimitOnClient) FabricAnvilsClient.anvilXpLimit = 40;
            CustomAnvilScreenHandler.xpLimit = 40;
        }
    }
}
