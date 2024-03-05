package fr.firstmegagame4.fabricanvils.content;

import fr.firstmegagame4.fabricanvils.anvil.CustomAnvil;
import fr.firstmegagame4.fabricanvils.init.FAUtils;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

public interface ContentHolder {

	String getModId();

	@SuppressWarnings("unchecked")
	default void init() {
		List<FAUtils.PredicatedForBeing<CustomAnvil>> anvils = Arrays.stream(this.getClass().getDeclaredFields())
				.filter(field -> Modifier.isStatic(Modifier.fieldModifiers()))
				.map(field -> {
					try {
						return (FAUtils.PredicatedForBeing<CustomAnvil>) field.get(this.getClass());
					} catch (IllegalAccessException e) {
						throw new RuntimeException(e);
					}
				})
				.toList();
		anvils.forEach(FAUtils.PredicatedForBeing::initialize);
	}

	default void registerModAnvil(String blockId, CustomAnvil block) {
		FAUtils.registerAnvil(this.getModId(), blockId, block);
	}

	void register();

	@Environment(EnvType.CLIENT)
	void registerClient();
}
