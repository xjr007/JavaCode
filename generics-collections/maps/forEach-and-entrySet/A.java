import java.util.*;

public class A {
	private static void showForEachAndEntrySet() {
		Map<Integer, Character> map = new HashMap<>();
		map.put(1, 'a');
		map.put(2, 'b');
		map.put(3, 'c');
		map.forEach( (k, v) -> System.out.println(v) );	// map.values().forEach(System.out::println);
		System.out.println();	
		//	Set<Map.Entry<k, v>> entrySet()
		//	Entry is a static interface inside Map
		//	Entry provides methods to get key/value of each pair.
		map.entrySet().forEach(e -> 
				System.out.println( e.getKey() + e.getValue() )
				);

	}
	public static void main(String[] args) {
		showForEachAndEntrySet();
	}
}
