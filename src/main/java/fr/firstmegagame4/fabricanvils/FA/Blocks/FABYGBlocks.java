package fr.firstmegagame4.fabricanvils.FA.Blocks;

import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import fr.firstmegagame4.fabricanvils.FabricAnvilsMain;
import fr.firstmegagame4.fabricanvils.anvils.StoneAnvil;
import fr.firstmegagame4.fabricanvils.anvils.WoodenAnvil;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;

public class FABYGBlocks {

    // Wooden BYG Anvils not implemented yet:
    // Holly
    // Imparius
    // Jacaranda
    // Lament
    // Mahogany
    // Mangrove
    // Maple
    // Nightshade
    // Palm
    // Pine
    // Rainbow Eucalyptus
    // Redwood
    // Skyris
    // Willow
    // Witch Hazel
    // Zelkova
    // Sythian
    // Embur

    public static final Block ASPEN_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.WOOD));
    public static final BlockItem ASPEN_ANVIL_ITEM = new BlockItem(ASPEN_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block BAOBAB_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.WOOD));
    public static final BlockItem BAOBAB_ANVIL_ITEM = new BlockItem(BAOBAB_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block BLUE_ENCHANTED_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.WOOD));
    public static final BlockItem BLUE_ENCHANTED_ANVIL_ITEM = new BlockItem(BLUE_ENCHANTED_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block BULBIS_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.NETHER_STEM));
    public static final BlockItem BULBIS_ANVIL_ITEM = new BlockItem(BULBIS_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHERRY_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.WOOD));
    public static final BlockItem CHERRY_ANVIL_ITEM = new BlockItem(CHERRY_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CIKA_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.WOOD));
    public static final BlockItem CIKA_ANVIL_ITEM = new BlockItem(CIKA_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CYPRESS_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.WOOD));
    public static final BlockItem CYPRESS_ANVIL_ITEM = new BlockItem(CYPRESS_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block EBONY_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.WOOD));
    public static final BlockItem EBONY_ANVIL_ITEM = new BlockItem(EBONY_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block ETHER_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.WOOD));
    public static final BlockItem ETHER_ANVIL_ITEM = new BlockItem(ETHER_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block FIR_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.WOOD));
    public static final BlockItem FIR_ANVIL_ITEM = new BlockItem(FIR_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block GREEN_ENCHANTED_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.WOOD));
    public static final BlockItem GREEN_ENCHANTED_ANVIL_ITEM = new BlockItem(GREEN_ENCHANTED_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DACITE_ANVIL = new StoneAnvil(FabricBlockSettings.of(Material.STONE)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool());
    public static final BlockItem DACITE_ANVIL_ITEM = new BlockItem(DACITE_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static void registerBYGAnvil(String blockId, BlockItem blockItem, Block block) {
        FAUtils.registerAnvil("byg", blockId, blockItem, block);
    }

    public static void register() {
        registerBYGAnvil("aspen_anvil", ASPEN_ANVIL_ITEM, ASPEN_ANVIL);
        registerBYGAnvil("baobab_anvil", BAOBAB_ANVIL_ITEM, BAOBAB_ANVIL);
        registerBYGAnvil("blue_enchanted_anvil", BLUE_ENCHANTED_ANVIL_ITEM, BLUE_ENCHANTED_ANVIL);
        registerBYGAnvil("bulbis_anvil", BULBIS_ANVIL_ITEM, BULBIS_ANVIL);
        registerBYGAnvil("cherry_anvil", CHERRY_ANVIL_ITEM, CHERRY_ANVIL);
        registerBYGAnvil("cika_anvil", CIKA_ANVIL_ITEM, CIKA_ANVIL);
        registerBYGAnvil("cypress_anvil", CYPRESS_ANVIL_ITEM, CYPRESS_ANVIL);
        registerBYGAnvil("ebony_anvil", EBONY_ANVIL_ITEM, EBONY_ANVIL);
        registerBYGAnvil("ether_anvil", ETHER_ANVIL_ITEM, ETHER_ANVIL);
        registerBYGAnvil("fir_anvil", FIR_ANVIL_ITEM, FIR_ANVIL);
        registerBYGAnvil("green_enchanted_anvil", GREEN_ENCHANTED_ANVIL_ITEM, GREEN_ENCHANTED_ANVIL);

        registerBYGAnvil("dacite_anvil", DACITE_ANVIL_ITEM, DACITE_ANVIL);
    }

}
