import java.util.*;
import java.util.function.*;

public class B {
	BiPredicate<String, String> biPre = String::startsWith;
	boolean result = biPre.test("this", "t");

	public static void main(String[] args) {
		B b = new B();
		Consumer<Boolean> print = System.out::println;
		print.accept(b.result);
	}
}
