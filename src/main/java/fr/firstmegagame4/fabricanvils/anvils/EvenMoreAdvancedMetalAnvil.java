package fr.firstmegagame4.fabricanvils.anvils;

import net.minecraft.entity.FallingBlockEntity;

public class EvenMoreAdvancedMetalAnvil extends MetalAnvil {

    public EvenMoreAdvancedMetalAnvil(Settings settings) {
        super(settings);
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
        entity.setHurtEntities(6.0F, 80);
    }

    public float getChanceBreak() {
        return 0.0075F;
    }

}
