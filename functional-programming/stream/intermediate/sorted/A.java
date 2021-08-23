import java.util.*;
import java.util.stream.*;

public class A {
	private void _1() {
		Stream<String> s = Stream.of("brown-", "bear-");
		s	.sorted()
			.forEach(System.out::println);
	}

	private void _2() {
		Stream<String> s = Stream.of("brown bear-", "grizzly-");
		s	.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
	}

	public static void main(String[] args) {
		A a = new A();
		a._1();
		a._2();
	}
}
