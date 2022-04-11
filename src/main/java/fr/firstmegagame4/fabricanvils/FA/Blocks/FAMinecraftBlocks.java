package fr.firstmegagame4.fabricanvils.FA.Blocks;

import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import fr.firstmegagame4.fabricanvils.anvils.*;
import fr.firstmegagame4.fabricanvils.anvils.minecraft.CopperAnvil;
import fr.firstmegagame4.fabricanvils.anvils.minecraft.DiamondAnvil;
import fr.firstmegagame4.fabricanvils.anvils.minecraft.GoldenAnvil;
import fr.firstmegagame4.fabricanvils.anvils.minecraft.NetheriteAnvil;

public class FAMinecraftBlocks {

    public static final CustomAnvil OAK_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil SPRUCE_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil BIRCH_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil JUNGLE_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil ACACIA_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil DARK_OAK_ANVIL = new NormalWoodAnvil();
    public static final CustomAnvil CRIMSON_ANVIL = new NetherWoodAnvil();
    public static final CustomAnvil WARPED_ANVIL = new NetherWoodAnvil();
    public static final CustomAnvil STONE_ANVIL = new StoneAnvil();

    public static final CustomAnvil GOLDEN_ANVIL = new GoldenAnvil();
    public static final CustomAnvil DAMAGED_GOLDEN_ANVIL = new GoldenAnvil();

    public static final CustomAnvil COPPER_ANVIL = new CopperAnvil();
    public static final CustomAnvil CHIPPED_COPPER_ANVIL = new CopperAnvil();
    public static final CustomAnvil DAMAGED_COPPER_ANVIL = new CopperAnvil();

    public static final CustomAnvil DIAMOND_ANVIL = new DiamondAnvil();
    public static final CustomAnvil CHIPPED_DIAMOND_ANVIL = new DiamondAnvil();
    public static final CustomAnvil DAMAGED_DIAMOND_ANVIL = new DiamondAnvil();

    public static final CustomAnvil NETHERITE_ANVIL = new NetheriteAnvil();
    public static final CustomAnvil CHIPPED_NETHERITE_ANVIL = new NetheriteAnvil();
    public static final CustomAnvil DAMAGED_NETHERITE_ANVIL = new NetheriteAnvil();

    public static void registerMinecraftAnvil(String blockId, CustomAnvil block) {
        FAUtils.registerAnvil("minecraft", blockId, block);
    }

    public static void register() {
        registerMinecraftAnvil("oak_anvil", OAK_ANVIL);
        registerMinecraftAnvil("spruce_anvil", SPRUCE_ANVIL);
        registerMinecraftAnvil("birch_anvil", BIRCH_ANVIL);
        registerMinecraftAnvil("jungle_anvil", JUNGLE_ANVIL);
        registerMinecraftAnvil("acacia_anvil", ACACIA_ANVIL);
        registerMinecraftAnvil("dark_oak_anvil", DARK_OAK_ANVIL);
        registerMinecraftAnvil("crimson_anvil", CRIMSON_ANVIL);
        registerMinecraftAnvil("warped_anvil", WARPED_ANVIL);

        registerMinecraftAnvil("stone_anvil", STONE_ANVIL);

        registerMinecraftAnvil("golden_anvil", GOLDEN_ANVIL);
        registerMinecraftAnvil("damaged_golden_anvil", DAMAGED_GOLDEN_ANVIL);

        registerMinecraftAnvil("copper_anvil", COPPER_ANVIL);
        registerMinecraftAnvil("chipped_copper_anvil", CHIPPED_COPPER_ANVIL);
        registerMinecraftAnvil("damaged_copper_anvil", DAMAGED_COPPER_ANVIL);

        registerMinecraftAnvil("diamond_anvil", DIAMOND_ANVIL);
        registerMinecraftAnvil("chipped_diamond_anvil", CHIPPED_DIAMOND_ANVIL);
        registerMinecraftAnvil("damaged_diamond_anvil", DAMAGED_DIAMOND_ANVIL);

        registerMinecraftAnvil("netherite_anvil", NETHERITE_ANVIL);
        registerMinecraftAnvil("chipped_netherite_anvil", CHIPPED_NETHERITE_ANVIL);
        registerMinecraftAnvil("damaged_netherite_anvil", DAMAGED_NETHERITE_ANVIL);
    }

    public static void registerRenderLayers() {
        FAUtils.setCutout(DAMAGED_GOLDEN_ANVIL);

        FAUtils.setCutout(CHIPPED_DIAMOND_ANVIL);
        FAUtils.setCutout(DAMAGED_DIAMOND_ANVIL);

        FAUtils.setCutout(CHIPPED_NETHERITE_ANVIL);
        FAUtils.setCutout(DAMAGED_NETHERITE_ANVIL);
    }

}
