package fr.firstmegagame4.fabricanvils.content;

import fr.firstmegagame4.fabricanvils.anvil.CustomAnvil;
import org.apache.commons.lang3.tuple.Pair;

public interface InputGetterRule {

	Pair<String, String> apply(CustomAnvil anvil, String name);
}
