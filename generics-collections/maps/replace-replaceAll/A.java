import java.util.*;

public class A {
	private static void showReplaceAndReplaceAll() {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 2);
		map.put(2, 4);

		Integer original = map.replace(2, 10);	// returns 4
		System.out.println(map);	// {1=2, 2=10}

		map.replaceAll( (k, v) -> k + v );	// replaces value* NOT key
		System.out.println(map);	// {1=3, 2=12}
	}

	public static void main(String[] args) {
		showReplaceAndReplaceAll();
	}
}
