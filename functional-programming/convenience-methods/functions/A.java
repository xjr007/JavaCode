import java.util.*;
import java.util.function.*;

public class A	{
	public static void main(String[] args) {
		Function<Integer, Integer> before = x -> x + 1;
		Function<Integer, Integer> after = x -> x * 2;

		Function<Integer, Integer> combine = after.compose(before);
		System.out.println(combine.apply(3));
	}
}
