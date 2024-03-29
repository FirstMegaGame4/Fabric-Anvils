package fr.firstmegagame4.fabricanvils.anvil;

import net.minecraft.entity.FallingBlockEntity;

public abstract class FragileMetalAnvil extends MetalAnvil {

    public FragileMetalAnvil(Settings settings) {
        super(settings);
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
        entity.setHurtEntities(1.50F, 30);
    }

    public float getDamagingChance() {
        return 1.00F;
    }

    public int getXPLimit() {
        return 100;
    }

}
