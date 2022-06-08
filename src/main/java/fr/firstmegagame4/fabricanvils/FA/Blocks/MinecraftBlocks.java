package fr.firstmegagame4.fabricanvils.FA.Blocks;

import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import fr.firstmegagame4.fabricanvils.anvils.*;
import fr.firstmegagame4.fabricanvils.anvils.minecraft.CopperAnvil;
import fr.firstmegagame4.fabricanvils.anvils.minecraft.DiamondAnvil;
import fr.firstmegagame4.fabricanvils.anvils.minecraft.GoldenAnvil;
import fr.firstmegagame4.fabricanvils.anvils.minecraft.NetheriteAnvil;

public class MinecraftBlocks implements BlocksInit {

    public static CustomAnvil OAK_ANVIL;
    public static CustomAnvil SPRUCE_ANVIL;
    public static CustomAnvil BIRCH_ANVIL;
    public static CustomAnvil JUNGLE_ANVIL;
    public static CustomAnvil ACACIA_ANVIL;
    public static CustomAnvil DARK_OAK_ANVIL;
    public static CustomAnvil CRIMSON_ANVIL;
    public static CustomAnvil WARPED_ANVIL;
    public static CustomAnvil STONE_ANVIL;

    public static CustomAnvil GOLDEN_ANVIL;
    public static CustomAnvil DAMAGED_GOLDEN_ANVIL;

    public static CustomAnvil COPPER_ANVIL;
    public static CustomAnvil CHIPPED_COPPER_ANVIL;
    public static CustomAnvil DAMAGED_COPPER_ANVIL;

    public static CustomAnvil DIAMOND_ANVIL;
    public static CustomAnvil CHIPPED_DIAMOND_ANVIL;
    public static CustomAnvil DAMAGED_DIAMOND_ANVIL;

    public static CustomAnvil NETHERITE_ANVIL;
    public static CustomAnvil CHIPPED_NETHERITE_ANVIL;
    public static CustomAnvil DAMAGED_NETHERITE_ANVIL;

    @Override
    public String getModId() {
        return "minecraft";
    }

    @Override
    public BlocksInit init() {
        OAK_ANVIL = new NormalWoodAnvil();
        SPRUCE_ANVIL = new NormalWoodAnvil();
        BIRCH_ANVIL = new NormalWoodAnvil();
        JUNGLE_ANVIL = new NormalWoodAnvil();
        ACACIA_ANVIL = new NormalWoodAnvil();
        DARK_OAK_ANVIL = new NormalWoodAnvil();
        CRIMSON_ANVIL = new NetherWoodAnvil();
        WARPED_ANVIL = new NetherWoodAnvil();

        STONE_ANVIL = new StoneAnvil();

        GOLDEN_ANVIL = new GoldenAnvil();
        DAMAGED_GOLDEN_ANVIL = new GoldenAnvil();

        COPPER_ANVIL = new CopperAnvil();
        CHIPPED_COPPER_ANVIL = new CopperAnvil();
        DAMAGED_COPPER_ANVIL = new CopperAnvil();

        DIAMOND_ANVIL = new DiamondAnvil();
        CHIPPED_DIAMOND_ANVIL = new DiamondAnvil();
        DAMAGED_DIAMOND_ANVIL = new DiamondAnvil();

        NETHERITE_ANVIL = new NetheriteAnvil();
        CHIPPED_NETHERITE_ANVIL = new NetheriteAnvil();
        DAMAGED_NETHERITE_ANVIL = new NetheriteAnvil();

        return this;
    }

    public void register() {
        this.registerModAnvil("oak_anvil", OAK_ANVIL);
        this.registerModAnvil("spruce_anvil", SPRUCE_ANVIL);
        this.registerModAnvil("birch_anvil", BIRCH_ANVIL);
        this.registerModAnvil("jungle_anvil", JUNGLE_ANVIL);
        this.registerModAnvil("acacia_anvil", ACACIA_ANVIL);
        this.registerModAnvil("dark_oak_anvil", DARK_OAK_ANVIL);
        this.registerModAnvil("crimson_anvil", CRIMSON_ANVIL);
        this.registerModAnvil("warped_anvil", WARPED_ANVIL);

        this.registerModAnvil("stone_anvil", STONE_ANVIL);

        this.registerModAnvil("golden_anvil", GOLDEN_ANVIL);
        this.registerModAnvil("damaged_golden_anvil", DAMAGED_GOLDEN_ANVIL);

        this.registerModAnvil("copper_anvil", COPPER_ANVIL);
        this.registerModAnvil("chipped_copper_anvil", CHIPPED_COPPER_ANVIL);
        this.registerModAnvil("damaged_copper_anvil", DAMAGED_COPPER_ANVIL);

        this.registerModAnvil("diamond_anvil", DIAMOND_ANVIL);
        this.registerModAnvil("chipped_diamond_anvil", CHIPPED_DIAMOND_ANVIL);
        this.registerModAnvil("damaged_diamond_anvil", DAMAGED_DIAMOND_ANVIL);

        this.registerModAnvil("netherite_anvil", NETHERITE_ANVIL);
        this.registerModAnvil("chipped_netherite_anvil", CHIPPED_NETHERITE_ANVIL);
        this.registerModAnvil("damaged_netherite_anvil", DAMAGED_NETHERITE_ANVIL);
    }

    public void registerClient() {
        FAUtils.setCutout(DAMAGED_GOLDEN_ANVIL);

        FAUtils.setCutout(CHIPPED_DIAMOND_ANVIL);
        FAUtils.setCutout(DAMAGED_DIAMOND_ANVIL);

        FAUtils.setCutout(CHIPPED_NETHERITE_ANVIL);
        FAUtils.setCutout(DAMAGED_NETHERITE_ANVIL);
    }

}
