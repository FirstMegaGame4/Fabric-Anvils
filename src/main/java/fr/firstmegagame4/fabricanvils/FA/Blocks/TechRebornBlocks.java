package fr.firstmegagame4.fabricanvils.FA.Blocks;

import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import fr.firstmegagame4.fabricanvils.anvils.CustomAnvil;
import fr.firstmegagame4.fabricanvils.anvils.NormalWoodAnvil;
import fr.firstmegagame4.fabricanvils.anvils.techreborn.*;

public class TechRebornBlocks implements BlocksInit {

    public static CustomAnvil RUBBER_ANVIL;

    public static CustomAnvil TIN_ANVIL;
    public static CustomAnvil CHIPPED_TIN_ANVIL;
    public static CustomAnvil DAMAGED_TIN_ANVIL;

    public static CustomAnvil SILVER_ANVIL;
    public static CustomAnvil CHIPPED_SILVER_ANVIL;
    public static CustomAnvil DAMAGED_SILVER_ANVIL;

    public static CustomAnvil LEAD_ANVIL;
    public static CustomAnvil CHIPPED_LEAD_ANVIL;
    public static CustomAnvil DAMAGED_LEAD_ANVIL;

    public static CustomAnvil REFINED_IRON_ANVIL;
    public static CustomAnvil CHIPPED_REFINED_IRON_ANVIL;
    public static CustomAnvil DAMAGED_REFINED_IRON_ANVIL;

    public static CustomAnvil SAPPHIRE_ANVIL;
    public static CustomAnvil CHIPPED_SAPPHIRE_ANVIL;
    public static CustomAnvil DAMAGED_SAPPHIRE_ANVIL;

    public static CustomAnvil RUBY_ANVIL;
    public static CustomAnvil CHIPPED_RUBY_ANVIL;
    public static CustomAnvil DAMAGED_RUBY_ANVIL;

    public static CustomAnvil PERIDOT_ANVIL;
    public static CustomAnvil CHIPPED_PERIDOT_ANVIL;
    public static CustomAnvil DAMAGED_PERIDOT_ANVIL;

    public static CustomAnvil RED_GARNET_ANVIL;
    public static CustomAnvil CHIPPED_RED_GARNET_ANVIL;
    public static CustomAnvil DAMAGED_RED_GARNET_ANVIL;

    public static CustomAnvil YELLOW_GARNET_ANVIL;
    public static CustomAnvil CHIPPED_YELLOW_GARNET_ANVIL;
    public static CustomAnvil DAMAGED_YELLOW_GARNET_ANVIL;

    public static CustomAnvil ZINC_ANVIL;
    public static CustomAnvil CHIPPED_ZINC_ANVIL;
    public static CustomAnvil DAMAGED_ZINC_ANVIL;

    public static CustomAnvil STEEL_ANVIL;
    public static CustomAnvil CHIPPED_STEEL_ANVIL;
    public static CustomAnvil DAMAGED_STEEL_ANVIL;

    public static CustomAnvil BRONZE_ANVIL;
    public static CustomAnvil CHIPPED_BRONZE_ANVIL;
    public static CustomAnvil DAMAGED_BRONZE_ANVIL;

    public static CustomAnvil BRASS_ANVIL;
    public static CustomAnvil CHIPPED_BRASS_ANVIL;
    public static CustomAnvil DAMAGED_BRASS_ANVIL;

    public static CustomAnvil NICKEL_ANVIL;
    public static CustomAnvil CHIPPED_NICKEL_ANVIL;
    public static CustomAnvil DAMAGED_NICKEL_ANVIL;

    public static CustomAnvil INVAR_ANVIL;
    public static CustomAnvil CHIPPED_INVAR_ANVIL;
    public static CustomAnvil DAMAGED_INVAR_ANVIL;

    public static CustomAnvil ELECTRUM_ANVIL;
    public static CustomAnvil CHIPPED_ELECTRUM_ANVIL;
    public static CustomAnvil DAMAGED_ELECTRUM_ANVIL;

    public static CustomAnvil PLATINUM_ANVIL;
    public static CustomAnvil CHIPPED_PLATINUM_ANVIL;
    public static CustomAnvil DAMAGED_PLATINUM_ANVIL;

    public static CustomAnvil CHROMIUM_ANVIL;
    public static CustomAnvil CHIPPED_CHROMIUM_ANVIL;
    public static CustomAnvil DAMAGED_CHROMIUM_ANVIL;

    public static CustomAnvil IRIDIUM_ANVIL;
    public static CustomAnvil CHIPPED_IRIDIUM_ANVIL;
    public static CustomAnvil DAMAGED_IRIDIUM_ANVIL;

    public static CustomAnvil ALUMINIUM_ANVIL;
    public static CustomAnvil CHIPPED_ALUMINIUM_ANVIL;
    public static CustomAnvil DAMAGED_ALUMINIUM_ANVIL;

    public static CustomAnvil TITANIUM_ANVIL;
    public static CustomAnvil CHIPPED_TITANIUM_ANVIL;
    public static CustomAnvil DAMAGED_TITANIUM_ANVIL;

    public static CustomAnvil TUNGSTEN_ANVIL;
    public static CustomAnvil CHIPPED_TUNGSTEN_ANVIL;
    public static CustomAnvil DAMAGED_TUNGSTEN_ANVIL;

    public static CustomAnvil HOT_TUNGSTENSTEEL_ANVIL;
    public static CustomAnvil CHIPPED_HOT_TUNGSTENSTEEL_ANVIL;
    public static CustomAnvil DAMAGED_HOT_TUNGSTENSTEEL_ANVIL;

    public static CustomAnvil TUNGSTENSTEEL_ANVIL;
    public static CustomAnvil CHIPPED_TUNGSTENSTEEL_ANVIL;
    public static CustomAnvil DAMAGED_TUNGSTENSTEEL_ANVIL;

    public static CustomAnvil ADVANCED_ALLOY_ANVIL;
    public static CustomAnvil CHIPPED_ADVANCED_ALLOW_ANVIL;
    public static CustomAnvil DAMAGED_ADVANCED_ALLOW_ANVIL;

    @Override
    public String getModId() {
        return "techreborn";
    }

    @Override
    public BlocksInit init() {
        RUBBER_ANVIL = new NormalWoodAnvil();

        TIN_ANVIL = new TinAnvil();
        CHIPPED_TIN_ANVIL = new TinAnvil();
        DAMAGED_TIN_ANVIL = new TinAnvil();

        SILVER_ANVIL = new SilverAnvil();
        CHIPPED_SILVER_ANVIL = new SilverAnvil();
        DAMAGED_SILVER_ANVIL = new SilverAnvil();

        LEAD_ANVIL = new LeadAnvil();
        CHIPPED_LEAD_ANVIL = new LeadAnvil();
        DAMAGED_LEAD_ANVIL = new LeadAnvil();

        REFINED_IRON_ANVIL = new RefinedIronAnvil();
        CHIPPED_REFINED_IRON_ANVIL = new RefinedIronAnvil();
        DAMAGED_REFINED_IRON_ANVIL = new RefinedIronAnvil();

        SAPPHIRE_ANVIL = new SapphireAnvil();
        CHIPPED_SAPPHIRE_ANVIL = new SapphireAnvil();
        DAMAGED_SAPPHIRE_ANVIL = new SapphireAnvil();

        RUBY_ANVIL = new RubyAnvil();
        CHIPPED_RUBY_ANVIL = new RubyAnvil();
        DAMAGED_RUBY_ANVIL = new RubyAnvil();

        PERIDOT_ANVIL = new PeridotAnvil();
        CHIPPED_PERIDOT_ANVIL = new PeridotAnvil();
        DAMAGED_PERIDOT_ANVIL = new PeridotAnvil();

        RED_GARNET_ANVIL = new RedGarnetAnvil();
        CHIPPED_RED_GARNET_ANVIL = new RedGarnetAnvil();
        DAMAGED_RED_GARNET_ANVIL = new RedGarnetAnvil();

        YELLOW_GARNET_ANVIL = new YellowGarnetAnvil();
        CHIPPED_YELLOW_GARNET_ANVIL = new YellowGarnetAnvil();
        DAMAGED_YELLOW_GARNET_ANVIL = new YellowGarnetAnvil();

        ZINC_ANVIL = new ZincAnvil();
        CHIPPED_ZINC_ANVIL = new ZincAnvil();
        DAMAGED_ZINC_ANVIL = new ZincAnvil();

        STEEL_ANVIL = new SteelAnvil();
        CHIPPED_STEEL_ANVIL = new SteelAnvil();
        DAMAGED_STEEL_ANVIL = new SteelAnvil();

        BRONZE_ANVIL = new BronzeAnvil();
        CHIPPED_BRONZE_ANVIL = new BronzeAnvil();
        DAMAGED_BRONZE_ANVIL = new BronzeAnvil();

        BRASS_ANVIL = new BrassAnvil();
        CHIPPED_BRASS_ANVIL = new BrassAnvil();
        DAMAGED_BRASS_ANVIL = new BrassAnvil();

        NICKEL_ANVIL = new NickelAnvil();
        CHIPPED_NICKEL_ANVIL = new NickelAnvil();
        DAMAGED_NICKEL_ANVIL = new NickelAnvil();

        INVAR_ANVIL = new InvarAnvil();
        CHIPPED_INVAR_ANVIL = new InvarAnvil();
        DAMAGED_INVAR_ANVIL = new InvarAnvil();

        ELECTRUM_ANVIL = new ElectrumAnvil();
        CHIPPED_ELECTRUM_ANVIL = new ElectrumAnvil();
        DAMAGED_ELECTRUM_ANVIL = new ElectrumAnvil();

        PLATINUM_ANVIL = new PlatinumAnvil();
        CHIPPED_PLATINUM_ANVIL = new PlatinumAnvil();
        DAMAGED_PLATINUM_ANVIL = new PlatinumAnvil();

        CHROMIUM_ANVIL = new ChromiumAnvil();
        CHIPPED_CHROMIUM_ANVIL = new ChromiumAnvil();
        DAMAGED_CHROMIUM_ANVIL = new ChromiumAnvil();

        IRIDIUM_ANVIL = new IridiumAnvil();
        CHIPPED_IRIDIUM_ANVIL = new IridiumAnvil();
        DAMAGED_IRIDIUM_ANVIL = new IridiumAnvil();

        ALUMINIUM_ANVIL = new AluminiumAnvil();
        CHIPPED_ALUMINIUM_ANVIL = new AluminiumAnvil();
        DAMAGED_ALUMINIUM_ANVIL = new AluminiumAnvil();

        TITANIUM_ANVIL = new TitaniumAnvil();
        CHIPPED_TITANIUM_ANVIL = new TitaniumAnvil();
        DAMAGED_TITANIUM_ANVIL = new TitaniumAnvil();

        TUNGSTEN_ANVIL = new TungstenAnvil();
        CHIPPED_TUNGSTEN_ANVIL = new TungstenAnvil();
        DAMAGED_TUNGSTEN_ANVIL = new TungstenAnvil();

        HOT_TUNGSTENSTEEL_ANVIL = new HotTungstensteelAnvil();
        CHIPPED_HOT_TUNGSTENSTEEL_ANVIL = new HotTungstensteelAnvil();
        DAMAGED_HOT_TUNGSTENSTEEL_ANVIL = new HotTungstensteelAnvil();

        TUNGSTENSTEEL_ANVIL = new TungstensteelAnvil();
        CHIPPED_TUNGSTENSTEEL_ANVIL = new TungstensteelAnvil();
        DAMAGED_TUNGSTENSTEEL_ANVIL = new TungstensteelAnvil();

        ADVANCED_ALLOY_ANVIL = new AdvancedAlloyAnvil();
        CHIPPED_ADVANCED_ALLOW_ANVIL = new AdvancedAlloyAnvil();
        DAMAGED_ADVANCED_ALLOW_ANVIL = new AdvancedAlloyAnvil();

        return this;
    }

    public void register() {
        this.registerModAnvil("rubber_anvil", RUBBER_ANVIL);

        this.registerModAnvil("tin_anvil", TIN_ANVIL);
        this.registerModAnvil("chipped_tin_anvil", CHIPPED_TIN_ANVIL);
        this.registerModAnvil("damaged_tin_anvil", DAMAGED_TIN_ANVIL);

        this.registerModAnvil("silver_anvil", SILVER_ANVIL);
        this.registerModAnvil("chipped_silver_anvil", CHIPPED_SILVER_ANVIL);
        this.registerModAnvil("damaged_silver_anvil", DAMAGED_SILVER_ANVIL);

        this.registerModAnvil("lead_anvil", LEAD_ANVIL);
        this.registerModAnvil("chipped_lead_anvil", CHIPPED_LEAD_ANVIL);
        this.registerModAnvil("damaged_lead_anvil", DAMAGED_LEAD_ANVIL);

        this.registerModAnvil("refined_iron_anvil", REFINED_IRON_ANVIL);
        this.registerModAnvil("chipped_refined_iron_anvil", CHIPPED_REFINED_IRON_ANVIL);
        this.registerModAnvil("damaged_refined_iron_anvil", DAMAGED_REFINED_IRON_ANVIL);

        this.registerModAnvil("sapphire_anvil", SAPPHIRE_ANVIL);
        this.registerModAnvil("chipped_sapphire_anvil", CHIPPED_SAPPHIRE_ANVIL);
        this.registerModAnvil("damaged_sapphire_anvil", DAMAGED_SAPPHIRE_ANVIL);

        this.registerModAnvil("ruby_anvil", RUBY_ANVIL);
        this.registerModAnvil("chipped_ruby_anvil", CHIPPED_RUBY_ANVIL);
        this.registerModAnvil("damaged_ruby_anvil", DAMAGED_RUBY_ANVIL);

        this.registerModAnvil("peridot_anvil", PERIDOT_ANVIL);
        this.registerModAnvil("chipped_peridot_anvil", CHIPPED_PERIDOT_ANVIL);
        this.registerModAnvil("damaged_peridot_anvil", DAMAGED_PERIDOT_ANVIL);

        this.registerModAnvil("red_garnet_anvil", RED_GARNET_ANVIL);
        this.registerModAnvil("chipped_red_garnet_anvil", CHIPPED_RED_GARNET_ANVIL);
        this.registerModAnvil("damaged_red_garnet_anvil", DAMAGED_RED_GARNET_ANVIL);

        this.registerModAnvil("yellow_garnet_anvil", YELLOW_GARNET_ANVIL);
        this.registerModAnvil("chipped_yellow_garnet_anvil", CHIPPED_YELLOW_GARNET_ANVIL);
        this.registerModAnvil("damaged_yellow_garnet_anvil", DAMAGED_YELLOW_GARNET_ANVIL);

        this.registerModAnvil("zinc_anvil", ZINC_ANVIL);
        this.registerModAnvil("chipped_zinc_anvil", CHIPPED_ZINC_ANVIL);
        this.registerModAnvil("damaged_zinc_anvil", DAMAGED_ZINC_ANVIL);

        this.registerModAnvil("steel_anvil", STEEL_ANVIL);
        this.registerModAnvil("chipped_steel_anvil", CHIPPED_STEEL_ANVIL);
        this.registerModAnvil("damaged_steel_anvil", DAMAGED_STEEL_ANVIL);

        this.registerModAnvil("bronze_anvil", BRONZE_ANVIL);
        this.registerModAnvil("chipped_bronze_anvil", CHIPPED_BRONZE_ANVIL);
        this.registerModAnvil("damaged_bronze_anvil", DAMAGED_BRONZE_ANVIL);

        this.registerModAnvil("brass_anvil", BRASS_ANVIL);
        this.registerModAnvil("chipped_brass_anvil", CHIPPED_BRASS_ANVIL);
        this.registerModAnvil("damaged_brass_anvil", DAMAGED_BRASS_ANVIL);

        this.registerModAnvil("nickel_anvil", NICKEL_ANVIL);
        this.registerModAnvil("chipped_nickel_anvil", CHIPPED_NICKEL_ANVIL);
        this.registerModAnvil("damaged_nickel_anvil", DAMAGED_NICKEL_ANVIL);

        this.registerModAnvil("invar_anvil", INVAR_ANVIL);
        this.registerModAnvil("chipped_invar_anvil", CHIPPED_INVAR_ANVIL);
        this.registerModAnvil("damaged_invar_anvil", DAMAGED_INVAR_ANVIL);

        this.registerModAnvil("electrum_anvil", ELECTRUM_ANVIL);
        this.registerModAnvil("chipped_electrum_anvil", CHIPPED_ELECTRUM_ANVIL);
        this.registerModAnvil("damaged_electrum_anvil", DAMAGED_ELECTRUM_ANVIL);

        this.registerModAnvil("platinum_anvil", PLATINUM_ANVIL);
        this.registerModAnvil("chipped_platinum_anvil", CHIPPED_PLATINUM_ANVIL);
        this.registerModAnvil("damaged_platinum_anvil", DAMAGED_PLATINUM_ANVIL);

        this.registerModAnvil("chromium_anvil", CHROMIUM_ANVIL);
        this.registerModAnvil("chipped_chromium_anvil", CHIPPED_CHROMIUM_ANVIL);
        this.registerModAnvil("damaged_chromium_anvil", DAMAGED_CHROMIUM_ANVIL);

        this.registerModAnvil("iridium_anvil", IRIDIUM_ANVIL);
        this.registerModAnvil("chipped_iridium_anvil", CHIPPED_IRIDIUM_ANVIL);
        this.registerModAnvil("damaged_iridium_anvil", DAMAGED_IRIDIUM_ANVIL);

        this.registerModAnvil("aluminium_anvil", ALUMINIUM_ANVIL);
        this.registerModAnvil("chipped_aluminium_anvil", CHIPPED_ALUMINIUM_ANVIL);
        this.registerModAnvil("damaged_aluminium_anvil", DAMAGED_ALUMINIUM_ANVIL);

        this.registerModAnvil("titanium_anvil", TITANIUM_ANVIL);
        this.registerModAnvil("chipped_titanium_anvil", CHIPPED_TITANIUM_ANVIL);
        this.registerModAnvil("damaged_titanium_anvil", DAMAGED_TITANIUM_ANVIL);

        this.registerModAnvil("tungsten_anvil", TUNGSTEN_ANVIL);
        this.registerModAnvil("chipped_tungsten_anvil", CHIPPED_TUNGSTEN_ANVIL);
        this.registerModAnvil("damaged_tungsten_anvil", DAMAGED_TUNGSTEN_ANVIL);

        this.registerModAnvil("hot_tungstensteel_anvil", HOT_TUNGSTENSTEEL_ANVIL);
        this.registerModAnvil("chipped_hot_tungstensteel_anvil", CHIPPED_HOT_TUNGSTENSTEEL_ANVIL);
        this.registerModAnvil("damaged_hot_tungstensteel_anvil", DAMAGED_HOT_TUNGSTENSTEEL_ANVIL);

        this.registerModAnvil("tungstensteel_anvil", TUNGSTENSTEEL_ANVIL);
        this.registerModAnvil("chipped_tungstensteel_anvil", CHIPPED_TUNGSTENSTEEL_ANVIL);
        this.registerModAnvil("damaged_tungstensteel_anvil", DAMAGED_TUNGSTENSTEEL_ANVIL);

        this.registerModAnvil("advanced_alloy_anvil", ADVANCED_ALLOY_ANVIL);
        this.registerModAnvil("chipped_advanced_alloy_anvil", CHIPPED_ADVANCED_ALLOW_ANVIL);
        this.registerModAnvil("damaged_advanced_alloy_anvil", DAMAGED_ADVANCED_ALLOW_ANVIL);
    }

    public void registerClient() {
        FAUtils.setCutout(CHIPPED_TIN_ANVIL);
        FAUtils.setCutout(DAMAGED_TIN_ANVIL);

        FAUtils.setCutout(CHIPPED_SILVER_ANVIL);
        FAUtils.setCutout(DAMAGED_SILVER_ANVIL);

        FAUtils.setCutout(CHIPPED_LEAD_ANVIL);
        FAUtils.setCutout(DAMAGED_LEAD_ANVIL);

        FAUtils.setCutout(CHIPPED_REFINED_IRON_ANVIL);
        FAUtils.setCutout(DAMAGED_REFINED_IRON_ANVIL);

        FAUtils.setCutout(CHIPPED_SAPPHIRE_ANVIL);
        FAUtils.setCutout(DAMAGED_SAPPHIRE_ANVIL);

        FAUtils.setCutout(CHIPPED_RUBY_ANVIL);
        FAUtils.setCutout(DAMAGED_RUBY_ANVIL);

        FAUtils.setCutout(CHIPPED_PERIDOT_ANVIL);
        FAUtils.setCutout(DAMAGED_PERIDOT_ANVIL);

        FAUtils.setCutout(CHIPPED_RED_GARNET_ANVIL);
        FAUtils.setCutout(DAMAGED_RED_GARNET_ANVIL);

        FAUtils.setCutout(CHIPPED_YELLOW_GARNET_ANVIL);
        FAUtils.setCutout(DAMAGED_YELLOW_GARNET_ANVIL);

        FAUtils.setCutout(CHIPPED_ZINC_ANVIL);
        FAUtils.setCutout(DAMAGED_ZINC_ANVIL);

        FAUtils.setCutout(CHIPPED_STEEL_ANVIL);
        FAUtils.setCutout(DAMAGED_STEEL_ANVIL);

        FAUtils.setCutout(CHIPPED_BRONZE_ANVIL);
        FAUtils.setCutout(DAMAGED_BRONZE_ANVIL);

        FAUtils.setCutout(CHIPPED_BRASS_ANVIL);
        FAUtils.setCutout(DAMAGED_BRASS_ANVIL);

        FAUtils.setCutout(CHIPPED_NICKEL_ANVIL);
        FAUtils.setCutout(DAMAGED_NICKEL_ANVIL);

        FAUtils.setCutout(CHIPPED_INVAR_ANVIL);
        FAUtils.setCutout(DAMAGED_INVAR_ANVIL);

        FAUtils.setCutout(CHIPPED_ELECTRUM_ANVIL);
        FAUtils.setCutout(DAMAGED_ELECTRUM_ANVIL);

        FAUtils.setCutout(CHIPPED_PLATINUM_ANVIL);
        FAUtils.setCutout(DAMAGED_PLATINUM_ANVIL);

        FAUtils.setCutout(CHIPPED_CHROMIUM_ANVIL);
        FAUtils.setCutout(DAMAGED_CHROMIUM_ANVIL);

        FAUtils.setCutout(CHIPPED_IRIDIUM_ANVIL);
        FAUtils.setCutout(DAMAGED_IRIDIUM_ANVIL);

        FAUtils.setCutout(CHIPPED_ALUMINIUM_ANVIL);
        FAUtils.setCutout(DAMAGED_ALUMINIUM_ANVIL);

        FAUtils.setCutout(CHIPPED_TITANIUM_ANVIL);
        FAUtils.setCutout(DAMAGED_TITANIUM_ANVIL);

        FAUtils.setCutout(CHIPPED_TUNGSTEN_ANVIL);
        FAUtils.setCutout(DAMAGED_TUNGSTEN_ANVIL);

        FAUtils.setCutout(CHIPPED_HOT_TUNGSTENSTEEL_ANVIL);
        FAUtils.setCutout(DAMAGED_HOT_TUNGSTENSTEEL_ANVIL);

        FAUtils.setCutout(CHIPPED_TUNGSTENSTEEL_ANVIL);
        FAUtils.setCutout(DAMAGED_TUNGSTENSTEEL_ANVIL);

        FAUtils.setCutout(CHIPPED_ADVANCED_ALLOW_ANVIL);
        FAUtils.setCutout(DAMAGED_ADVANCED_ALLOW_ANVIL);
    }

}
