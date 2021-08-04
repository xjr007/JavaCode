import java.util.function.*;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = s1 -> s1.length();

		System.out.println(f1.apply("Hell Cat"));
		System.out.println(f2.apply("Blood Hound"));

		BiFunction<String, String, String> bf1 = String::concat;
		BiFunction<String, String, String> bf2 = (s1, s2) -> s1.concat(s2);

		System.out.println(bf1.apply("Hell", " Cat"));
		System.out.println(bf2.apply("Blood", " Hound"));
	}
}
