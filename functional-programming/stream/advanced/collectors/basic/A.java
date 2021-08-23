import java.util.*;
import java.util.stream.*;

public class A {
	private static List<String> ANIMALS = new ArrayList<>();
	static {
		ANIMALS.add("lions");
		ANIMALS.add("tigers");
		ANIMALS.add("bears");
		ANIMALS.add("bears");
		ANIMALS.add("tortoises");
	}

	private void _1() {							// Joining
		var stream = ANIMALS.stream();
		String res = stream.collect(Collectors.joining(", "));
		System.out.println(res);
	}

	private void _2() {							// Average
		var stream = ANIMALS.stream();
		Double res = stream.collect( Collectors.averagingInt(String::length) );
		System.out.println(res);
	}

	private void _3() {							// Use Stream, end as Collection
		var stream = ANIMALS.stream();
		TreeSet<String> res = stream
	//		.filter(s -> s.startsWith("t"))
			.collect(Collectors.toCollection(TreeSet::new)
		);
		System.out.println(res);
	}

	public static void main(String[] args) {
		A a = new A();
		a._1();
		a._2();
		a._3();
	}
}
