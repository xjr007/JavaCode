import java.util.*;
import java.util.stream.*;

public class A<T> {
	private <T> void _1() {
		Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
		s	.map(String::length)
			.forEach(System.out::println);
	}

	public static void main(String[] args) {
		A<String> a = new A();
		a._1();
	}
}
