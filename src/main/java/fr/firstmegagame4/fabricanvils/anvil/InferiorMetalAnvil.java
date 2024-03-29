package fr.firstmegagame4.fabricanvils.anvil;

import net.minecraft.entity.FallingBlockEntity;

public class InferiorMetalAnvil extends MetalAnvil {

    public InferiorMetalAnvil(Settings settings) {
        super(settings);
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
        entity.setHurtEntities(1.75F, 30);
    }

    public float getDamagingChance() {
        return 0.25F;
    }

    public int getXPLimit() {
        return 30;
    }

}
