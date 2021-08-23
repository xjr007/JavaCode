import java.util.stream.*;
import java.util.*;

public class A {
	private static int max(IntStream ints) {
		OptionalInt optional = ints.max();
		return optional.orElseThrow(RuntimeException::new);
	}

	private static int range(IntStream ints) {
		IntSummaryStatistics stats = ints.summaryStatistics();
		if(stats.getCount() == 0) throw new RuntimeException();
		return stats.getMax() - stats.getMin();
	}

	private static double sum(DoubleStream doubles) {
		DoubleSummaryStatistics stats = doubles.summaryStatistics();
		if(stats.getCount() == 0) throw new RuntimeException();
		return stats.getSum();
	}
 
	private void _1() {
		IntStream intStream = IntStream.range(1, 11);
		IntStream intStream2 = IntStream.rangeClosed(1, 10);
		DoubleStream doStream = DoubleStream.of(1, 2, 3, 4, 5);

		System.out.println( max(intStream) );
		System.out.println( range(intStream2) );
		System.out.println( sum(doStream) );
	}

	public static void main(String ...args) {
		A a = new A();
		a._1();
	}
}
