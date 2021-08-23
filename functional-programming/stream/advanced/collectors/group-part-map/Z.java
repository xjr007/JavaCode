import java.util.stream.*;
import java.util.*;

public class Z {
	static List<String> ANIMALS = new ArrayList<>();
	static {
		ANIMALS.add("lion");
		ANIMALS.add("tigers");
		ANIMALS.add("bears");
	}
	private void _1() {
		var zoo = ANIMALS.stream();
		Map<Boolean, List<String>> result = zoo.collect(Collectors.partitioningBy(
					s -> s.length() <= 5
					));
		System.out.println(result);
	}

	private void _2() {
		var zoo = ANIMALS.stream();
		Map<Boolean, Set<String>> resultSet = zoo.collect(Collectors.partitioningBy(
					s -> s.length() < 7,
					Collectors.toSet()
					));
		System.out.println(resultSet);
	}

	private void _3() {
	}

	public static void main(String[] args) {
		Z z = new Z();
		z._1();
		z._2();
		z._3();
	}
}
