import java.util.*;
import java.util.stream.*;

public class A {
	private void _1() {
		List<String> zero = List.of();
		var one  = List.of("Bonobo");
		var two = List.of("Mama Gorilla", "Baby Gorilla");
		Stream<List<String>> animals = Stream.of(zero, one, two);

		animals	.flatMap(m -> m.stream())
			.forEach(System.out::println);

	}

	public static void main(String[] args) {
		A a = new A();
		a._1();
	}
}
