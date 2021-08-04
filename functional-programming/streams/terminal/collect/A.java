import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class A {
	private static void _1() {
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		StringBuilder word = stream.collect(
				StringBuilder::new,
				StringBuilder::append,
				StringBuilder::append
				);
		System.out.println(word);
	}

	private static void _2() {
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		TreeSet<String> set = stream.collect(
				TreeSet::new,
				TreeSet::add,
				TreeSet::addAll
				);

		System.out.println(set);
	}

	private static void _3() {
		// sorted
		// Shorter version of _2()
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		TreeSet<String> set = stream.collect( Collectors.toCollection(TreeSet::new) );
		System.out.println(set);
	}
	private static void _4() {
		// unsorted version of _3()
		// random implementation of Set i.e. can be tree/hash/etc
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		Set<String> set = stream.collect( Collectors.toSet() );
		System.out.println(set);
	}

	public static void main(String[] args) {
		_1();
		_2();
		_3();
		_4();
	}
}
