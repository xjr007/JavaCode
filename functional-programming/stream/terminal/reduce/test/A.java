import java.util.function.*;
import java.util.stream.*;
import java.util.*;

public class A {
	private static void _1() {
		var list = List.of("W", "o", "l", "f", " ", "R", "a", "m", " ", "A", "l", "p", "h", "a");
		Stream<String> pStream = list.stream();
		Integer len = pStream.reduce(
				0,
				(i, s) -> {
					System.out.println(i + " " + s.length() + ",");
					return i + s.length();
				},
				(a, b) -> {
					System.out.println(a + " " + b);
					return a + b;
				});
		System.out.println(len);
	}
	public static void main(String[] args) {
		_1();
	}
}
