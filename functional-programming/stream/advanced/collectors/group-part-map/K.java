import java.util.stream.*;
import java.util.*;

public class K {
	static List<String> ANIMALS = new ArrayList<>();
	static {
		ANIMALS.add("lions");
		ANIMALS.add("tigers");
		ANIMALS.add("bears");
		ANIMALS.add("bears");
	}
	private void _1() {
		var zoo = ANIMALS.stream();
		Map<Integer, Optional<Character>> res = zoo.collect(
				Collectors.groupingBy(
					String::length,
					Collectors.mapping(
						s -> s.charAt(0),
						Collectors.minBy((a, b) -> a - b)
					)
				)
		);

		System.out.println(res);
	}
	public static void main(String[] args) {
		K k = new K();
		k._1();
	}
}
