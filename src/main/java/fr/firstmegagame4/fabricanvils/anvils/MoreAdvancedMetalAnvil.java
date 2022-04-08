package fr.firstmegagame4.fabricanvils.anvils;

import net.minecraft.entity.FallingBlockEntity;

public class MoreAdvancedMetalAnvil extends MetalAnvil {

    public MoreAdvancedMetalAnvil(Settings settings) {
        super(settings);
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
        entity.setHurtEntities(5.0F, 70);
    }

    public float getChanceBreak() {
        return 0.015F;
    }

}