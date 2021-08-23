import java.util.stream.*;
import java.util.function.*;
import java.util.*;

public class A	{
	public static void main(String[] args) {
		Stream<String> s = Stream.of("Monkey", "Gorille", "Bonobo");
		s.forEach(System.out::println);

		Stream<Integer> sI = Stream.of(1);
		// for(i :sI) {}	// Compiler error
		// ^ stream is not an iterable
	}
}
