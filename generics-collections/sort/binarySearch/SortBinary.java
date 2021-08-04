import java.util.*;

public class SortBinary {
	public static void main(String... args) {
		List<Integer> list = Arrays.asList(6, 9, 1, 8);
		Collection.sort(list);		// [1, 6, 8, 9]
		System.out.println( Collections.binarySearch(list, 6) );
		System.out.println( Collections.binarySearch(list, 3) );
	}
}
