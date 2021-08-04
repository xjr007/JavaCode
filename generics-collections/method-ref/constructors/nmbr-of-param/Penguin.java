import java.util.*;
import java.util.function.*;

public class Penguin {
	public static Integer countBabies(Penguin... babies) {
		return babies.length;
	}
	
	public static void main(String... args) {
	//	pass zero or more values & creates array with said values
		
		Supplier<Integer> methRef1 = Penguin::countBabies; //	x -> Penguin.countBabies();
		
		Function<Penguin, Integer> methRef2 = Penguin::countBabies; //	x -> Penguin.countBabies(x);

		BiFunction<Penguin, Penguin, Integer> methRef3 = Penguin::countBabies; //	(x, y) -> Penguin.countBabies(x, y);
	}
}
