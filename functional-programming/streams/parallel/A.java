import java.util.*;
import java.util.stream.*;

public class A {
	public static void main(String... args) {
		var list = List.of("a", "b", "c");
		Stream<String> fromListParallel = list.parallelStream();
	}
}
