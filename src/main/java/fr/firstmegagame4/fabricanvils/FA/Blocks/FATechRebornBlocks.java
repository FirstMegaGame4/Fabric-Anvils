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

    public static void registerTechRebornAnvil(String blockId, Block block, BlockItem blockItem) {
        FAUtils.registerAnvil("techreborn", blockId, block, blockItem);
    }

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
    }

}
