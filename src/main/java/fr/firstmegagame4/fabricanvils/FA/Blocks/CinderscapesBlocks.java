package fr.firstmegagame4.fabricanvils.FA.Blocks;

import fr.firstmegagame4.fabricanvils.anvils.CustomAnvil;
import fr.firstmegagame4.fabricanvils.anvils.NetherWoodAnvil;

public class CinderscapesBlocks implements BlocksInit {

    public static CustomAnvil SCORCHED_ANVIL;
    public static CustomAnvil UMBRAL_ANVIL;

    @Override
    public String getModId() {
        return "cinderscapes";
    }

    @Override
    public BlocksInit init() {
        SCORCHED_ANVIL = new NetherWoodAnvil();
        UMBRAL_ANVIL = new NetherWoodAnvil();

        return this;
    }

    public void register() {
        this.registerModAnvil("scorched_anvil", SCORCHED_ANVIL);
        this.registerModAnvil("umbral_anvil", UMBRAL_ANVIL);
    }

    public void registerClient() {
    }

}
