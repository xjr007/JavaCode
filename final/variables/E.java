import java.util.function.*;

public class E {
	static int counter;
	
	public static void main(String[] args) {
		final var thisState = new E();
		thisState.recursUntil_10();

	}

	void recursUntil_10() {
		if(counter == 10) return;

		Consumer<Integer> print = System.out::println;
		print.accept(counter++);
		
		recursUntil_10();
	}
}
