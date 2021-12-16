import java.util.concurrent.*;
import java.util.stream.*;
import java.util.*;

public class A {
	public static void main(String[] args) {
		ConcurrentMap<Integer, String> map = Stream.of( "Bear", "Lion", "Monkey")
			.parallel()
			.collect(Collectors.toConcurrentMap(String::length,
						k -> k,
						(s1, s2) -> s1 + ", " + s2));
		System.out.println(map);
	}
}
