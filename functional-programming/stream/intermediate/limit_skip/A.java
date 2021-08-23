import java.util.stream.*;
import java.util.*;

public class A {
	private void _1() {
		// limit
		Stream<Integer> s = Stream.iterate(1, n -> n + 2);
		s	.limit(5)
			.forEach(System.out::println);
	}

	private void _2() {
		// skip
		Stream<Integer> s = Stream.iterate(1, n -> n + 1);
		s	.skip(5)
			.findAny()
			.ifPresent(System.out::println);
	}

	private void _3() {
		// joint operation of limit() & skip()
		Stream<Integer> s = Stream.iterate(2, n -> n + 2);
		s	.skip(10)
			.limit(5)
			.forEach(System.out::println);
	}

	public static void main(String[] args) {
		A a = new A();
		a._1();
		a._2();
		a._3();
	}
}
