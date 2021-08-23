import java.util.stream.*;
import java.util.*;

public class A {
	private void _1() {
		Stream<Long> stream = Stream.iterate((long) 1, n -> n + 1);
		stream.limit(10).filter(n -> (n * 2) % 2 == 0).mapToLong(n -> n).forEach(System.out::println);
	}

	private void _2() {
		LongStream loStream = LongStream.range(1, 11);
		Stream<Long> stream = loStream.mapToObj(n -> n * 2);
		long reduction = stream.reduce((long) 0, (a, b) -> a + b);
		System.out.println(reduction);
	}

	public static void main(String[] args) {
		A a = new A();
		a._1();
		a._2();
	}
}
