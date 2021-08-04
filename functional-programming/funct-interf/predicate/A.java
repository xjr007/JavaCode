import java.util.*;
import java.util.function.*;

public class A 	{
	public static void main(String args[]) {
		BiPredicate<String, String> b1 = String::startsWith;
		BiPredicate<String, String> b2 = (s1, s2) -> s1.startsWith(s2);

		System.out.println(b1.test("Chicken", "Chick"));
		System.out.println(b1.test("Rooster", "Roost"));
	}
}
