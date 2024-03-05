package fr.firstmegagame4.fabricanvils.init.block;

import fr.firstmegagame4.fabricanvils.content.ContentHolder;
import fr.firstmegagame4.fabricanvils.init.FAUtils;
import fr.firstmegagame4.fabricanvils.anvil.CustomAnvil;
import fr.firstmegagame4.fabricanvils.anvil.NormalWoodAnvil;
import fr.firstmegagame4.fabricanvils.anvil.techreborn.*;

public class TechRebornBlocks implements ContentHolder {

	public static final FAUtils.PredicatedForBeing<CustomAnvil> RUBBER_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> TIN_ANVIL = new FAUtils.PredicatedForBeing<>(TinAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_TIN_ANVIL = new FAUtils.PredicatedForBeing<>(TinAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_TIN_ANVIL = new FAUtils.PredicatedForBeing<>(TinAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> SILVER_ANVIL = new FAUtils.PredicatedForBeing<>(SilverAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_SILVER_ANVIL = new FAUtils.PredicatedForBeing<>(SilverAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_SILVER_ANVIL = new FAUtils.PredicatedForBeing<>(SilverAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> LEAD_ANVIL = new FAUtils.PredicatedForBeing<>(LeadAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_LEAD_ANVIL = new FAUtils.PredicatedForBeing<>(LeadAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_LEAD_ANVIL = new FAUtils.PredicatedForBeing<>(LeadAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> REFINED_IRON_ANVIL = new FAUtils.PredicatedForBeing<>(RefinedIronAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_REFINED_IRON_ANVIL = new FAUtils.PredicatedForBeing<>(RefinedIronAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_REFINED_IRON_ANVIL = new FAUtils.PredicatedForBeing<>(RefinedIronAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> SAPPHIRE_ANVIL = new FAUtils.PredicatedForBeing<>(SapphireAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_SAPPHIRE_ANVIL = new FAUtils.PredicatedForBeing<>(SapphireAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_SAPPHIRE_ANVIL = new FAUtils.PredicatedForBeing<>(SapphireAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> RUBY_ANVIL = new FAUtils.PredicatedForBeing<>(RubyAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_RUBY_ANVIL = new FAUtils.PredicatedForBeing<>(RubyAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_RUBY_ANVIL = new FAUtils.PredicatedForBeing<>(RubyAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> PERIDOT_ANVIL = new FAUtils.PredicatedForBeing<>(PeridotAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_PERIDOT_ANVIL = new FAUtils.PredicatedForBeing<>(PeridotAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_PERIDOT_ANVIL = new FAUtils.PredicatedForBeing<>(PeridotAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> RED_GARNET_ANVIL = new FAUtils.PredicatedForBeing<>(RedGarnetAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_RED_GARNET_ANVIL = new FAUtils.PredicatedForBeing<>(RedGarnetAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_RED_GARNET_ANVIL = new FAUtils.PredicatedForBeing<>(RedGarnetAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> YELLOW_GARNET_ANVIL = new FAUtils.PredicatedForBeing<>(YellowGarnetAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_YELLOW_GARNET_ANVIL = new FAUtils.PredicatedForBeing<>(YellowGarnetAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_YELLOW_GARNET_ANVIL = new FAUtils.PredicatedForBeing<>(YellowGarnetAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> ZINC_ANVIL = new FAUtils.PredicatedForBeing<>(ZincAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_ZINC_ANVIL = new FAUtils.PredicatedForBeing<>(ZincAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_ZINC_ANVIL = new FAUtils.PredicatedForBeing<>(ZincAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> STEEL_ANVIL = new FAUtils.PredicatedForBeing<>(SteelAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_STEEL_ANVIL = new FAUtils.PredicatedForBeing<>(SteelAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_STEEL_ANVIL = new FAUtils.PredicatedForBeing<>(SteelAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> BRONZE_ANVIL = new FAUtils.PredicatedForBeing<>(BronzeAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_BRONZE_ANVIL = new FAUtils.PredicatedForBeing<>(BronzeAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_BRONZE_ANVIL = new FAUtils.PredicatedForBeing<>(BronzeAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> BRASS_ANVIL = new FAUtils.PredicatedForBeing<>(BrassAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_BRASS_ANVIL = new FAUtils.PredicatedForBeing<>(BrassAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_BRASS_ANVIL = new FAUtils.PredicatedForBeing<>(BrassAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> NICKEL_ANVIL = new FAUtils.PredicatedForBeing<>(NickelAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_NICKEL_ANVIL = new FAUtils.PredicatedForBeing<>(NickelAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_NICKEL_ANVIL = new FAUtils.PredicatedForBeing<>(NickelAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> INVAR_ANVIL = new FAUtils.PredicatedForBeing<>(InvarAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_INVAR_ANVIL = new FAUtils.PredicatedForBeing<>(InvarAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_INVAR_ANVIL = new FAUtils.PredicatedForBeing<>(InvarAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> ELECTRUM_ANVIL = new FAUtils.PredicatedForBeing<>(ElectrumAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_ELECTRUM_ANVIL = new FAUtils.PredicatedForBeing<>(ElectrumAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_ELECTRUM_ANVIL = new FAUtils.PredicatedForBeing<>(ElectrumAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> PLATINUM_ANVIL = new FAUtils.PredicatedForBeing<>(PlatinumAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_PLATINUM_ANVIL = new FAUtils.PredicatedForBeing<>(PlatinumAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_PLATINUM_ANVIL = new FAUtils.PredicatedForBeing<>(PlatinumAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHROMIUM_ANVIL = new FAUtils.PredicatedForBeing<>(ChromiumAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_CHROMIUM_ANVIL = new FAUtils.PredicatedForBeing<>(ChromiumAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_CHROMIUM_ANVIL = new FAUtils.PredicatedForBeing<>(ChromiumAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> IRIDIUM_ANVIL = new FAUtils.PredicatedForBeing<>(IridiumAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_IRIDIUM_ANVIL = new FAUtils.PredicatedForBeing<>(IridiumAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_IRIDIUM_ANVIL = new FAUtils.PredicatedForBeing<>(IridiumAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> ALUMINIUM_ANVIL = new FAUtils.PredicatedForBeing<>(AluminiumAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_ALUMINIUM_ANVIL = new FAUtils.PredicatedForBeing<>(AluminiumAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_ALUMINIUM_ANVIL = new FAUtils.PredicatedForBeing<>(AluminiumAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> TITANIUM_ANVIL = new FAUtils.PredicatedForBeing<>(TitaniumAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_TITANIUM_ANVIL = new FAUtils.PredicatedForBeing<>(TitaniumAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_TITANIUM_ANVIL = new FAUtils.PredicatedForBeing<>(TitaniumAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> TUNGSTEN_ANVIL = new FAUtils.PredicatedForBeing<>(TungstenAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_TUNGSTEN_ANVIL = new FAUtils.PredicatedForBeing<>(TungstenAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_TUNGSTEN_ANVIL = new FAUtils.PredicatedForBeing<>(TungstenAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> HOT_TUNGSTENSTEEL_ANVIL = new FAUtils.PredicatedForBeing<>(HotTungstensteelAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_HOT_TUNGSTENSTEEL_ANVIL = new FAUtils.PredicatedForBeing<>(HotTungstensteelAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_HOT_TUNGSTENSTEEL_ANVIL = new FAUtils.PredicatedForBeing<>(HotTungstensteelAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> TUNGSTENSTEEL_ANVIL = new FAUtils.PredicatedForBeing<>(TungstensteelAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_TUNGSTENSTEEL_ANVIL = new FAUtils.PredicatedForBeing<>(TungstensteelAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_TUNGSTENSTEEL_ANVIL = new FAUtils.PredicatedForBeing<>(TungstensteelAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> ADVANCED_ALLOY_ANVIL = new FAUtils.PredicatedForBeing<>(AdvancedAlloyAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_ADVANCED_ALLOY_ANVIL = new FAUtils.PredicatedForBeing<>(AdvancedAlloyAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_ADVANCED_ALLOY_ANVIL = new FAUtils.PredicatedForBeing<>(AdvancedAlloyAnvil::new);

	@Override
	public String getModId() {
		return "techreborn";
	}

	public void register() {
		this.registerModAnvil("rubber_anvil", RUBBER_ANVIL.get());

		this.registerModAnvil("tin_anvil", TIN_ANVIL.get());
		this.registerModAnvil("chipped_tin_anvil", CHIPPED_TIN_ANVIL.get());
		this.registerModAnvil("damaged_tin_anvil", DAMAGED_TIN_ANVIL.get());

		this.registerModAnvil("silver_anvil", SILVER_ANVIL.get());
		this.registerModAnvil("chipped_silver_anvil", CHIPPED_SILVER_ANVIL.get());
		this.registerModAnvil("damaged_silver_anvil", DAMAGED_SILVER_ANVIL.get());

		this.registerModAnvil("lead_anvil", LEAD_ANVIL.get());
		this.registerModAnvil("chipped_lead_anvil", CHIPPED_LEAD_ANVIL.get());
		this.registerModAnvil("damaged_lead_anvil", DAMAGED_LEAD_ANVIL.get());

		this.registerModAnvil("refined_iron_anvil", REFINED_IRON_ANVIL.get());
		this.registerModAnvil("chipped_refined_iron_anvil", CHIPPED_REFINED_IRON_ANVIL.get());
		this.registerModAnvil("damaged_refined_iron_anvil", DAMAGED_REFINED_IRON_ANVIL.get());

		this.registerModAnvil("sapphire_anvil", SAPPHIRE_ANVIL.get());
		this.registerModAnvil("chipped_sapphire_anvil", CHIPPED_SAPPHIRE_ANVIL.get());
		this.registerModAnvil("damaged_sapphire_anvil", DAMAGED_SAPPHIRE_ANVIL.get());

		this.registerModAnvil("ruby_anvil", RUBY_ANVIL.get());
		this.registerModAnvil("chipped_ruby_anvil", CHIPPED_RUBY_ANVIL.get());
		this.registerModAnvil("damaged_ruby_anvil", DAMAGED_RUBY_ANVIL.get());

		this.registerModAnvil("peridot_anvil", PERIDOT_ANVIL.get());
		this.registerModAnvil("chipped_peridot_anvil", CHIPPED_PERIDOT_ANVIL.get());
		this.registerModAnvil("damaged_peridot_anvil", DAMAGED_PERIDOT_ANVIL.get());

		this.registerModAnvil("red_garnet_anvil", RED_GARNET_ANVIL.get());
		this.registerModAnvil("chipped_red_garnet_anvil", CHIPPED_RED_GARNET_ANVIL.get());
		this.registerModAnvil("damaged_red_garnet_anvil", DAMAGED_RED_GARNET_ANVIL.get());

		this.registerModAnvil("yellow_garnet_anvil", YELLOW_GARNET_ANVIL.get());
		this.registerModAnvil("chipped_yellow_garnet_anvil", CHIPPED_YELLOW_GARNET_ANVIL.get());
		this.registerModAnvil("damaged_yellow_garnet_anvil", DAMAGED_YELLOW_GARNET_ANVIL.get());

		this.registerModAnvil("zinc_anvil", ZINC_ANVIL.get());
		this.registerModAnvil("chipped_zinc_anvil", CHIPPED_ZINC_ANVIL.get());
		this.registerModAnvil("damaged_zinc_anvil", DAMAGED_ZINC_ANVIL.get());

		this.registerModAnvil("steel_anvil", STEEL_ANVIL.get());
		this.registerModAnvil("chipped_steel_anvil", CHIPPED_STEEL_ANVIL.get());
		this.registerModAnvil("damaged_steel_anvil", DAMAGED_STEEL_ANVIL.get());

		this.registerModAnvil("bronze_anvil", BRONZE_ANVIL.get());
		this.registerModAnvil("chipped_bronze_anvil", CHIPPED_BRONZE_ANVIL.get());
		this.registerModAnvil("damaged_bronze_anvil", DAMAGED_BRONZE_ANVIL.get());

		this.registerModAnvil("brass_anvil", BRASS_ANVIL.get());
		this.registerModAnvil("chipped_brass_anvil", CHIPPED_BRASS_ANVIL.get());
		this.registerModAnvil("damaged_brass_anvil", DAMAGED_BRASS_ANVIL.get());

		this.registerModAnvil("nickel_anvil", NICKEL_ANVIL.get());
		this.registerModAnvil("chipped_nickel_anvil", CHIPPED_NICKEL_ANVIL.get());
		this.registerModAnvil("damaged_nickel_anvil", DAMAGED_NICKEL_ANVIL.get());

		this.registerModAnvil("invar_anvil", INVAR_ANVIL.get());
		this.registerModAnvil("chipped_invar_anvil", CHIPPED_INVAR_ANVIL.get());
		this.registerModAnvil("damaged_invar_anvil", DAMAGED_INVAR_ANVIL.get());

		this.registerModAnvil("electrum_anvil", ELECTRUM_ANVIL.get());
		this.registerModAnvil("chipped_electrum_anvil", CHIPPED_ELECTRUM_ANVIL.get());
		this.registerModAnvil("damaged_electrum_anvil", DAMAGED_ELECTRUM_ANVIL.get());

		this.registerModAnvil("platinum_anvil", PLATINUM_ANVIL.get());
		this.registerModAnvil("chipped_platinum_anvil", CHIPPED_PLATINUM_ANVIL.get());
		this.registerModAnvil("damaged_platinum_anvil", DAMAGED_PLATINUM_ANVIL.get());

		this.registerModAnvil("chromium_anvil", CHROMIUM_ANVIL.get());
		this.registerModAnvil("chipped_chromium_anvil", CHIPPED_CHROMIUM_ANVIL.get());
		this.registerModAnvil("damaged_chromium_anvil", DAMAGED_CHROMIUM_ANVIL.get());

		this.registerModAnvil("iridium_anvil", IRIDIUM_ANVIL.get());
		this.registerModAnvil("chipped_iridium_anvil", CHIPPED_IRIDIUM_ANVIL.get());
		this.registerModAnvil("damaged_iridium_anvil", DAMAGED_IRIDIUM_ANVIL.get());

		this.registerModAnvil("aluminium_anvil", ALUMINIUM_ANVIL.get());
		this.registerModAnvil("chipped_aluminium_anvil", CHIPPED_ALUMINIUM_ANVIL.get());
		this.registerModAnvil("damaged_aluminium_anvil", DAMAGED_ALUMINIUM_ANVIL.get());

		this.registerModAnvil("titanium_anvil", TITANIUM_ANVIL.get());
		this.registerModAnvil("chipped_titanium_anvil", CHIPPED_TITANIUM_ANVIL.get());
		this.registerModAnvil("damaged_titanium_anvil", DAMAGED_TITANIUM_ANVIL.get());

		this.registerModAnvil("tungsten_anvil", TUNGSTEN_ANVIL.get());
		this.registerModAnvil("chipped_tungsten_anvil", CHIPPED_TUNGSTEN_ANVIL.get());
		this.registerModAnvil("damaged_tungsten_anvil", DAMAGED_TUNGSTEN_ANVIL.get());

		this.registerModAnvil("hot_tungstensteel_anvil", HOT_TUNGSTENSTEEL_ANVIL.get());
		this.registerModAnvil("chipped_hot_tungstensteel_anvil", CHIPPED_HOT_TUNGSTENSTEEL_ANVIL.get());
		this.registerModAnvil("damaged_hot_tungstensteel_anvil", DAMAGED_HOT_TUNGSTENSTEEL_ANVIL.get());

		this.registerModAnvil("tungstensteel_anvil", TUNGSTENSTEEL_ANVIL.get());
		this.registerModAnvil("chipped_tungstensteel_anvil", CHIPPED_TUNGSTENSTEEL_ANVIL.get());
		this.registerModAnvil("damaged_tungstensteel_anvil", DAMAGED_TUNGSTENSTEEL_ANVIL.get());

		this.registerModAnvil("advanced_alloy_anvil", ADVANCED_ALLOY_ANVIL.get());
		this.registerModAnvil("chipped_advanced_alloy_anvil", CHIPPED_ADVANCED_ALLOY_ANVIL.get());
		this.registerModAnvil("damaged_advanced_alloy_anvil", DAMAGED_ADVANCED_ALLOY_ANVIL.get());
	}

	public void registerClient() {
		FAUtils.setCutout(CHIPPED_TIN_ANVIL.get());
		FAUtils.setCutout(DAMAGED_TIN_ANVIL.get());

		FAUtils.setCutout(CHIPPED_SILVER_ANVIL.get());
		FAUtils.setCutout(DAMAGED_SILVER_ANVIL.get());

		FAUtils.setCutout(CHIPPED_LEAD_ANVIL.get());
		FAUtils.setCutout(DAMAGED_LEAD_ANVIL.get());

		FAUtils.setCutout(CHIPPED_REFINED_IRON_ANVIL.get());
		FAUtils.setCutout(DAMAGED_REFINED_IRON_ANVIL.get());

		FAUtils.setCutout(CHIPPED_SAPPHIRE_ANVIL.get());
		FAUtils.setCutout(DAMAGED_SAPPHIRE_ANVIL.get());

		FAUtils.setCutout(CHIPPED_RUBY_ANVIL.get());
		FAUtils.setCutout(DAMAGED_RUBY_ANVIL.get());

		FAUtils.setCutout(CHIPPED_PERIDOT_ANVIL.get());
		FAUtils.setCutout(DAMAGED_PERIDOT_ANVIL.get());

		FAUtils.setCutout(CHIPPED_RED_GARNET_ANVIL.get());
		FAUtils.setCutout(DAMAGED_RED_GARNET_ANVIL.get());

		FAUtils.setCutout(CHIPPED_YELLOW_GARNET_ANVIL.get());
		FAUtils.setCutout(DAMAGED_YELLOW_GARNET_ANVIL.get());

		FAUtils.setCutout(CHIPPED_ZINC_ANVIL.get());
		FAUtils.setCutout(DAMAGED_ZINC_ANVIL.get());

		FAUtils.setCutout(CHIPPED_STEEL_ANVIL.get());
		FAUtils.setCutout(DAMAGED_STEEL_ANVIL.get());

		FAUtils.setCutout(CHIPPED_BRONZE_ANVIL.get());
		FAUtils.setCutout(DAMAGED_BRONZE_ANVIL.get());

		FAUtils.setCutout(CHIPPED_BRASS_ANVIL.get());
		FAUtils.setCutout(DAMAGED_BRASS_ANVIL.get());

		FAUtils.setCutout(CHIPPED_NICKEL_ANVIL.get());
		FAUtils.setCutout(DAMAGED_NICKEL_ANVIL.get());

		FAUtils.setCutout(CHIPPED_INVAR_ANVIL.get());
		FAUtils.setCutout(DAMAGED_INVAR_ANVIL.get());

		FAUtils.setCutout(CHIPPED_ELECTRUM_ANVIL.get());
		FAUtils.setCutout(DAMAGED_ELECTRUM_ANVIL.get());

		FAUtils.setCutout(CHIPPED_PLATINUM_ANVIL.get());
		FAUtils.setCutout(DAMAGED_PLATINUM_ANVIL.get());

		FAUtils.setCutout(CHIPPED_CHROMIUM_ANVIL.get());
		FAUtils.setCutout(DAMAGED_CHROMIUM_ANVIL.get());

		FAUtils.setCutout(CHIPPED_IRIDIUM_ANVIL.get());
		FAUtils.setCutout(DAMAGED_IRIDIUM_ANVIL.get());

		FAUtils.setCutout(CHIPPED_ALUMINIUM_ANVIL.get());
		FAUtils.setCutout(DAMAGED_ALUMINIUM_ANVIL.get());

		FAUtils.setCutout(CHIPPED_TITANIUM_ANVIL.get());
		FAUtils.setCutout(DAMAGED_TITANIUM_ANVIL.get());

		FAUtils.setCutout(CHIPPED_TUNGSTEN_ANVIL.get());
		FAUtils.setCutout(DAMAGED_TUNGSTEN_ANVIL.get());

		FAUtils.setCutout(CHIPPED_HOT_TUNGSTENSTEEL_ANVIL.get());
		FAUtils.setCutout(DAMAGED_HOT_TUNGSTENSTEEL_ANVIL.get());

		FAUtils.setCutout(CHIPPED_TUNGSTENSTEEL_ANVIL.get());
		FAUtils.setCutout(DAMAGED_TUNGSTENSTEEL_ANVIL.get());

		FAUtils.setCutout(CHIPPED_ADVANCED_ALLOY_ANVIL.get());
		FAUtils.setCutout(DAMAGED_ADVANCED_ALLOY_ANVIL.get());
	}
}
