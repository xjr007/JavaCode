import java.util.*;
import java.util.stream.*;

public class A {
	public static void main(String ...parameters) {
		Stream<Double> randoms = Stream.generate(Math::random);		// gen. random numbers until killed
		Stream<Integer> oddNums = Stream.iterate(1, n -> n + 2 );	// '1' is starting value -> (start),(lambda)
		
		// Stream.iterate() is like a while loop
		Stream<Integer> oddNumbersUnder100 = Stream.iterate(
				1,		// seed
				n -> n < 100,	// Predicate for kill condition
				n -> n + 2	// UnaryOperator
				);
		
	}
}
