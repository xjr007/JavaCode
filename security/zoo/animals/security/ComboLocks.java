package animals.security;

import java.util.*;

public final class ComboLocks {
	private final Map<String, String> combos;

	public ComboLocks(HashMap<String, String> combos) {
		this.combos = new HashMap<String, String>(combos);
	}

	public boolean isComboValid(String animal, String combo) {
		var correctCombo = combos.get(animal);
		return combo.equals(correctCombo);
	}
}
