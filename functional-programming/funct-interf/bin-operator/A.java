import java.util.function.*;
import java.util.*;

public class A {
	public static void main(String[] args) {
		BinaryOperator<String> b1 = String::concat;
		BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);


		System.out.println(b1.apply("baby", "chick"));
		System.out.println(b2.apply("baby", "chick"));
	}
}
