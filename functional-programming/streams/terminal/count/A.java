import java.util.stream.*;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
		System.out.println(s.count());
	}
}
