package fr.firstmegagame4.fabricanvils.anvils;

import net.minecraft.entity.FallingBlockEntity;

public class AdvancedMetalAnvil extends MetalAnvil {

    public AdvancedMetalAnvil(Settings settings) {
        super(settings);
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
        entity.setHurtEntities(4.0F, 60);
    }

    public float getDamagingChance() {
        return 0.03F;
    }

    public int getXPLimit() {
        return 120;
    }

}
