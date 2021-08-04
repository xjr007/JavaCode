import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class A {
	private static void version1() {
		Stream<String> s = Stream.of("W", "O", "L", "F");
		String joint = s.reduce("", (str, acc) -> str + acc );
		System.out.println(joint);
	}

	private static void version2() {
		Stream<String> s = Stream.of("W", "o", "l", "f");
		String joint = s.reduce("", String::concat);
		System.out.println(joint);
	}

	private static void custom() {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6);
		Integer multp = s.reduce(1, (i, acc) -> i * acc );
		System.out.println(multp + "\n--");
	}

	private static void testOptional() {
		BinaryOperator<Integer> op = (a, b) -> a*b;
		Stream<Integer> empty = Stream.empty();
		Stream<Integer> oneEl = Stream.of(3);
		Stream<Integer> threeEl = Stream.of(3, 6, 9);

		empty.reduce(op).ifPresent(System.out::println);
		oneEl.reduce(op).ifPresent(System.out::println);
		threeEl.reduce(op).ifPresent(System.out::println);
	}
	
	public static void main(String[] args) {
		version1();
		version2();
		custom();
		testOptional();
	}
}
