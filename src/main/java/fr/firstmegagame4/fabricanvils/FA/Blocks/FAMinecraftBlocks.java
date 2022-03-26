package fr.firstmegagame4.fabricanvils.FA.Blocks;

import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import fr.firstmegagame4.fabricanvils.FabricAnvilsMain;
import fr.firstmegagame4.fabricanvils.anvils.*;
import fr.firstmegagame4.fabricanvils.anvils.minecraft.CopperAnvil;
import fr.firstmegagame4.fabricanvils.anvils.minecraft.DiamondAnvil;
import fr.firstmegagame4.fabricanvils.anvils.minecraft.GoldenAnvil;
import fr.firstmegagame4.fabricanvils.anvils.minecraft.NetheriteAnvil;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;

public class FAMinecraftBlocks {

    public static final Block OAK_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.WOOD));
    public static final BlockItem OAK_ANVIL_ITEM = new BlockItem(OAK_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block SPRUCE_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.WOOD));
    public static final BlockItem SPRUCE_ANVIL_ITEM = new BlockItem(SPRUCE_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block BIRCH_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.WOOD));
    public static final BlockItem BIRCH_ANVIL_ITEM = new BlockItem(BIRCH_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block JUNGLE_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.WOOD));
    public static final BlockItem JUNGLE_ANVIL_ITEM = new BlockItem(JUNGLE_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block ACACIA_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.WOOD));
    public static final BlockItem ACACIA_ANVIL_ITEM = new BlockItem(ACACIA_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DARK_OAK_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.WOOD));
    public static final BlockItem DARK_OAK_ANVIL_ITEM = new BlockItem(DARK_OAK_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CRIMSON_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.NETHER_STEM));
    public static final BlockItem CRIMSON_ANVIL_ITEM = new BlockItem(CRIMSON_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block WARPED_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.NETHER_STEM));
    public static final BlockItem WARPED_ANVIL_ITEM = new BlockItem(WARPED_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block STONE_ANVIL = new StoneAnvil(FabricBlockSettings.of(Material.STONE)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool());
    public static final BlockItem STONE_ANVIL_ITEM = new BlockItem(STONE_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block GOLDEN_ANVIL = new GoldenAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(4.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem GOLDEN_ANVIL_ITEM = new BlockItem(GOLDEN_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_GOLDEN_ANVIL = new GoldenAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(4.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_GOLDEN_ANVIL_ITEM = new BlockItem(DAMAGED_GOLDEN_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block COPPER_ANVIL = new CopperAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(4.0F)
            .sounds(BlockSoundGroup.COPPER)
            .requiresTool());
    public static final BlockItem COPPER_ANVIL_ITEM = new BlockItem(COPPER_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_COPPER_ANVIL = new CopperAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(4.0F)
            .sounds(BlockSoundGroup.COPPER)
            .requiresTool());
    public static final BlockItem CHIPPED_COPPER_ANVIL_ITEM = new BlockItem(CHIPPED_COPPER_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_COPPER_ANVIL = new CopperAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(4.0F)
            .sounds(BlockSoundGroup.COPPER)
            .requiresTool());
    public static final BlockItem DAMAGED_COPPER_ANVIL_ITEM = new BlockItem(DAMAGED_COPPER_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DIAMOND_ANVIL = new DiamondAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DIAMOND_ANVIL_ITEM = new BlockItem(DIAMOND_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_DIAMOND_ANVIL = new DiamondAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem CHIPPED_DIAMOND_ANVIL_ITEM = new BlockItem(CHIPPED_DIAMOND_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_DIAMOND_ANVIL = new DiamondAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL)
            .requiresTool());
    public static final BlockItem DAMAGED_DIAMOND_ANVIL_ITEM = new BlockItem(DAMAGED_DIAMOND_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block NETHERITE_ANVIL = new NetheriteAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(50.0F)
            .resistance(1200F)
            .sounds(BlockSoundGroup.NETHERITE)
            .requiresTool());
    public static final BlockItem NETHERITE_ANVIL_ITEM = new BlockItem(NETHERITE_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_NETHERITE_ANVIL = new NetheriteAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(50.0F)
            .resistance(1200F)
            .sounds(BlockSoundGroup.NETHERITE)
            .requiresTool());
    public static final BlockItem CHIPPED_NETHERITE_ANVIL_ITEM = new BlockItem(CHIPPED_NETHERITE_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_NETHERITE_ANVIL = new NetheriteAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(50.0F)
            .resistance(1200F)
            .sounds(BlockSoundGroup.NETHERITE)
            .requiresTool());
    public static final BlockItem DAMAGED_NETHERITE_ANVIL_ITEM = new BlockItem(DAMAGED_NETHERITE_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static void registerMinecraftAnvil(String blockId, Block block, BlockItem blockItem) {
        FAUtils.registerAnvil("minecraft", blockId, block, blockItem);
    }

    public static void register() {
        registerMinecraftAnvil("oak_anvil", OAK_ANVIL, OAK_ANVIL_ITEM);
        registerMinecraftAnvil("spruce_anvil", SPRUCE_ANVIL, SPRUCE_ANVIL_ITEM);
        registerMinecraftAnvil("birch_anvil", BIRCH_ANVIL, BIRCH_ANVIL_ITEM);
        registerMinecraftAnvil("jungle_anvil", JUNGLE_ANVIL, JUNGLE_ANVIL_ITEM);
        registerMinecraftAnvil("acacia_anvil", ACACIA_ANVIL, ACACIA_ANVIL_ITEM);
        registerMinecraftAnvil("dark_oak_anvil", DARK_OAK_ANVIL, DARK_OAK_ANVIL_ITEM);
        registerMinecraftAnvil("crimson_anvil", CRIMSON_ANVIL, CRIMSON_ANVIL_ITEM);
        registerMinecraftAnvil("warped_anvil", WARPED_ANVIL, WARPED_ANVIL_ITEM);

        registerMinecraftAnvil("stone_anvil", STONE_ANVIL, STONE_ANVIL_ITEM);

        registerMinecraftAnvil("golden_anvil", GOLDEN_ANVIL, GOLDEN_ANVIL_ITEM);
        registerMinecraftAnvil("damaged_golden_anvil", DAMAGED_GOLDEN_ANVIL, DAMAGED_GOLDEN_ANVIL_ITEM);

        registerMinecraftAnvil("copper_anvil", COPPER_ANVIL, COPPER_ANVIL_ITEM);
        registerMinecraftAnvil("chipped_copper_anvil", CHIPPED_COPPER_ANVIL, CHIPPED_COPPER_ANVIL_ITEM);
        registerMinecraftAnvil("damaged_copper_anvil", DAMAGED_COPPER_ANVIL, DAMAGED_COPPER_ANVIL_ITEM);

        registerMinecraftAnvil("diamond_anvil", DIAMOND_ANVIL, DIAMOND_ANVIL_ITEM);
        registerMinecraftAnvil("chipped_diamond_anvil", CHIPPED_DIAMOND_ANVIL, CHIPPED_DIAMOND_ANVIL_ITEM);
        registerMinecraftAnvil("damaged_diamond_anvil", DAMAGED_DIAMOND_ANVIL, DAMAGED_DIAMOND_ANVIL_ITEM);

        registerMinecraftAnvil("netherite_anvil", NETHERITE_ANVIL, NETHERITE_ANVIL_ITEM);
        registerMinecraftAnvil("chipped_netherite_anvil", CHIPPED_NETHERITE_ANVIL, CHIPPED_NETHERITE_ANVIL_ITEM);
        registerMinecraftAnvil("damaged_netherite_anvil", DAMAGED_NETHERITE_ANVIL, DAMAGED_NETHERITE_ANVIL_ITEM);
    }

}
