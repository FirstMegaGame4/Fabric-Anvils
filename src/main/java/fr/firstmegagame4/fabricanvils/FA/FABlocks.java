package fr.firstmegagame4.fabricanvils.FA;

import fr.firstmegagame4.fabricanvils.FabricAnvilsMain;
import fr.firstmegagame4.fabricanvils.anvils.WoodAnvil;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

public class FABlocks {

    public static final Block OAK_ANVIL = new WoodAnvil(FabricBlockSettings.of(Material.WOOD)
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

    public static final Block SPRUCE_ANVIL = new WoodAnvil(FabricBlockSettings.of(Material.WOOD)
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

    public static final Block BIRCH_ANVIL = new WoodAnvil(FabricBlockSettings.of(Material.WOOD)
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

    public static final Block JUNGLE_ANVIL = new WoodAnvil(FabricBlockSettings.of(Material.WOOD)
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

    public static final Block ACACIA_ANVIL = new WoodAnvil(FabricBlockSettings.of(Material.WOOD)
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

    public static final Block DARK_OAK_ANVIL = new WoodAnvil(FabricBlockSettings.of(Material.WOOD)
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

    public static final Block CRIMSON_ANVIL = new WoodAnvil(FabricBlockSettings.of(Material.WOOD)
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

    public static final Block WARPED_ANVIL = new WoodAnvil(FabricBlockSettings.of(Material.WOOD)
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

}
