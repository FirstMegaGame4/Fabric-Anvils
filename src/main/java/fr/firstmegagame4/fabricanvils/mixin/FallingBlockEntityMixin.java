package fr.firstmegagame4.fabricanvils.mixin;

import fr.firstmegagame4.fabricanvils.FA.FATags;
import net.minecraft.block.BlockState;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(FallingBlockEntity.class)
public class FallingBlockEntityMixin {

    @Shadow private boolean hurtEntities;
    @Shadow private BlockState block;

    @Shadow private float fallHurtAmount;

    @Shadow private int fallHurtMax;

    @Shadow private boolean destroyedOnLanding;

    @Inject(method = "readCustomDataFromNbt", at = @At("TAIL"))
    private void addFabricAnvilsTagDataReader(NbtCompound nbt, CallbackInfo ci) {
        if (this.block.isIn(FATags.FABRICANVILS)) {
            this.hurtEntities = true;
        }
    }

    @Inject(method = "handleFallDamage", at = @At("TAIL"))
    private void addFabricAnvilsTag(float fallDistance, float damageMultiplier, DamageSource damageSource, CallbackInfoReturnable<Boolean> cir) {
        float i0 = (float) MathHelper.ceil(fallDistance - 1.0F);
        float f0 = Math.min(MathHelper.floor(i0 * this.fallHurtAmount), this.fallHurtMax);
        boolean bl0 = this.block.isIn(FATags.FABRICANVILS);

        if (bl0 && f0 > 0.0F && new Random().nextFloat() < 0.05F + i0 * 0.05F) {
            this.destroyedOnLanding = true;
        }
    }

}
