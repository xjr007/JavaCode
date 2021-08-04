import java.util.*;

public class TestSet {
	private static void showHashSet() {
		Set<Integer> set = new HashSet<>();
		boolean b1 = set.add(66);	// true
		boolean b2 = set.add(41);	// true
		boolean b3 = set.add(5);	// true
		boolean b4 = set.add(41);	// false
		boolean b5 = set.add(12);	// true
		
		set.forEach(System.out::println);
	}

	private static void showTreeSet() {
		Set<Integer> set = new TreeSet<>();
		boolean b1 = set.add(66);	// true
		boolean b2 = set.add(41);	// true
		boolean b3 = set.add(5);	// true
		boolean b4 = set.add(41);	// false
		boolean b5 = set.add(12);	// true

		set.forEach(System.out::println);
	}

	public static void main(String ...args) {
		showHashSet();
		showTreeSet();
	}
}
