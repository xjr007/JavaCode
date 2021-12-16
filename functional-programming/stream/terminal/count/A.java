import java.util.stream.*;
import java.util.*;

public class A {
	static void reduction() {
		List<String> names = new ArrayList<>();
		names.add("James");
		names.add("Peter");
		names.add("John");
		names.add("Rebecca");
		names.add("Fadiel");
		names.add("Mustapha");
		names.add("Ilyaas");
		names.add("Eesa");
		names.add("Imaan");
		names.add("Saarah");
		names.add("Gadija");

		System.out.println("Array:" + names);
		System.out.println();

		Stream<String> nameS = names.stream();
		nameS.filter(name -> name.contains("e"))
			.forEach(System.out::println);
		
		long totalNames = names.stream().count();
		long namesWithE = names.stream().filter(name -> name.contains("e")).count();

		System.out.println("Number of names without 'e': " + (totalNames - namesWithE));
	}

	public static void main(String[] args) {
		Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
		System.out.println(s.count());
		reduction();
	}
}
