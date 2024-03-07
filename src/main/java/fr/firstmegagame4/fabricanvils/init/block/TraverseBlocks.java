package fr.firstmegagame4.fabricanvils.init.block;

import fr.firstmegagame4.fabricanvils.anvil.CustomAnvil;
import fr.firstmegagame4.fabricanvils.anvil.NormalWoodAnvil;
import fr.firstmegagame4.fabricanvils.content.ContentHolder;
import fr.firstmegagame4.fabricanvils.content.InputGetterRule;
import fr.firstmegagame4.fabricanvils.init.FAUtils;

public class TraverseBlocks implements ContentHolder {

	public static final FAUtils.PredicatedForBeing<CustomAnvil> FIR_ANVIL = new FAUtils.PredicatedForBeing<>(NormalWoodAnvil::new);

	@Override
	public String getModId() {
		return "traverse";
	}

	@Override
	public InputGetterRule getRule() {
		return ContentHolder.DEFAULT_RULE;
	}

	@Override
	public void register() {
		this.registerModAnvil("fir_anvil", FIR_ANVIL.get());
	}

	@Override
	public void registerClient() {
	}
}
