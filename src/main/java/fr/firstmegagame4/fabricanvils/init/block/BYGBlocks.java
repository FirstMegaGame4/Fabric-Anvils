package fr.firstmegagame4.fabricanvils.init.block;

import fr.firstmegagame4.fabricanvils.content.ContentHolder;
import fr.firstmegagame4.fabricanvils.init.FAUtils;
import fr.firstmegagame4.fabricanvils.anvil.*;
import fr.firstmegagame4.fabricanvils.anvil.byg.AmetrineAnvil;
import fr.firstmegagame4.fabricanvils.anvil.byg.PendoriteAnvil;

public class BYGBlocks implements ContentHolder {

	public static final FAUtils.PredicatedForBeing<CustomAnvil> ASPEN_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> BAOBAB_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> BLUE_ENCHANTED_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> BULBIS_ANVIL = new FAUtils.PredicatedForBeing<>(NetherWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHERRY_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CIKA_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CYPRESS_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> EBONY_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> ETHER_WOOD_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> FIR_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> GREEN_ENCHANTED_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> HOLLY_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> IMPARIUS_ANVIL = new FAUtils.PredicatedForBeing<>(NetherWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> JACARANDA_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> LAMENT_ANVIL = new FAUtils.PredicatedForBeing<>(NetherWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> MAHOGANY_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> MAPLE_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> NIGHTSHADE_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> PALM_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> PINE_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> RAINBOW_EUCALYPTUS_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> REDWOOD_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> SKYRIS_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> WHITE_MANGROVE_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> WILLOW_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> WITCH_HAZEL_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> ZELKOVA_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> SYTHIAN_ANVIL = new FAUtils.PredicatedForBeing<>(NetherWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> EMBUR_ANVIL = new FAUtils.PredicatedForBeing<>(NetherWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DACITE_ANVIL = new FAUtils.PredicatedForBeing<>(StoneAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> SCORIA_ANVIL = new FAUtils.PredicatedForBeing<>(StoneAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> ETHER_STONE_ANVIL = new FAUtils.PredicatedForBeing<>(StoneAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> AMETRINE_ANVIL = new FAUtils.PredicatedForBeing<>(AmetrineAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_AMETRINE_ANVIL = new FAUtils.PredicatedForBeing<>(AmetrineAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_AMETRINE_ANVIL = new FAUtils.PredicatedForBeing<>(AmetrineAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> PENDORITE_ANVIL = new FAUtils.PredicatedForBeing<>(PendoriteAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_PENDORITE_ANVIL = new FAUtils.PredicatedForBeing<>(PendoriteAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_PENDORITE_ANVIL = new FAUtils.PredicatedForBeing<>(PendoriteAnvil::new);

	@Override
	public String getModId() {
		return "byg";
	}

	@Override
	public void register() {
		this.registerModAnvil("aspen_anvil", ASPEN_ANVIL.get());
		this.registerModAnvil("baobab_anvil", BAOBAB_ANVIL.get());
		this.registerModAnvil("blue_enchanted_anvil", BLUE_ENCHANTED_ANVIL.get());
		this.registerModAnvil("bulbis_anvil", BULBIS_ANVIL.get());
		this.registerModAnvil("cherry_anvil", CHERRY_ANVIL.get());
		this.registerModAnvil("cika_anvil", CIKA_ANVIL.get());
		this.registerModAnvil("cypress_anvil", CYPRESS_ANVIL.get());
		this.registerModAnvil("ebony_anvil", EBONY_ANVIL.get());
		this.registerModAnvil("ether_wood_anvil", ETHER_WOOD_ANVIL.get());
		this.registerModAnvil("fir_anvil", FIR_ANVIL.get());
		this.registerModAnvil("green_enchanted_anvil", GREEN_ENCHANTED_ANVIL.get());
		this.registerModAnvil("holly_anvil", HOLLY_ANVIL.get());
		this.registerModAnvil("imparius_anvil", IMPARIUS_ANVIL.get());
		this.registerModAnvil("jacaranda_anvil", JACARANDA_ANVIL.get());
		this.registerModAnvil("lament_anvil", LAMENT_ANVIL.get());
		this.registerModAnvil("mahogany_anvil", MAHOGANY_ANVIL.get());
		this.registerModAnvil("maple_anvil", MAPLE_ANVIL.get());
		this.registerModAnvil("nightshade_anvil", NIGHTSHADE_ANVIL.get());
		this.registerModAnvil("palm_anvil", PALM_ANVIL.get());
		this.registerModAnvil("pine_anvil", PINE_ANVIL.get());
		this.registerModAnvil("rainbow_eucalyptus_anvil", RAINBOW_EUCALYPTUS_ANVIL.get());
		this.registerModAnvil("redwood_anvil", REDWOOD_ANVIL.get());
		this.registerModAnvil("skyris_anvil", SKYRIS_ANVIL.get());
		this.registerModAnvil("white_mangrove_anvil", WHITE_MANGROVE_ANVIL.get());
		this.registerModAnvil("willow_anvil", WILLOW_ANVIL.get());
		this.registerModAnvil("witch_hazel_anvil", WITCH_HAZEL_ANVIL.get());
		this.registerModAnvil("zelkova_anvil", ZELKOVA_ANVIL.get());
		this.registerModAnvil("sythian_anvil", SYTHIAN_ANVIL.get());
		this.registerModAnvil("embur_anvil", EMBUR_ANVIL.get());

		this.registerModAnvil("dacite_anvil", DACITE_ANVIL.get());
		this.registerModAnvil("scoria_anvil", SCORIA_ANVIL.get());
		this.registerModAnvil("ether_stone_anvil", ETHER_STONE_ANVIL.get());

		this.registerModAnvil("ametrine_anvil", AMETRINE_ANVIL.get());
		this.registerModAnvil("chipped_ametrine_anvil", CHIPPED_AMETRINE_ANVIL.get());
		this.registerModAnvil("damaged_ametrine_anvil", DAMAGED_AMETRINE_ANVIL.get());

		this.registerModAnvil("pendorite_anvil", PENDORITE_ANVIL.get());
		this.registerModAnvil("chipped_pendorite_anvil", CHIPPED_PENDORITE_ANVIL.get());
		this.registerModAnvil("damaged_pendorite_anvil", DAMAGED_PENDORITE_ANVIL.get());
	}

	@Override
	public void registerClient() {
		FAUtils.setCutout(CHIPPED_AMETRINE_ANVIL.get());
		FAUtils.setCutout(DAMAGED_AMETRINE_ANVIL.get());

		FAUtils.setCutout(CHIPPED_PENDORITE_ANVIL.get());
		FAUtils.setCutout(DAMAGED_PENDORITE_ANVIL.get());

		FAUtils.setTranslucent(AMETRINE_ANVIL.get());
		FAUtils.setTranslucent(CHIPPED_AMETRINE_ANVIL.get());
		FAUtils.setTranslucent(DAMAGED_AMETRINE_ANVIL.get());
	}
}
