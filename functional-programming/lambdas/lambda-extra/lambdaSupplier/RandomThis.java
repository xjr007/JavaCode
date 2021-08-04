import java.util.function.*;
import java.util.*;

public class RandomThis {
	public static void main(String[] args) {
		// Return 42 when [number] is called
		Supplier<Integer> number = () -> 42;
		
		// Return random number when [random] is called
		Supplier<Integer> random = () -> new Random().nextInt();

		Consumer<String> print = (x) -> System.out.println(x);

		print.accept(String.valueOf(random.get()));
		print.accept(String.valueOf(number.get()));

	}

	
}
