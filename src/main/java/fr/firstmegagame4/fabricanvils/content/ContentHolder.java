package fr.firstmegagame4.fabricanvils.content;

import fr.firstmegagame4.fabricanvils.anvil.CustomAnvil;
import fr.firstmegagame4.fabricanvils.anvil.WoodenAnvil;
import fr.firstmegagame4.fabricanvils.init.FAUtils;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.apache.commons.lang3.tuple.Pair;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

public interface ContentHolder {

	InputGetterRule DEFAULT_RULE = (anvil, name) -> {
		if (anvil instanceof WoodenAnvil) {
			return Pair.of(name + "_wood", name + "_planks");
		}
		else {
			return Pair.of(name + "_block", name + "_ingot");
		}
	};

	String getModId();

	// Rule allowing to retrieve inputs of recipes from the anvil name. Inside the rule, if the return value is null, then no recipe is made.
	InputGetterRule getRule();

	@SuppressWarnings("unchecked")
	default List<FAUtils.PredicatedForBeing<CustomAnvil>> getContent() {
		return Arrays.stream(this.getClass().getDeclaredFields())
			.filter(field -> Modifier.isStatic(Modifier.fieldModifiers()))
			.map(field -> {
				try {
					return (FAUtils.PredicatedForBeing<CustomAnvil>) field.get(this.getClass());
				} catch (IllegalAccessException e) {
					throw new RuntimeException(e);
				}
			})
			.toList();
	}

	default void init() {
		this.getContent().forEach(FAUtils.PredicatedForBeing::initialize);
	}

	default void registerModAnvil(String blockId, CustomAnvil block) {
		FAUtils.registerAnvil(this.getModId(), blockId, block);
	}

	void register();

	@Environment(EnvType.CLIENT)
	void registerClient();
}
