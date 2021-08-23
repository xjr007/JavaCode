import java.util.stream.*;
import java.util.*;

public class A {								// groupingBy
	static List<String> ANIMALS;
	static {
		ANIMALS = new ArrayList<>();
		ANIMALS.add("lions");
		ANIMALS.add("tigers");
		ANIMALS.add("bears");
		ANIMALS.add("bears");
	}

	private void _1() {
		var zoo = ANIMALS.stream();
		Map<Integer, List<String>> map = zoo.collect(
				Collectors.groupingBy(String::length));
		System.out.println(map);
	}

	private void _2() {
		var zoo = ANIMALS.stream();
		Map<Integer, Set<String>> mapSet = zoo.collect(
				Collectors.groupingBy(String::length, Collectors.toSet() ));
		System.out.println(mapSet);
	}

	private void _3() {
		var zoo = ANIMALS.stream();
		Map<Integer, Set<String>> treeMapSet = zoo.collect(Collectors.groupingBy(
					String::length,
					TreeMap::new,
					Collectors.toSet()
					));
		System.out.println(treeMapSet);
	}

	private void _4() {
		var zoo = ANIMALS.stream();
		Map<Integer, Long> result = zoo.collect(Collectors.groupingBy(
					String::length,
					Collectors.counting()
					));
		System.out.println(result);
	}

	public static void main(String[] args) {
		A a = new A();
		a._1();
		a._2();
		a._3();
		a._4();
	}
}
