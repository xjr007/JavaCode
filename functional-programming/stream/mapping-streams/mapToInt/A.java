import java.util.stream.*;
import java.util.*;

public class A {
	private void _1() {
		// Normal way
		Stream<Integer> stream = Stream.of(1, 2, 3);
		System.out.println( stream.reduce(0, (s, n) -> s + n) );
	}

	private void _2() {
		DoubleStream doubleStream = DoubleStream.of(1.0, 2.0, 3.0);
		doubleStream.mapToObj(x -> x).forEach(System.out::println);
	}

	private void _3() {
		Stream<String> stream = Stream.of("Monkey", "Gorilla", "Bonobo");
		IntStream intStream = stream.mapToInt(x -> x.length());
		intStream.forEach(System.out::println);
	}

	private void prim_1() {
		// Primitive way
		Stream<Integer> stream = Stream.of(1, 2, 3);
		stream.mapToInt(x -> x + 1).forEach(System.out::println);	// map Stream -> IntStream mapToInt(lambda can make changes to returning primitive stream)
	}

	private void average() {
		IntStream stream = IntStream.of(1, 2, 3);
		OptionalDouble avg = stream.average();
		System.out.println(avg.getAsDouble());
	}

	public static void main(String[] args) {
		A a = new A();
		
		a._1();
		a._2();
		a._3();

		a.prim_1();
		a.average();
	}
}
