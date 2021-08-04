import java.util.function.*;
import java.util.*;

public class A {
	public static void main(String[] args) {
		UnaryOperator<String> u1 = String::toUpperCase;
		UnaryOperator<String> u2 = x -> x.toUpperCase();

		System.out.println(u1.apply("chirp"));
		System.out.println(u2.apply("whistle"));
	}
}
