package fr.firstmegagame4.fabricanvils.FA.Blocks;

import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import fr.firstmegagame4.fabricanvils.anvils.*;
import fr.firstmegagame4.fabricanvils.anvils.byg.AmetrineAnvil;
import fr.firstmegagame4.fabricanvils.anvils.byg.PendoriteAnvil;

public class BYGBlocks implements BlocksInit {

    public static CustomAnvil ASPEN_ANVIL;
    public static CustomAnvil BAOBAB_ANVIL;
    public static CustomAnvil BLUE_ENCHANTED_ANVIL;
    public static CustomAnvil BULBIS_ANVIL;
    public static CustomAnvil CHERRY_ANVIL;
    public static CustomAnvil CIKA_ANVIL;
    public static CustomAnvil CYPRESS_ANVIL;
    public static CustomAnvil EBONY_ANVIL;
    public static CustomAnvil ETHER_WOOD_ANVIL;
    public static CustomAnvil FIR_ANVIL;
    public static CustomAnvil GREEN_ENCHANTED_ANVIL;
    public static CustomAnvil HOLLY_ANVIL;
    public static CustomAnvil IMPARIUS_ANVIL;
    public static CustomAnvil JACARANDA_ANVIL;
    public static CustomAnvil LAMENT_ANVIL;
    public static CustomAnvil MAHOGANY_ANVIL;
    public static CustomAnvil WHITE_MANGROVE_ANVIL;
    public static CustomAnvil MAPLE_ANVIL;
    public static CustomAnvil NIGHTSHADE_ANVIL;
    public static CustomAnvil PALM_ANVIL;
    public static CustomAnvil PINE_ANVIL;
    public static CustomAnvil RAINBOW_EUCALYPTUS_ANVIL;
    public static CustomAnvil REDWOOD_ANVIL;
    public static CustomAnvil SKYRIS_ANVIL;
    public static CustomAnvil WILLOW_ANVIL;
    public static CustomAnvil WITCH_HAZEL_ANVIL;
    public static CustomAnvil ZELKOVA_ANVIL;
    public static CustomAnvil SYTHIAN_ANVIL;
    public static CustomAnvil EMBUR_ANVIL;
    public static CustomAnvil DACITE_ANVIL;
    public static CustomAnvil SCORIA_ANVIL;
    public static CustomAnvil ETHER_STONE_ANVIL;

    public static CustomAnvil AMETRINE_ANVIL;
    public static CustomAnvil CHIPPED_AMETRINE_ANVIL;
    public static CustomAnvil DAMAGED_AMETRINE_ANVIL;

    public static CustomAnvil PENDORITE_ANVIL;
    public static CustomAnvil CHIPPED_PENDORITE_ANVIL;
    public static CustomAnvil DAMAGED_PENDORITE_ANVIL;

    @Override
    public String getModId() {
        return "byg";
    }

    @Override
    public BlocksInit init() {
        ASPEN_ANVIL = new NormalWoodAnvil();
        BAOBAB_ANVIL = new NormalWoodAnvil();
        BLUE_ENCHANTED_ANVIL = new NormalWoodAnvil();
        BULBIS_ANVIL = new NetherWoodAnvil();
        CHERRY_ANVIL = new NormalWoodAnvil();
        CIKA_ANVIL = new NormalWoodAnvil();
        CYPRESS_ANVIL = new NormalWoodAnvil();
        EBONY_ANVIL = new NormalWoodAnvil();
        ETHER_WOOD_ANVIL = new NormalWoodAnvil();
        FIR_ANVIL = new NormalWoodAnvil();
        GREEN_ENCHANTED_ANVIL = new NormalWoodAnvil();
        HOLLY_ANVIL = new NormalWoodAnvil();
        IMPARIUS_ANVIL = new NetherWoodAnvil();
        JACARANDA_ANVIL = new NormalWoodAnvil();
        LAMENT_ANVIL = new NetherWoodAnvil();
        MAHOGANY_ANVIL = new NormalWoodAnvil();
        MAPLE_ANVIL = new NormalWoodAnvil();
        NIGHTSHADE_ANVIL = new NormalWoodAnvil();
        PALM_ANVIL = new NormalWoodAnvil();
        PINE_ANVIL = new NormalWoodAnvil();
        RAINBOW_EUCALYPTUS_ANVIL = new NormalWoodAnvil();
        REDWOOD_ANVIL = new NormalWoodAnvil();
        SKYRIS_ANVIL = new NormalWoodAnvil();
        WHITE_MANGROVE_ANVIL = new NormalWoodAnvil();
        WILLOW_ANVIL = new NormalWoodAnvil();
        WITCH_HAZEL_ANVIL = new NormalWoodAnvil();
        ZELKOVA_ANVIL = new NormalWoodAnvil();
        SYTHIAN_ANVIL = new NetherWoodAnvil();
        EMBUR_ANVIL = new NetherWoodAnvil();
        DACITE_ANVIL = new StoneAnvil();
        SCORIA_ANVIL = new StoneAnvil();
        ETHER_STONE_ANVIL = new StoneAnvil();

        AMETRINE_ANVIL = new AmetrineAnvil();
        CHIPPED_AMETRINE_ANVIL = new AmetrineAnvil();
        DAMAGED_AMETRINE_ANVIL = new AmetrineAnvil();

        PENDORITE_ANVIL = new PendoriteAnvil();
        CHIPPED_PENDORITE_ANVIL = new PendoriteAnvil();
        DAMAGED_PENDORITE_ANVIL = new PendoriteAnvil();

        return this;
    }

    public void register() {
        this.registerModAnvil("aspen_anvil", ASPEN_ANVIL);
        this.registerModAnvil("baobab_anvil", BAOBAB_ANVIL);
        this.registerModAnvil("blue_enchanted_anvil", BLUE_ENCHANTED_ANVIL);
        this.registerModAnvil("bulbis_anvil", BULBIS_ANVIL);
        this.registerModAnvil("cherry_anvil", CHERRY_ANVIL);
        this.registerModAnvil("cika_anvil", CIKA_ANVIL);
        this.registerModAnvil("cypress_anvil", CYPRESS_ANVIL);
        this.registerModAnvil("ebony_anvil", EBONY_ANVIL);
        this.registerModAnvil("ether_wood_anvil", ETHER_WOOD_ANVIL);
        this.registerModAnvil("fir_anvil", FIR_ANVIL);
        this.registerModAnvil("green_enchanted_anvil", GREEN_ENCHANTED_ANVIL);
        this.registerModAnvil("holly_anvil", HOLLY_ANVIL);
        this.registerModAnvil("imparius_anvil", IMPARIUS_ANVIL);
        this.registerModAnvil("jacaranda_anvil", JACARANDA_ANVIL);
        this.registerModAnvil("lament_anvil", LAMENT_ANVIL);
        this.registerModAnvil("mahogany_anvil", MAHOGANY_ANVIL);
        this.registerModAnvil("maple_anvil", MAPLE_ANVIL);
        this.registerModAnvil("nightshade_anvil", NIGHTSHADE_ANVIL);
        this.registerModAnvil("palm_anvil", PALM_ANVIL);
        this.registerModAnvil("pine_anvil", PINE_ANVIL);
        this.registerModAnvil("rainbow_eucalyptus_anvil", RAINBOW_EUCALYPTUS_ANVIL);
        this.registerModAnvil("redwood_anvil", REDWOOD_ANVIL);
        this.registerModAnvil("skyris_anvil", SKYRIS_ANVIL);
        this.registerModAnvil("white_mangrove_anvil", WHITE_MANGROVE_ANVIL);
        this.registerModAnvil("willow_anvil", WILLOW_ANVIL);
        this.registerModAnvil("witch_hazel_anvil", WITCH_HAZEL_ANVIL);
        this.registerModAnvil("zelkova_anvil", ZELKOVA_ANVIL);
        this.registerModAnvil("sythian_anvil", SYTHIAN_ANVIL);
        this.registerModAnvil("embur_anvil", EMBUR_ANVIL);

        this.registerModAnvil("dacite_anvil", DACITE_ANVIL);
        this.registerModAnvil("scoria_anvil", SCORIA_ANVIL);
        this.registerModAnvil("ether_stone_anvil", ETHER_STONE_ANVIL);

        this.registerModAnvil("ametrine_anvil", AMETRINE_ANVIL);
        this.registerModAnvil("chipped_ametrine_anvil", CHIPPED_AMETRINE_ANVIL);
        this.registerModAnvil("damaged_ametrine_anvil", DAMAGED_AMETRINE_ANVIL);

        this.registerModAnvil("pendorite_anvil", PENDORITE_ANVIL);
        this.registerModAnvil("chipped_pendorite_anvil", CHIPPED_PENDORITE_ANVIL);
        this.registerModAnvil("damaged_pendorite_anvil", DAMAGED_PENDORITE_ANVIL);
    }

    @Override
    public void registerClient() {
        FAUtils.setCutout(CHIPPED_AMETRINE_ANVIL);
        FAUtils.setCutout(DAMAGED_AMETRINE_ANVIL);

        FAUtils.setCutout(CHIPPED_PENDORITE_ANVIL);
        FAUtils.setCutout(DAMAGED_PENDORITE_ANVIL);

        FAUtils.setTranslucent(AMETRINE_ANVIL);
        FAUtils.setTranslucent(CHIPPED_AMETRINE_ANVIL);
        FAUtils.setTranslucent(DAMAGED_AMETRINE_ANVIL);
    }

}
