import java.util.function.*;

public class A {
	private void _1() {
		BooleanSupplier b1 = () -> true;
		BooleanSupplier b2 = () -> Math.random() > .5;

		System.out.println( b1.getAsBoolean() );
		System.out.println( b2.getAsBoolean() );
	}

	private void _2() {
		BooleanSupplier b1 = () -> {
			return 5 + 6 == 10 ? true: false;
		};

		System.out.println( b1.getAsBoolean() );
	}

	public static void main(String[] args) {
		A a = new A();
		a._1();
		a._2();
	}
}
