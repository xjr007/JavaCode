import java.util.stream.*;
import java.util.*;

public class K {
	private void _1() {
		var numbers = IntStream.range(1, 11);
		var result = numbers.reduce(Integer.MIN_VALUE, (a, b) -> a < b ? a: b);
		System.out.println(result);
	}
	public static void main(String[] args) {
		K k = new K();
		k._1();
	}
}
