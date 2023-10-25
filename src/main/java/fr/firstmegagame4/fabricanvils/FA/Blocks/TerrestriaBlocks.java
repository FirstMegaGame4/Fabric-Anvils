package fr.firstmegagame4.fabricanvils.FA.Blocks;

import fr.firstmegagame4.fabricanvils.anvils.CustomAnvil;
import fr.firstmegagame4.fabricanvils.anvils.NormalWoodAnvil;
import fr.firstmegagame4.fabricanvils.anvils.StoneAnvil;

public class TerrestriaBlocks implements BlocksInit {

    public static CustomAnvil CYPRESS_ANVIL;
    public static CustomAnvil HEMLOCK_ANVIL;
    public static CustomAnvil JAPANESE_MAPLE_ANVIL;
    public static CustomAnvil RAINBOW_EUCALYPTUS_ANVIL;
    public static CustomAnvil REDWOOD_ANVIL;
    public static CustomAnvil RUBBER_ANVIL;
    public static CustomAnvil WILLOW_ANVIL;

    public static CustomAnvil VOLCANIC_ROCK_ANVIL;

    @Override
    public String getModId() {
        return "terrestria";
    }

    @Override
    public BlocksInit init() {
        CYPRESS_ANVIL = new NormalWoodAnvil();
        HEMLOCK_ANVIL = new NormalWoodAnvil();
        JAPANESE_MAPLE_ANVIL = new NormalWoodAnvil();
        RAINBOW_EUCALYPTUS_ANVIL = new NormalWoodAnvil();
        REDWOOD_ANVIL = new NormalWoodAnvil();
        RUBBER_ANVIL = new NormalWoodAnvil();
        WILLOW_ANVIL = new NormalWoodAnvil();

        VOLCANIC_ROCK_ANVIL = new StoneAnvil();

        return this;
    }

    public void register() {
        this.registerModAnvil("cypress_anvil", CYPRESS_ANVIL);
        this.registerModAnvil("hemlock_anvil", HEMLOCK_ANVIL);
        this.registerModAnvil("japanese_maple_anvil", JAPANESE_MAPLE_ANVIL);
        this.registerModAnvil("rainbow_eucalyptus_anvil", RAINBOW_EUCALYPTUS_ANVIL);
        this.registerModAnvil("redwood_anvil", REDWOOD_ANVIL);
        this.registerModAnvil("rubber_anvil", RUBBER_ANVIL);
        this.registerModAnvil("willow_anvil", WILLOW_ANVIL);

        this.registerModAnvil("volcanic_rock_anvil", VOLCANIC_ROCK_ANVIL);
    }

    public void registerClient() {
    }

}
