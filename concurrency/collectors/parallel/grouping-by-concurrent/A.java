import java.util.concurrent.*;
import java.util.stream.*;
import java.util.*;

public class A {
	public static void main(String[] args) {
		ConcurrentMap<Integer, List<String>> map = Stream.of("lions", "tigers", "bears", "monkeys")
			.parallel()
			.collect(Collectors.groupingByConcurrent(String::length));
		System.out.println(map);
	}
}
