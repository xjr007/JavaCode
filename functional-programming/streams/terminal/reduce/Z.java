import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Z {
	private static void thirdReduce() {
		// Third overloaded:
		// 	<U> U reduce(U identity, BiFunction<? super T, U> accumulator, BinaryOperator<U> Combiner)
		
		Stream<String> stream = Stream.of("w", "o", "l", "f!");
		int len = stream.reduce(
				0,
				(i, s) -> i + s.length(),
				(a, b) -> a + b);

		System.out.println(len);

	}

	public static void main(String[] args) {
		thirdReduce();
	}
}
