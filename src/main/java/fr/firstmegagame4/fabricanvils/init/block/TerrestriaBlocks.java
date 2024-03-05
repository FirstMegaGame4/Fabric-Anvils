package fr.firstmegagame4.fabricanvils.init.block;

import fr.firstmegagame4.fabricanvils.anvil.CustomAnvil;
import fr.firstmegagame4.fabricanvils.anvil.NormalWoodAnvil;
import fr.firstmegagame4.fabricanvils.anvil.StoneAnvil;
import fr.firstmegagame4.fabricanvils.content.ContentHolder;
import fr.firstmegagame4.fabricanvils.init.FAUtils;

public class TerrestriaBlocks implements ContentHolder {

	public static final FAUtils.PredicatedForBeing<CustomAnvil> CYPRESS_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> HEMLOCK_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> JAPANESE_MAPLE_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> RAINBOW_EUCALYPTUS_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> REDWOOD_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> RUBBER_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> WILLOW_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);

	public static final FAUtils.PredicatedForBeing<CustomAnvil> VOLCANIC_ROCK_ANVIL = new FAUtils.PredicatedForBeing<>(StoneAnvil::new);

	@Override
	public String getModId() {
		return "terrestria";
	}

	@Override
	public void register() {
		this.registerModAnvil("cypress_anvil", CYPRESS_ANVIL.get());
		this.registerModAnvil("hemlock_anvil", HEMLOCK_ANVIL.get());
		this.registerModAnvil("japanese_maple_anvil", JAPANESE_MAPLE_ANVIL.get());
		this.registerModAnvil("rainbow_eucalyptus_anvil", RAINBOW_EUCALYPTUS_ANVIL.get());
		this.registerModAnvil("redwood_anvil", REDWOOD_ANVIL.get());
		this.registerModAnvil("rubber_anvil", RUBBER_ANVIL.get());
		this.registerModAnvil("willow_anvil", WILLOW_ANVIL.get());

		this.registerModAnvil("volcanic_rock_anvil", VOLCANIC_ROCK_ANVIL.get());
	}

	@Override
	public void registerClient() {
	}
}
