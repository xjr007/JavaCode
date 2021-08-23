import java.util.stream.*;
import java.util.*;

public class A { 
	private void _1() {
		var loStream = LongStream.rangeClosed(5, 10);
		long sum = loStream.sum();
		System.out.println(sum);
		
		var doStream = DoubleStream.generate(() -> Math.PI);
		OptionalDouble min = doStream.min();
	}

	public static void main(String... args) {
		A a = new A();
		a._1();
	}
}
