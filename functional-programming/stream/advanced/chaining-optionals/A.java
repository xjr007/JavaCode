import java.util.function.*;
import java.util.*;

public class A {
	private void _1() {
		Consumer<Optional<Integer>> threeDigit = opt -> {
			if(opt.isPresent()) {
				var num = opt.get();
				var string = "" + num;

				if(string.length() == 3) System.out.println(string);
			}
		};

		threeDigit.accept( Optional.of(5) );
		threeDigit.accept( Optional.of(52) );

		System.out.println("--");
		threeDigit.accept( Optional.of(529) );

		System.out.println();
	}

	private void _2() {
		Consumer<Optional<Integer>> threeDigit = opt -> {
			opt.map(n -> "" + n)
				.filter(s -> s.length() == 3)
				.ifPresent(System.out::println);
		};

		threeDigit.accept( Optional.of(5) );
		threeDigit.accept( Optional.of(52) );

		System.out.println("--");
		threeDigit.accept( Optional.of(529) );
	}

	public static void main(String... args) {
		A a = new A();
		a._1();
		a._2();
	}
}
