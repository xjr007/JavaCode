import java.util.stream.*;
import java.util.*;

public class A {
	private void _1() {
		var zoo = Stream.of("lions", "zebras", "springboks");
		Map<String, Integer> map = zoo.collect(Collectors.toMap(
					s -> s,					// s-> s == Function.identity()
					String::length));
		System.out.println(map);
	}

	private void _2() {
		var zoo = Stream.of("lions", "bears", "zebras", "springboks");
		// Map<Integer, String> map = zoo.collect(Collectors.toMap(
		//			String::length,
		//			k -> k));		
		Map<Integer, String> map = zoo.collect(Collectors.toMap(
					String::length,
					s -> s,
					(s1, s2) -> s1 + " & " + s2,
					TreeMap::new				// removing this line gets random map
					));
		System.out.println(map);
	}

	public static void main(String[] args) {
		A a = new A();
		a._1();
		a._2();
	}
}
