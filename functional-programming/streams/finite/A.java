import java.util.*;
import java.util.stream.*;

public class A 	{
	public static void main(String[] args) 	{
		Stream<String> empty = Stream.empty();		// count = 0
		Stream<Integer> singleElement = Stream.of(1);	// count = 1
		Stream<Integer> fromArray = Stream.of(1, 2, 3);	// count = 3

		// Collection -> Stream
		var list = List.of("a", "b", "c");
		Stream<String> fromList = list.stream();
	}
}
