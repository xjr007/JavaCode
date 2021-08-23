import java.util.stream.*;
import java.util.*;

public class A {
	private void _1() {
		var stream = IntStream.rangeClosed(1, 10);
		OptionalDouble average = stream.average();
		average.ifPresent(System.out::println);
		
		System.out.println(average.getAsDouble());	// for Optional<Wrapper> it's .get()
		System.out.println(average.orElseGet( () -> Double.NaN ));
	}

	public static void main(String [] args) {
		A a = new A();
		a._1();
	}
}
