import java.util.stream.*;
import java.util.*;

public class A {
	List intList = new ArrayList<Integer>();
	private void _1(List list) {
		DoubleStream doStream = list.stream().flatMapToDouble(x -> DoubleStream.of(x));
	}

	private void _2(List list) {
		LongStream loStream = list.stream().flatMapToLong(x -> LongStream.of(x));
	}

	public static void main(String[] args) {
		A a = new A();
		a.intList.add(1);
		a.intList.add(3);
		a.intList.add(5);

		a._1(a.intList);
		a._2(a.intList);
	}
}
