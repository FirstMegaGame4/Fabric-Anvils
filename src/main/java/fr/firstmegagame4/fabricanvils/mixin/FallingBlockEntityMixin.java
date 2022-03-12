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

        boolean isFabricAnvils = this.block.isIn(FATags.FABRICANVILS);
        float metalAnvilDamage = 0.05F;
        float woodenAnvilDamage = metalAnvilDamage * 8.33F;
        float stoneAnvilDamage = metalAnvilDamage * 3.33F;
        float fragileAnvilDamage = metalAnvilDamage * 8.33F;
        float inferiorAnvilDamage = metalAnvilDamage * 2.08F;
        float superiorAnvilDamage = metalAnvilDamage / 2.00F;
        float advancedAnvilDamage = metalAnvilDamage / 4.00F;

        if (isFabricAnvils) {
            if (this.block.isIn(FATags.WOODEN_ANVILS) && f0 > 0.0F && new Random().nextFloat() < woodenAnvilDamage + i0 * woodenAnvilDamage) {
                this.destroyedOnLanding = true;
            }
            else if (this.block.isIn(FATags.STONE_ANVILS) && f0 > 0.0F && new Random().nextFloat() < stoneAnvilDamage + i0 * stoneAnvilDamage) {
                this.destroyedOnLanding = true;
            }
            else if (this.block.isIn(FATags.FRAGILE_METAL_ANVILS) && f0 > 0.0F && new Random().nextFloat() < fragileAnvilDamage + i0 * fragileAnvilDamage) {
                this.destroyedOnLanding = true;
            }
            else if (this.block.isIn(FATags.INFERIOR_METAL_ANVILS) && f0 > 0.0F && new Random().nextFloat() < inferiorAnvilDamage + i0 * inferiorAnvilDamage) {
                this.destroyedOnLanding = true;
            }
            else if (this.block.isIn(FATags.METAL_ANVILS) && f0 > 0.0F && new Random().nextFloat() < metalAnvilDamage + i0 * metalAnvilDamage) {
                this.destroyedOnLanding = true;
            }
            else if (this.block.isIn(FATags.SUPERIOR_METAL_ANVILS) && f0 > 0.0F && new Random().nextFloat() < superiorAnvilDamage + i0 * superiorAnvilDamage) {
                this.destroyedOnLanding = true;
            }
            else if (this.block.isIn(FATags.ADVANCED_METAL_ANVILS) && f0 > 0.0F && new Random().nextFloat() < advancedAnvilDamage + i0 * advancedAnvilDamage) {
                this.destroyedOnLanding = true;
            }
        }

    }

}
