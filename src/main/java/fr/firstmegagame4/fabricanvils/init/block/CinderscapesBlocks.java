package fr.firstmegagame4.fabricanvils.init.block;

import fr.firstmegagame4.fabricanvils.anvil.CustomAnvil;
import fr.firstmegagame4.fabricanvils.anvil.NetherWoodAnvil;
import fr.firstmegagame4.fabricanvils.content.ContentHolder;
import fr.firstmegagame4.fabricanvils.init.FAUtils;

public class CinderscapesBlocks implements ContentHolder {

	public static final FAUtils.PredicatedForBeing<CustomAnvil> SCORCHED_ANVIL = new FAUtils.PredicatedForBeing<>(NetherWoodAnvil::new);
	public static final FAUtils.PredicatedForBeing<CustomAnvil> UMBRAL_ANVIL = new FAUtils.PredicatedForBeing<>(NetherWoodAnvil::new);

	@Override
	public String getModId() {
		return "cinderscapes";
	}

	@Override
	public void register() {
		this.registerModAnvil("scorched_anvil", SCORCHED_ANVIL.get());
		this.registerModAnvil("umbral_anvil", UMBRAL_ANVIL.get());
	}

	@Override
	public void registerClient() {
	}
}
