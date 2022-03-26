package fr.firstmegagame4.fabricanvils.FA.Blocks;

import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import fr.firstmegagame4.fabricanvils.FabricAnvilsMain;
import fr.firstmegagame4.fabricanvils.anvils.WoodenAnvil;
import fr.firstmegagame4.fabricanvils.anvils.techreborn.TinAnvil;
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
            .sounds(BlockSoundGroup.METAL));
    public static final BlockItem TIN_ANVIL_ITEM = new BlockItem(TIN_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block CHIPPED_TIN_ANVIL = new TinAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(5.0F)
            .sounds(BlockSoundGroup.METAL));
    public static final BlockItem CHIPPED_TIN_ANVIL_ITEM = new BlockItem(CHIPPED_TIN_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static final Block DAMAGED_TIN_ANVIL = new TinAnvil(FabricBlockSettings.of(Material.METAL)
            .hardness(3.0F)
            .sounds(BlockSoundGroup.METAL));
    public static final BlockItem DAMAGED_TIN_ANVIL_ITEM = new BlockItem(DAMAGED_TIN_ANVIL,
            new FabricItemSettings().group(FabricAnvilsMain.FABRICANVILS_GROUP));

    public static void registerTechRebornAnvil(String blockId, Block block, BlockItem blockItem) {
        FAUtils.registerAnvil("techreborn", blockId, block, blockItem);
    }

    public static void register() {
        registerTechRebornAnvil("rubber_anvil", RUBBER_ANVIL, RUBBER_ANVIL_ITEM);

        registerTechRebornAnvil("tin_anvil", TIN_ANVIL, TIN_ANVIL_ITEM);
        registerTechRebornAnvil("chipped_tin_anvil", CHIPPED_TIN_ANVIL, CHIPPED_TIN_ANVIL_ITEM);
        registerTechRebornAnvil("damaged_tin_anvil", DAMAGED_TIN_ANVIL, DAMAGED_TIN_ANVIL_ITEM);
    }

}
