package fr.firstmegagame4.fabricanvils.FA.Blocks;

import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import fr.firstmegagame4.fabricanvils.FabricAnvilsMain;
import fr.firstmegagame4.fabricanvils.anvils.WoodenAnvil;
import fr.firstmegagame4.fabricanvils.anvils.techreborn.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;

public class FATechRebornBlocks {

    public static final Block RUBBER_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.WOOD));
    public static final BlockItem RUBBER_ANVIL_ITEM = new BlockItem(RUBBER_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block TIN_ANVIL = new TinAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem TIN_ANVIL_ITEM = new BlockItem(TIN_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_TIN_ANVIL = new TinAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_TIN_ANVIL_ITEM = new BlockItem(CHIPPED_TIN_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_TIN_ANVIL = new TinAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_TIN_ANVIL_ITEM = new BlockItem(DAMAGED_TIN_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block SILVER_ANVIL = new SilverAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem SILVER_ANVIL_ITEM = new BlockItem(SILVER_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_SILVER_ANVIL = new SilverAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_SILVER_ANVIL_ITEM = new BlockItem(CHIPPED_SILVER_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_SILVER_ANVIL = new SilverAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_SILVER_ANVIL_ITEM = new BlockItem(DAMAGED_SILVER_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block LEAD_ANVIL = new LeadAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem LEAD_ANVIL_ITEM = new BlockItem(LEAD_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_LEAD_ANVIL = new LeadAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_LEAD_ANVIL_ITEM = new BlockItem(CHIPPED_LEAD_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_LEAD_ANVIL = new LeadAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_LEAD_ANVIL_ITEM = new BlockItem(DAMAGED_LEAD_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block REFINED_IRON_ANVIL = new RefinedIronAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem REFINED_IRON_ANVIL_ITEM = new BlockItem(REFINED_IRON_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_REFINED_IRON_ANVIL = new RefinedIronAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_REFINED_IRON_ANVIL_ITEM = new BlockItem(CHIPPED_REFINED_IRON_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_REFINED_IRON_ANVIL = new RefinedIronAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_REFINED_IRON_ANVIL_ITEM = new BlockItem(DAMAGED_REFINED_IRON_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block SAPPHIRE_ANVIL = new SapphireAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem SAPPHIRE_ANVIL_ITEM = new BlockItem(SAPPHIRE_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_SAPPHIRE_ANVIL = new SapphireAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_SAPPHIRE_ANVIL_ITEM = new BlockItem(CHIPPED_SAPPHIRE_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_SAPPHIRE_ANVIL = new SapphireAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_SAPPHIRE_ANVIL_ITEM = new BlockItem(DAMAGED_SAPPHIRE_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block RUBY_ANVIL = new RubyAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem RUBY_ANVIL_ITEM = new BlockItem(RUBY_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_RUBY_ANVIL = new RubyAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_RUBY_ANVIL_ITEM = new BlockItem(CHIPPED_RUBY_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_RUBY_ANVIL = new RubyAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_RUBY_ANVIL_ITEM = new BlockItem(DAMAGED_RUBY_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block PERIDOT_ANVIL = new PeridotAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem PERIDOT_ANVIL_ITEM = new BlockItem(PERIDOT_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_PERIDOT_ANVIL = new PeridotAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_PERIDOT_ANVIL_ITEM = new BlockItem(CHIPPED_PERIDOT_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_PERIDOT_ANVIL = new PeridotAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_PERIDOT_ANVIL_ITEM = new BlockItem(DAMAGED_PERIDOT_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block RED_GARNET_ANVIL = new RedGarnetAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem RED_GARNET_ANVIL_ITEM = new BlockItem(RED_GARNET_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_RED_GARNET_ANVIL = new RedGarnetAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_RED_GARNET_ANVIL_ITEM = new BlockItem(CHIPPED_RED_GARNET_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_RED_GARNET_ANVIL = new RedGarnetAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_RED_GARNET_ANVIL_ITEM = new BlockItem(DAMAGED_RED_GARNET_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block YELLOW_GARNET_ANVIL = new YellowGarnetAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem YELLOW_GARNET_ANVIL_ITEM = new BlockItem(YELLOW_GARNET_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_YELLOW_GARNET_ANVIL = new YellowGarnetAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_YELLOW_GARNET_ANVIL_ITEM = new BlockItem(CHIPPED_YELLOW_GARNET_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_YELLOW_GARNET_ANVIL = new YellowGarnetAnvil(FabricBlockSettings.of(Material.METAL)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_YELLOW_GARNET_ANVIL_ITEM = new BlockItem(DAMAGED_YELLOW_GARNET_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block ZINC_ANVIL = new ZincAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem ZINC_ANVIL_ITEM = new BlockItem(ZINC_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_ZINC_ANVIL = new ZincAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_ZINC_ANVIL_ITEM = new BlockItem(CHIPPED_ZINC_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_ZINC_ANVIL = new ZincAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_ZINC_ANVIL_ITEM = new BlockItem(DAMAGED_ZINC_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block STEEL_ANVIL = new SteelAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem STEEL_ANVIL_ITEM = new BlockItem(STEEL_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_STEEL_ANVIL = new SteelAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_STEEL_ANVIL_ITEM = new BlockItem(CHIPPED_STEEL_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_STEEL_ANVIL = new SteelAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_STEEL_ANVIL_ITEM = new BlockItem(DAMAGED_STEEL_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block BRONZE_ANVIL = new BronzeAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem BRONZE_ANVIL_ITEM = new BlockItem(BRONZE_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_BRONZE_ANVIL = new BronzeAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_BRONZE_ANVIL_ITEM = new BlockItem(CHIPPED_BRONZE_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_BRONZE_ANVIL = new BronzeAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_BRONZE_ANVIL_ITEM = new BlockItem(DAMAGED_BRONZE_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block BRASS_ANVIL = new BrassAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem BRASS_ANVIL_ANVIL = new BlockItem(BRASS_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_BRASS_ANVIL = new BrassAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_BRASS_ANVIL_ITEM = new BlockItem(CHIPPED_BRASS_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_BRASS_ANVIL = new BrassAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_BRASS_ANVIL_ITEM = new BlockItem(DAMAGED_BRASS_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block NICKEL_ANVIL = new NickelAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem NICKEL_ANVIL_ITEM = new BlockItem(NICKEL_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_NICKEL_ANVIL = new NickelAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_NICKEL_ANVIL_ITEM = new BlockItem(CHIPPED_NICKEL_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_NICKEL_ANVIL = new NickelAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_NICKEL_ANVIL_ITEM = new BlockItem(DAMAGED_NICKEL_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block INVAR_ANVIL = new InvarAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem INVAR_ANVIL_ITEM = new BlockItem(INVAR_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_INVAR_ANVIL = new InvarAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_INVAR_ANVIL_ITEM = new BlockItem(CHIPPED_INVAR_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_INVAR_ANVIL = new InvarAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_INVAR_ANVIL_ITEM = new BlockItem(DAMAGED_INVAR_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block ELECTRUM_ANVIL = new ElectrumAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem ELECTRUM_ANVIL_ITEM = new BlockItem(ELECTRUM_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_ELECTRUM_ANVIL = new ElectrumAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_ELECTRUM_ANVIL_ITEM = new BlockItem(CHIPPED_ELECTRUM_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_ELECTRUM_ANVIL = new ElectrumAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_ELECTRUM_ANVIL_ITEM = new BlockItem(DAMAGED_ELECTRUM_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block PLATINUM_ANVIL = new PlatinumAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem PLATINUM_ANVIL_ITEM = new BlockItem(PLATINUM_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_PLATINUM_ANVIL = new PlatinumAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_PLATINUM_ANVIL_ITEM = new BlockItem(CHIPPED_PLATINUM_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_PLATINUM_ANVIL = new PlatinumAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_PLATINUM_ANVIL_ITEM = new BlockItem(DAMAGED_PLATINUM_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHROMIUM_ANVIL = new ChromiumAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHROMIUM_ANVIL_ITEM = new BlockItem(CHROMIUM_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_CHROMIUM_ANVIL = new ChromiumAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_CHROMIUM_ANVIL_ITEM = new BlockItem(CHIPPED_CHROMIUM_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_CHROMIUM_ANVIL = new ChromiumAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_CHROMIUM_ANVIL_ITEM = new BlockItem(DAMAGED_CHROMIUM_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block IRIDIUM_ANVIL = new IridiumAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem IRIDIUM_ANVIL_ITEM = new BlockItem(IRIDIUM_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_IRIDIUM_ANVIL = new IridiumAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_IRIDIUM_ANVIL_ITEM = new BlockItem(CHIPPED_IRIDIUM_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_IRIDIUM_ANVIL = new IridiumAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_IRIDIUM_ANVIL_ITEM = new BlockItem(DAMAGED_IRIDIUM_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block ALUMINIUM_ANVIL = new AluminiumAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem ALUMINIUM_ANVIL_ITEM = new BlockItem(ALUMINIUM_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_ALUMINIUM_ANVIL = new AluminiumAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_ALUMINIUM_ANVIL_ITEM = new BlockItem(CHIPPED_ALUMINIUM_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_ALUMINIUM_ANVIL = new AluminiumAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_ALUMINIUM_ANVIL_ITEM = new BlockItem(DAMAGED_ALUMINIUM_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block TITANIUM_ANVIL = new TitaniumAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem TITANIUM_ANVIL_ITEM = new BlockItem(TITANIUM_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_TITANIUM_ANVIL = new TitaniumAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_TITANIUM_ANVIL_ITEM = new BlockItem(CHIPPED_TITANIUM_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_TITANIUM_ANVIL = new TitaniumAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_TITANIUM_ANVIL_ITEM = new BlockItem(DAMAGED_TITANIUM_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block TUNGSTEN_ANVIL = new TungstenAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem TUNGSTEN_ANVIL_ITEM = new BlockItem(TUNGSTEN_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_TUNGSTEN_ANVIL = new TungstenAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_TUNGSTEN_ANVIL_ITEM = new BlockItem(CHIPPED_TUNGSTEN_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_TUNGSTEN_ANVIL = new TungstenAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_TUNGSTEN_ANVIL_ITEM = new BlockItem(DAMAGED_TUNGSTEN_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block HOT_TUNGSTENSTEEL_ANVIL = new HotTungstensteelAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem HOT_TUNGSTENSTEEL_ANVIL_ITEM = new BlockItem(HOT_TUNGSTENSTEEL_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_HOT_TUNGSTENSTEEL_ANVIL = new HotTungstensteelAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_HOT_TUNGSTENSTEEL_ANVIL_ITEM = new BlockItem(CHIPPED_HOT_TUNGSTENSTEEL_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_HOT_TUNGSTENSTEEL_ANVIL = new HotTungstensteelAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_HOT_TUNGSTENSTEEL_ANVIL_ITEM = new BlockItem(DAMAGED_HOT_TUNGSTENSTEEL_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block TUNGSTENSTEEL_ANVIL = new TungstensteelAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem TUNGSTENSTEEL_ANVIL_ITEM = new BlockItem(TUNGSTENSTEEL_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_TUNGSTENSTEEL_ANVIL = new TungstensteelAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_TUNGSTENSTEEL_ANVIL_ITEM = new BlockItem(CHIPPED_TUNGSTENSTEEL_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_TUNGSTENSTEEL_ANVIL = new TungstensteelAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_TUNGSTENSTEEL_ANVIL_ITEM = new BlockItem(DAMAGED_TUNGSTENSTEEL_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block ADVANCED_ALLOY_ANVIL = new AdvancedAlloyAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem ADVANCED_ALLOY_ANVIL_ITEM = new BlockItem(ADVANCED_ALLOY_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_ADVANCED_ALLOW_ANVIL = new AdvancedAlloyAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_ADVANCED_ALLOW_ANVIL_ITEM = new BlockItem(CHIPPED_ADVANCED_ALLOW_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_ADVANCED_ALLOW_ANVIL = new AdvancedAlloyAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_ADVANCED_ALLOW_ANVIL_ITEM = new BlockItem(DAMAGED_ADVANCED_ALLOW_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static void registerTechRebornAnvil(String blockId, Block block, BlockItem blockItem) {
        FAUtils.registerAnvil("techreborn", blockId, block, blockItem);
    }

    public static void register() {
        registerTechRebornAnvil("rubber_anvil", RUBBER_ANVIL, RUBBER_ANVIL_ITEM);

        registerTechRebornAnvil("tin_anvil", TIN_ANVIL, TIN_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_tin_anvil", CHIPPED_TIN_ANVIL, CHIPPED_TIN_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_tin_anvil", DAMAGED_TIN_ANVIL, DAMAGED_TIN_ANVIL_ITEM);

        registerTechRebornAnvil("silver_anvil", SILVER_ANVIL, SILVER_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_silver_anvil", CHIPPED_SILVER_ANVIL, CHIPPED_SILVER_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_silver_anvil", DAMAGED_SILVER_ANVIL, DAMAGED_SILVER_ANVIL_ITEM);

        registerTechRebornAnvil("lead_anvil", LEAD_ANVIL, LEAD_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_lead_anvil", CHIPPED_LEAD_ANVIL, CHIPPED_LEAD_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_lead_anvil", DAMAGED_LEAD_ANVIL, DAMAGED_LEAD_ANVIL_ITEM);

        registerTechRebornAnvil("refined_iron_anvil", REFINED_IRON_ANVIL, REFINED_IRON_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_refined_iron_anvil", CHIPPED_REFINED_IRON_ANVIL, CHIPPED_REFINED_IRON_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_refined_iron_anvil", DAMAGED_REFINED_IRON_ANVIL, DAMAGED_REFINED_IRON_ANVIL_ITEM);

        registerTechRebornAnvil("sapphire_anvil", SAPPHIRE_ANVIL, SAPPHIRE_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_sapphire_anvil", CHIPPED_SAPPHIRE_ANVIL, CHIPPED_SAPPHIRE_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_sapphire_anvil", DAMAGED_SAPPHIRE_ANVIL, DAMAGED_SAPPHIRE_ANVIL_ITEM);

        registerTechRebornAnvil("ruby_anvil", RUBY_ANVIL, RUBY_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_ruby_anvil", CHIPPED_RUBY_ANVIL, CHIPPED_RUBY_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_ruby_anvil", DAMAGED_RUBY_ANVIL, DAMAGED_RUBY_ANVIL_ITEM);

        registerTechRebornAnvil("peridot_anvil", PERIDOT_ANVIL, PERIDOT_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_peridot_anvil", CHIPPED_PERIDOT_ANVIL, CHIPPED_PERIDOT_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_peridot_anvil", DAMAGED_PERIDOT_ANVIL, DAMAGED_PERIDOT_ANVIL_ITEM);

        registerTechRebornAnvil("red_garnet_anvil", RED_GARNET_ANVIL, RED_GARNET_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_red_garnet_anvil", CHIPPED_RED_GARNET_ANVIL, CHIPPED_RED_GARNET_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_red_garnet_anvil", DAMAGED_RED_GARNET_ANVIL, DAMAGED_RED_GARNET_ANVIL_ITEM);

        registerTechRebornAnvil("yellow_garnet_anvil", YELLOW_GARNET_ANVIL, YELLOW_GARNET_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_yellow_garnet_anvil", CHIPPED_YELLOW_GARNET_ANVIL, CHIPPED_YELLOW_GARNET_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_yellow_garnet_anvil", DAMAGED_YELLOW_GARNET_ANVIL, DAMAGED_YELLOW_GARNET_ANVIL_ITEM);

        registerTechRebornAnvil("zinc_anvil", ZINC_ANVIL, ZINC_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_zinc_anvil", CHIPPED_ZINC_ANVIL, CHIPPED_ZINC_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_zinc_anvil", DAMAGED_ZINC_ANVIL, DAMAGED_ZINC_ANVIL_ITEM);

        registerTechRebornAnvil("steel_anvil", STEEL_ANVIL, STEEL_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_steel_anvil", CHIPPED_STEEL_ANVIL, CHIPPED_STEEL_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_steel_anvil", DAMAGED_STEEL_ANVIL, DAMAGED_STEEL_ANVIL_ITEM);

        registerTechRebornAnvil("bronze_anvil", BRONZE_ANVIL, BRONZE_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_bronze_anvil", CHIPPED_BRONZE_ANVIL, CHIPPED_BRONZE_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_bronze_anvil", DAMAGED_BRONZE_ANVIL, DAMAGED_BRONZE_ANVIL_ITEM);

        registerTechRebornAnvil("brass_anvil", BRASS_ANVIL, BRASS_ANVIL_ANVIL);
        registerTechRebornAnvil("chipped_brass_anvil", CHIPPED_BRASS_ANVIL, CHIPPED_BRASS_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_brass_anvil", DAMAGED_BRASS_ANVIL, DAMAGED_BRASS_ANVIL_ITEM);

        registerTechRebornAnvil("nickel_anvil", NICKEL_ANVIL, NICKEL_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_nickel_anvil", CHIPPED_NICKEL_ANVIL, CHIPPED_NICKEL_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_nickel_anvil", DAMAGED_NICKEL_ANVIL, DAMAGED_NICKEL_ANVIL_ITEM);

        registerTechRebornAnvil("invar_anvil", INVAR_ANVIL, INVAR_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_invar_anvil", CHIPPED_INVAR_ANVIL, CHIPPED_INVAR_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_invar_anvil", DAMAGED_INVAR_ANVIL, DAMAGED_INVAR_ANVIL_ITEM);

        registerTechRebornAnvil("electrum_anvil", ELECTRUM_ANVIL, ELECTRUM_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_electrum_anvil", CHIPPED_ELECTRUM_ANVIL, CHIPPED_ELECTRUM_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_electrum_anvil", DAMAGED_ELECTRUM_ANVIL, DAMAGED_ELECTRUM_ANVIL_ITEM);

        registerTechRebornAnvil("platinum_anvil", PLATINUM_ANVIL, PLATINUM_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_platinum_anvil", CHIPPED_PLATINUM_ANVIL, CHIPPED_PLATINUM_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_platinum_anvil", DAMAGED_PLATINUM_ANVIL, DAMAGED_PLATINUM_ANVIL_ITEM);

        registerTechRebornAnvil("chromium_anvil", CHROMIUM_ANVIL, CHROMIUM_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_chromium_anvil", CHIPPED_CHROMIUM_ANVIL, CHIPPED_CHROMIUM_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_chromium_anvil", DAMAGED_CHROMIUM_ANVIL, DAMAGED_CHROMIUM_ANVIL_ITEM);

        registerTechRebornAnvil("iridium_anvil", IRIDIUM_ANVIL, IRIDIUM_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_iridium_anvil", CHIPPED_IRIDIUM_ANVIL, CHIPPED_IRIDIUM_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_iridium_anvil", DAMAGED_IRIDIUM_ANVIL, DAMAGED_IRIDIUM_ANVIL_ITEM);

        registerTechRebornAnvil("aluminium_anvil", ALUMINIUM_ANVIL, ALUMINIUM_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_aluminium_anvil", CHIPPED_ALUMINIUM_ANVIL, CHIPPED_ALUMINIUM_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_aluminium_anvil", DAMAGED_ALUMINIUM_ANVIL, DAMAGED_ALUMINIUM_ANVIL_ITEM);

        registerTechRebornAnvil("titanium_anvil", TITANIUM_ANVIL, TITANIUM_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_titanium_anvil", CHIPPED_TITANIUM_ANVIL, CHIPPED_TITANIUM_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_titanium_anvil", DAMAGED_TITANIUM_ANVIL, DAMAGED_TITANIUM_ANVIL_ITEM);

        registerTechRebornAnvil("tungsten_anvil", TUNGSTEN_ANVIL, TUNGSTEN_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_tungsten_anvil", CHIPPED_TUNGSTEN_ANVIL, CHIPPED_TUNGSTEN_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_tungsten_anvil", DAMAGED_TUNGSTEN_ANVIL, DAMAGED_TUNGSTEN_ANVIL_ITEM);

        registerTechRebornAnvil("hot_tungstensteel_anvil", HOT_TUNGSTENSTEEL_ANVIL, HOT_TUNGSTENSTEEL_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_hot_tungstensteel_anvil", CHIPPED_HOT_TUNGSTENSTEEL_ANVIL, CHIPPED_HOT_TUNGSTENSTEEL_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_hot_tungstensteel_anvil", DAMAGED_HOT_TUNGSTENSTEEL_ANVIL, DAMAGED_HOT_TUNGSTENSTEEL_ANVIL_ITEM);

        registerTechRebornAnvil("tungstensteel_anvil", TUNGSTENSTEEL_ANVIL, TUNGSTENSTEEL_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_tungstensteel_anvil", CHIPPED_TUNGSTENSTEEL_ANVIL, CHIPPED_TUNGSTENSTEEL_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_tungstensteel_anvil", DAMAGED_TUNGSTENSTEEL_ANVIL, DAMAGED_TUNGSTENSTEEL_ANVIL_ITEM);

        registerTechRebornAnvil("advanced_alloy_anvil", ADVANCED_ALLOY_ANVIL, ADVANCED_ALLOY_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_advanced_alloy_anvil", CHIPPED_ADVANCED_ALLOW_ANVIL, CHIPPED_ADVANCED_ALLOW_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_advanced_alloy_anvil", DAMAGED_ADVANCED_ALLOW_ANVIL, DAMAGED_ADVANCED_ALLOW_ANVIL_ITEM);
    }

    public static void registerRenderLayers() {
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
