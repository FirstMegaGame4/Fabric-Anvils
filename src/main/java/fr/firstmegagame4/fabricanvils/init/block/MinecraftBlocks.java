package fr.firstmegagame4.fabricanvils.init.block;

import fr.firstmegagame4.fabricanvils.content.ContentHolder;
import fr.firstmegagame4.fabricanvils.content.InputGetterRule;
import fr.firstmegagame4.fabricanvils.init.FAUtils;
import fr.firstmegagame4.fabricanvils.anvil.*;
import fr.firstmegagame4.fabricanvils.anvil.minecraft.CopperAnvil;
import fr.firstmegagame4.fabricanvils.anvil.minecraft.DiamondAnvil;
import fr.firstmegagame4.fabricanvils.anvil.minecraft.GoldenAnvil;
import fr.firstmegagame4.fabricanvils.anvil.minecraft.NetheriteAnvil;
import org.apache.commons.lang3.tuple.Pair;

public class MinecraftBlocks implements ContentHolder {

	public static final FAUtils.PredicatedForBeing<CustomAnvil> OAK_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> SPRUCE_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> BIRCH_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> JUNGLE_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> ACACIA_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DARK_OAK_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> MANGROVE_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CRIMSON_ANVIL = new FAUtils.PredicatedForBeing<>(NetherWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> WARPED_ANVIL = new FAUtils.PredicatedForBeing<>(NetherWoodAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> STONE_ANVIL = new FAUtils.PredicatedForBeing<>(StoneAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> GOLDEN_ANVIL = new FAUtils.PredicatedForBeing<>(GoldenAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_GOLDEN_ANVIL = new FAUtils.PredicatedForBeing<>(GoldenAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> COPPER_ANVIL = new FAUtils.PredicatedForBeing<>(CopperAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_COPPER_ANVIL = new FAUtils.PredicatedForBeing<>(CopperAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_COPPER_ANVIL = new FAUtils.PredicatedForBeing<>(CopperAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> DIAMOND_ANVIL = new FAUtils.PredicatedForBeing<>(DiamondAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_DIAMOND_ANVIL = new FAUtils.PredicatedForBeing<>(DiamondAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_DIAMOND_ANVIL = new FAUtils.PredicatedForBeing<>(DiamondAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> NETHERITE_ANVIL = new FAUtils.PredicatedForBeing<>(NetheriteAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> CHIPPED_NETHERITE_ANVIL = new FAUtils.PredicatedForBeing<>(NetheriteAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> DAMAGED_NETHERITE_ANVIL = new FAUtils.PredicatedForBeing<>(NetheriteAnvil::new);

	@Override
	public String getModId() {
		return "minecraft";
	}

	@Override
	public InputGetterRule getRule() {
		return (anvil, name) -> {
			if (anvil instanceof StoneAnvil) {
				return Pair.of("smooth_stone", "cobblestone");
			}
			else if (anvil instanceof DiamondAnvil) {
				return Pair.of("diamond_block", "diamond");
			}
			else if (anvil instanceof NetheriteAnvil) {
				return null;
			}
			else {
				return ContentHolder.DEFAULT_RULE.apply(anvil, name);
			}
		};
	}

	@Override
	public void register() {
		this.registerModAnvil("oak_anvil", OAK_ANVIL.get());
		this.registerModAnvil("spruce_anvil", SPRUCE_ANVIL.get());
		this.registerModAnvil("birch_anvil", BIRCH_ANVIL.get());
		this.registerModAnvil("jungle_anvil", JUNGLE_ANVIL.get());
		this.registerModAnvil("acacia_anvil", ACACIA_ANVIL.get());
		this.registerModAnvil("dark_oak_anvil", DARK_OAK_ANVIL.get());
		this.registerModAnvil("mangrove_anvil", MANGROVE_ANVIL.get());
		this.registerModAnvil("crimson_anvil", CRIMSON_ANVIL.get());
		this.registerModAnvil("warped_anvil", WARPED_ANVIL.get());

		this.registerModAnvil("stone_anvil", STONE_ANVIL.get());

		this.registerModAnvil("golden_anvil", GOLDEN_ANVIL.get());
		this.registerModAnvil("damaged_golden_anvil", DAMAGED_GOLDEN_ANVIL.get());

		this.registerModAnvil("copper_anvil", COPPER_ANVIL.get());
		this.registerModAnvil("chipped_copper_anvil", CHIPPED_COPPER_ANVIL.get());
		this.registerModAnvil("damaged_copper_anvil", DAMAGED_COPPER_ANVIL.get());

		this.registerModAnvil("diamond_anvil", DIAMOND_ANVIL.get());
		this.registerModAnvil("chipped_diamond_anvil", CHIPPED_DIAMOND_ANVIL.get());
		this.registerModAnvil("damaged_diamond_anvil", DAMAGED_DIAMOND_ANVIL.get());

		this.registerModAnvil("netherite_anvil", NETHERITE_ANVIL.get());
		this.registerModAnvil("chipped_netherite_anvil", CHIPPED_NETHERITE_ANVIL.get());
		this.registerModAnvil("damaged_netherite_anvil", DAMAGED_NETHERITE_ANVIL.get());
	}

	@Override
	public void registerClient() {
		FAUtils.setCutout(DAMAGED_GOLDEN_ANVIL.get());

		FAUtils.setCutout(CHIPPED_DIAMOND_ANVIL.get());
		FAUtils.setCutout(DAMAGED_DIAMOND_ANVIL.get());

		FAUtils.setCutout(CHIPPED_NETHERITE_ANVIL.get());
		FAUtils.setCutout(DAMAGED_NETHERITE_ANVIL.get());
	}
}
