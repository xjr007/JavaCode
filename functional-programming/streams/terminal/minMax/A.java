import java.util.stream.*;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
		Optional<String> min = s.min( (s1, s2) -> s1.length() - s2.length() );
		min.ifPresent(System.out::println);

		Optional<?> empty = Stream.empty().min( (s1, s2) -> 0 );
		System.out.println( empty.isPresent() );
	}
}
