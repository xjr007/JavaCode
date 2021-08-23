import java.util.*;
import java.util.stream.*;

public class A {
	private void _1() {
		var stream = Stream.of("black bear", "brown bear", "grizzly");
		long count = stream.filter(s -> s.startsWith("g"))
			.peek(System.out::println)
			.count();

		System.out.println(count);
	}

	public static void main(String[] args) {
		A a = new A();
		a._1();
	}
}
