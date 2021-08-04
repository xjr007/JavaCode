import java.util.function.*;
import java.util.*;

public class A {
	public static void main(String[] args) {
		var map = new HashMap<String, Integer>();
		BiConsumer<String, Integer> c1 = map::put;
		BiConsumer<String, Integer> c2 = (k, v) -> map.put(k, v);

		c1.accept("Cat", 3);
		c2.accept("Dog", 3);

		System.out.println(map);
	}
}
