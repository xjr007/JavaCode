import java.util.stream.*;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		Stream<String> infinite = Stream.generate( () -> "chimp" );

		s.findAny().ifPresent(System.out::println);
		infinite.findAny().ifPresent(System.out::println);
		
		s = Stream.of("monkey", "gorilla");
		infinite = Stream.generate( () -> "chimp" );
		s.findFirst().ifPresent(System.out::println);
		infinite.findFirst().ifPresent(System.out::println);
	}
}
