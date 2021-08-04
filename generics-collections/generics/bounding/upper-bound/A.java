import java.util.*;

public class A {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(3);
		intList.add(6);
		intList.add(9);

		List<? extends Number> list = intList;

		System.out.println(getTotal(list));
	}

	public static long getTotal(List<? extends Number> list) {
		long count = 0;
		for(Number number: list) {
			count += number.longValue();
		}

		return count;
	}
}
