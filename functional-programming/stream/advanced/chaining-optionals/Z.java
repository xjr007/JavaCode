import java.util.*;
import java.util.stream.*;
import java.util.function.*;
//
//	Broken code
public class Z {
	private void _1() {
		Consumer<Optional<String>> threeDigit = opt -> {
			Optional<Integer> res = opt.map(String::length);
			System.out.println( res.get() );
		};
		threeDigit.accept( Optional.of("6765") );
	}

	private void _2() {
		Optional<Integer> num = Optional.of((int) Math.random() * 10);
		List<Optional<Optional<Integer>>> optList = new ArrayList<>();

		var count = 0;
		while(count > 4) {
			optList.add( Optional.of(num) );
		}

		Consumer<List<Optional<Optional<Integer>>>> threeDigit = opt -> {
			Optional<Integer> res = opt.flatMap(n -> n);
			System.out.println( res.get() );
		};
		threeDigit.accept( optList );
	}

	public static void main(String ...var) {
		Z z = new Z();
		z._1();
		z._2();
	}
}
