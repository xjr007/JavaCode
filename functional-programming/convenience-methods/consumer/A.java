import java.util.function.*;
import java.util.*;

public class A 	{
	public static void main(String... args) {
		Consumer<String> c1 = x -> System.out.println("1: " + x);
		Consumer<String> c2 = x -> System.out.println("2: " + x);

		Consumer<String> combine = c1.andThen(c2);
		combine.accept("Jonny");
	}
}
