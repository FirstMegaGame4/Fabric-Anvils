package fr.firstmegagame4.fabricanvils.FA;

import fr.firstmegagame4.fabricanvils.FabricAnvilsMain;
import fr.firstmegagame4.fabricanvils.anvils.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

public class FABlocks {

    public static final Block OAK_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(new BlockSoundGroup(
                    1F,
                    1F,
                    SoundEvents.BLOCK_WOOD_BREAK,
                    SoundEvents.BLOCK_WOOD_STEP,
                    SoundEvents.BLOCK_WOOD_PLACE,
                    SoundEvents.BLOCK_WOOD_HIT,
                    SoundEvents.BLOCK_WOOD_FALL
            )));
    public static final BlockItem OAK_ANVIL_ITEM = new BlockItem(OAK_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block SPRUCE_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(new BlockSoundGroup(
                    1F,
                    1F,
                    SoundEvents.BLOCK_WOOD_BREAK,
                    SoundEvents.BLOCK_WOOD_STEP,
                    SoundEvents.BLOCK_WOOD_PLACE,
                    SoundEvents.BLOCK_WOOD_HIT,
                    SoundEvents.BLOCK_WOOD_FALL
            )));
    public static final BlockItem SPRUCE_ANVIL_ITEM = new BlockItem(SPRUCE_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block BIRCH_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(new BlockSoundGroup(
                    1F,
                    1F,
                    SoundEvents.BLOCK_WOOD_BREAK,
                    SoundEvents.BLOCK_WOOD_STEP,
                    SoundEvents.BLOCK_WOOD_PLACE,
                    SoundEvents.BLOCK_WOOD_HIT,
                    SoundEvents.BLOCK_WOOD_FALL
            )));
    public static final BlockItem BIRCH_ANVIL_ITEM = new BlockItem(BIRCH_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block JUNGLE_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(new BlockSoundGroup(
                    1F,
                    1F,
                    SoundEvents.BLOCK_WOOD_BREAK,
                    SoundEvents.BLOCK_WOOD_STEP,
                    SoundEvents.BLOCK_WOOD_PLACE,
                    SoundEvents.BLOCK_WOOD_HIT,
                    SoundEvents.BLOCK_WOOD_FALL
            )));
    public static final BlockItem JUNGLE_ANVIL_ITEM = new BlockItem(JUNGLE_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block ACACIA_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(new BlockSoundGroup(
                    1F,
                    1F,
                    SoundEvents.BLOCK_WOOD_BREAK,
                    SoundEvents.BLOCK_WOOD_STEP,
                    SoundEvents.BLOCK_WOOD_PLACE,
                    SoundEvents.BLOCK_WOOD_HIT,
                    SoundEvents.BLOCK_WOOD_FALL
            )));
    public static final BlockItem ACACIA_ANVIL_ITEM = new BlockItem(ACACIA_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DARK_OAK_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(new BlockSoundGroup(
                    1F,
                    1F,
                    SoundEvents.BLOCK_WOOD_BREAK,
                    SoundEvents.BLOCK_WOOD_STEP,
                    SoundEvents.BLOCK_WOOD_PLACE,
                    SoundEvents.BLOCK_WOOD_HIT,
                    SoundEvents.BLOCK_WOOD_FALL
            )));
    public static final BlockItem DARK_OAK_ANVIL_ITEM = new BlockItem(DARK_OAK_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CRIMSON_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(new BlockSoundGroup(
                    1F,
                    1F,
                    SoundEvents.BLOCK_WOOD_BREAK,
                    SoundEvents.BLOCK_WOOD_STEP,
                    SoundEvents.BLOCK_WOOD_PLACE,
                    SoundEvents.BLOCK_WOOD_HIT,
                    SoundEvents.BLOCK_WOOD_FALL
            )));
    public static final BlockItem CRIMSON_ANVIL_ITEM = new BlockItem(CRIMSON_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block WARPED_ANVIL = new WoodenAnvil(FabricBlockSettings.of(Material.WOOD)
            .hardness(3.0F)
            .sounds(new BlockSoundGroup(
                    1F,
                    1F,
                    SoundEvents.BLOCK_WOOD_BREAK,
                    SoundEvents.BLOCK_WOOD_STEP,
                    SoundEvents.BLOCK_WOOD_PLACE,
                    SoundEvents.BLOCK_WOOD_HIT,
                    SoundEvents.BLOCK_WOOD_FALL
            )));
    public static final BlockItem WARPED_ANVIL_ITEM = new BlockItem(WARPED_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block STONE_ANVIL = new StoneAnvil(FabricBlockSettings.of(Material.STONE)
            .hardness(3.0F)
            .sounds(new BlockSoundGroup(
                    1F,
                    1F,
                    SoundEvents.BLOCK_STONE_BREAK,
                    SoundEvents.BLOCK_STONE_STEP,
                    SoundEvents.BLOCK_STONE_PLACE,
                    SoundEvents.BLOCK_STONE_HIT,
                    SoundEvents.BLOCK_STONE_FALL
            ))
            .requiresTool());
    public static final BlockItem STONE_ANVIL_ITEM = new BlockItem(STONE_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block GOLDEN_ANVIL = new GoldenAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(4.0F)
            .sounds(new BlockSoundGroup(
                    1F,
                    1F,
                    SoundEvents.BLOCK_METAL_BREAK,
                    SoundEvents.BLOCK_METAL_STEP,
                    SoundEvents.BLOCK_METAL_PLACE,
                    SoundEvents.BLOCK_METAL_HIT,
                    SoundEvents.BLOCK_METAL_FALL
            ))
            .requiresTool());
    public static final BlockItem GOLDEN_ANVIL_ITEM = new BlockItem(GOLDEN_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_GOLDEN_ANVIL = new GoldenAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(4.0F)
            .sounds(new BlockSoundGroup(
                    1F,
                    1F,
                    SoundEvents.BLOCK_METAL_BREAK,
                    SoundEvents.BLOCK_METAL_STEP,
                    SoundEvents.BLOCK_METAL_PLACE,
                    SoundEvents.BLOCK_METAL_HIT,
                    SoundEvents.BLOCK_METAL_FALL
            ))
            .requiresTool());
    public static final BlockItem DAMAGED_GOLDEN_ANVIL_ITEM = new BlockItem(DAMAGED_GOLDEN_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block COPPER_ANVIL = new CopperAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(4.0F)
            .sounds(new BlockSoundGroup(
                    1F,
                    1F,
                    SoundEvents.BLOCK_COPPER_BREAK,
                    SoundEvents.BLOCK_COPPER_STEP,
                    SoundEvents.BLOCK_COPPER_PLACE,
                    SoundEvents.BLOCK_COPPER_HIT,
                    SoundEvents.BLOCK_COPPER_FALL
            ))
            .requiresTool());
    public static final BlockItem COPPER_ANVIL_ITEM = new BlockItem(COPPER_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DIAMOND_ANVIL = new DiamondAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(new BlockSoundGroup(
                    1F,
                    1F,
                    SoundEvents.BLOCK_METAL_BREAK,
                    SoundEvents.BLOCK_METAL_STEP,
                    SoundEvents.BLOCK_METAL_PLACE,
                    SoundEvents.BLOCK_METAL_HIT,
                    SoundEvents.BLOCK_METAL_FALL
            ))
            .requiresTool());
    public static final BlockItem DIAMOND_ANVIL_ITEM = new BlockItem(DIAMOND_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_DIAMOND_ANVIL = new DiamondAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(new BlockSoundGroup(
                    1F,
                    1F,
                    SoundEvents.BLOCK_METAL_BREAK,
                    SoundEvents.BLOCK_METAL_STEP,
                    SoundEvents.BLOCK_METAL_PLACE,
                    SoundEvents.BLOCK_METAL_HIT,
                    SoundEvents.BLOCK_METAL_FALL
            ))
            .requiresTool());
    public static final BlockItem CHIPPED_DIAMOND_ANVIL_ITEM = new BlockItem(CHIPPED_DIAMOND_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_DIAMOND_ANVIL = new DiamondAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(new BlockSoundGroup(
                    1F,
                    1F,
                    SoundEvents.BLOCK_METAL_BREAK,
                    SoundEvents.BLOCK_METAL_STEP,
                    SoundEvents.BLOCK_METAL_PLACE,
                    SoundEvents.BLOCK_METAL_HIT,
                    SoundEvents.BLOCK_METAL_FALL
            ))
            .requiresTool());
    public static final BlockItem DAMAGED_DIAMOND_ANVIL_ITEM = new BlockItem(DAMAGED_DIAMOND_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

}
