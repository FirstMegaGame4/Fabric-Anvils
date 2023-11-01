package fr.firstmegagame4.fabricanvils.anvil;

import net.minecraft.entity.FallingBlockEntity;

public class EvenMoreAdvancedMetalAnvil extends MetalAnvil {

    public EvenMoreAdvancedMetalAnvil(Settings settings) {
        super(settings);
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
        entity.setHurtEntities(6.0F, 80);
    }

    public float getDamagingChance() {
        return 0.0075F;
    }

    public int getXPLimit() {
        return 190;
    }

}
