package fr.firstmegagame4.fabricanvils.FA.Blocks;

import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import fr.firstmegagame4.fabricanvils.anvils.*;
import fr.firstmegagame4.fabricanvils.anvils.byg.AmetrineAnvil;
import fr.firstmegagame4.fabricanvils.anvils.byg.PendoriteAnvil;

public class FABYGBlocks {

    public static final CustomAnvil ASPEN_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil BAOBAB_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil BLUE_ENCHANTED_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil BULBIS_ANVIL = new NetherWoodAnvil();
    public static final CustomAnvil CHERRY_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil CIKA_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil CYPRESS_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil EBONY_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil ETHER_WOODEN_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil FIR_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil GREEN_ENCHANTED_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil HOLLY_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil IMPARIUS_ANVIL = new NetherWoodAnvil();
    public static final CustomAnvil JACARANDA_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil LAMENT_ANVIL = new NetherWoodAnvil();
    public static final CustomAnvil MAHOGANY_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil MANGROVE_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil MAPLE_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil NIGHTSHADE_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil PALM_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil PINE_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil RAINBOW_EUCALYPTUS_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil REDWOOD_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil SKYRIS_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil WILLOW_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil WITCH_HAZEL_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil ZELKOVA_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil SYTHIAN_ANVIL = new NetherWoodAnvil();
    public static final CustomAnvil EMBUR_ANVIL = new NetherWoodAnvil();
    public static final CustomAnvil DACITE_ANVIL = new StoneAnvil();
    public static final CustomAnvil SCORIA_ANVIL = new StoneAnvil();
    public static final CustomAnvil ETHER_STONE_ANVIL = new StoneAnvil();

    public static final CustomAnvil AMETRINE_ANVIL = new AmetrineAnvil();
    public static final CustomAnvil CHIPPED_AMETRINE_ANVIL = new AmetrineAnvil();
    public static final CustomAnvil DAMAGED_AMETRINE_ANVIL = new AmetrineAnvil();

    public static final CustomAnvil PENDORITE_ANVIL = new PendoriteAnvil();
    public static final CustomAnvil CHIPPED_PENDORITE_ANVIL = new PendoriteAnvil();
    public static final CustomAnvil DAMAGED_PENDORITE_ANVIL = new PendoriteAnvil();

    public static void registerBYGAnvil(String blockId, CustomAnvil block) {
        FAUtils.registerAnvil("byg", blockId, block);
    }

    public static void register() {
        registerBYGAnvil("aspen_anvil", ASPEN_ANVIL);
        registerBYGAnvil("baobab_anvil", BAOBAB_ANVIL);
        registerBYGAnvil("blue_enchanted_anvil", BLUE_ENCHANTED_ANVIL);
        registerBYGAnvil("bulbis_anvil", BULBIS_ANVIL);
        registerBYGAnvil("cherry_anvil", CHERRY_ANVIL);
        registerBYGAnvil("cika_anvil", CIKA_ANVIL);
        registerBYGAnvil("cypress_anvil", CYPRESS_ANVIL);
        registerBYGAnvil("ebony_anvil", EBONY_ANVIL);
        registerBYGAnvil("ether_wooden_anvil", ETHER_WOODEN_ANVIL);
        registerBYGAnvil("fir_anvil", FIR_ANVIL);
        registerBYGAnvil("green_enchanted_anvil", GREEN_ENCHANTED_ANVIL);
        registerBYGAnvil("holly_anvil", HOLLY_ANVIL);
        registerBYGAnvil("imparius_anvil", IMPARIUS_ANVIL);
        registerBYGAnvil("jacaranda_anvil", JACARANDA_ANVIL);
        registerBYGAnvil("lament_anvil", LAMENT_ANVIL);
        registerBYGAnvil("mahogany_anvil", MAHOGANY_ANVIL);
        registerBYGAnvil("mangrove_anvil", MANGROVE_ANVIL);
        registerBYGAnvil("maple_anvil", MAPLE_ANVIL);
        registerBYGAnvil("nightshade_anvil", NIGHTSHADE_ANVIL);
        registerBYGAnvil("palm_anvil", PALM_ANVIL);
        registerBYGAnvil("pine_anvil", PINE_ANVIL);
        registerBYGAnvil("rainbow_eucalyptus_anvil", RAINBOW_EUCALYPTUS_ANVIL);
        registerBYGAnvil("redwood_anvil", REDWOOD_ANVIL);
        registerBYGAnvil("skyris_anvil", SKYRIS_ANVIL);
        registerBYGAnvil("willow_anvil", WILLOW_ANVIL);
        registerBYGAnvil("witch_hazel_anvil", WITCH_HAZEL_ANVIL);
        registerBYGAnvil("zelkova_anvil", ZELKOVA_ANVIL);
        registerBYGAnvil("sythian_anvil", SYTHIAN_ANVIL);
        registerBYGAnvil("embur_anvil", EMBUR_ANVIL);

        registerBYGAnvil("dacite_anvil", DACITE_ANVIL);
        registerBYGAnvil("scoria_anvil", SCORIA_ANVIL);
        registerBYGAnvil("ether_stone_anvil", ETHER_STONE_ANVIL);

        registerBYGAnvil("ametrine_anvil", AMETRINE_ANVIL);
        registerBYGAnvil("chipped_ametrine_anvil", CHIPPED_AMETRINE_ANVIL);
        registerBYGAnvil("damaged_ametrine_anvil", DAMAGED_AMETRINE_ANVIL);

        registerBYGAnvil("pendorite_anvil", PENDORITE_ANVIL);
        registerBYGAnvil("chipped_pendorite_anvil", CHIPPED_PENDORITE_ANVIL);
        registerBYGAnvil("damaged_pendorite_anvil", DAMAGED_PENDORITE_ANVIL);
    }

    public static void registerRenderLayers() {
        FAUtils.setCutout(CHIPPED_AMETRINE_ANVIL);
        FAUtils.setCutout(DAMAGED_AMETRINE_ANVIL);

        FAUtils.setCutout(CHIPPED_PENDORITE_ANVIL);
        FAUtils.setCutout(DAMAGED_PENDORITE_ANVIL);

        FAUtils.setTranslucent(AMETRINE_ANVIL);
        FAUtils.setTranslucent(CHIPPED_AMETRINE_ANVIL);
        FAUtils.setTranslucent(DAMAGED_AMETRINE_ANVIL);
    }

}
