import java.util.function.*;
import java.util.stream.*;
import java.util.*;

public class A {
	private void _1() {
		// filteri
		Stream<String> stream = Stream.of("monkey", "gorilla", "bonobo");
		stream	.filter(x -> x.startsWith("g"))
			.forEach(System.out::println);
		
	}

	public static void main(String[] args) {
		A a = new A();
		a._1();
	}
}
