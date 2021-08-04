import java.util.*;

public class A {
	public static void printList(List<?> list) {
		for(Object x: list) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(4);
		numbers.add(6);
		numbers.add(8);
		numbers.add(10);

		printList(numbers);
	}
}
