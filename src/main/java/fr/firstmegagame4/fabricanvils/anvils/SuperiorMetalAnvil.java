package fr.firstmegagame4.fabricanvils.anvils;

import net.minecraft.entity.FallingBlockEntity;

public class SuperiorMetalAnvil extends MetalAnvil {

    public SuperiorMetalAnvil(Settings settings) {
        super(settings);
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
        entity.setHurtEntities(3.0F, 50);
    }

    public float getChanceBreak() {
        return 0.06F;
    }

    public int getXPLimit() {
        return 80;
    }

}
