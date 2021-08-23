import java.util.stream.*;
import java.util.*;

public class A {
	private void _1() {
		var stream = DoubleStream.iterate(1, n -> n + 1);
		stream.limit(10).filter(x -> x % 3 == 0).mapToObj(x -> x).forEach(System.out::println);
		System.out.println("x");
	}

	private void _2() {
		Stream<Double> stream = Stream.generate(() -> Math.random() * 2);
		DoubleStream doStream = stream.limit(100).mapToDouble(n -> n + 1);
		double reduction = doStream.reduce(0, (a, b) -> a + b);
		System.out.println(reduction);
	}

	public static void main(String[] args) {
		A a = new A();
		a._1();
		a._2();
	}
}
