import java.util.stream.*;
import java.util.*;

public class A {
	private void _1() {
		// distinct
		Stream<String> stream = Stream.of("duck", "duck", "duck", "goose");
		stream	.distinct()
			.forEach(System.out::println);
	}

	public static void main(String[] args) {
		A a = new A();
		a._1();
	}
}
