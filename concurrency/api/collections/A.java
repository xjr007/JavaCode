import java.util.concurrent.*;
import java.util.stream.*;
import java.util.*;

public class A {
	private void _1() {
		Set<String> animals = new ConcurrentSkipListSet<>();
		animals.add("rabbit");
		animals.add("gopher");
		System.out.println(animals.stream().collect(
			Collectors.joining(","))
		);

		Map<String, String> rainAnimalsDiet = new ConcurrentSkipListMap<>();
		rainAnimalsDiet.put("koala", "bamboo");
		rainAnimalsDiet.entrySet().stream().forEach(e ->
			System.out.println(e.getKey() + "-" + e.getValue())
		);
	}

	public static void main(String[] args) {
		A a = new A();
		a._1();
	}
}
