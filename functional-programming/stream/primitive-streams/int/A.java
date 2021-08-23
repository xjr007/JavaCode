import java.util.stream.*;
import java.util.*;

public class A {
	private void _1() {
		var stream = IntStream.rangeClosed(1, 10);
		stream.filter(x -> (x % 2) == 0).mapToObj(x -> x).forEach(System.out::println);
		
	}

	private void _2() {
		Stream<Integer> stream = Stream.iterate(1, n -> n + 1);
		stream.limit(10).filter(x -> (x % 2) == 1).mapToInt(x -> x).forEach(System.out::println);
	}

	public static void main(String[] args) {
		A a = new A();
		a._1();
		a._2();
	}
}
