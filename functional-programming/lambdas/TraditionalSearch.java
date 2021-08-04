import java.util.*;

public class TraditionalSearch {
	public static void main(String ...args) {
		
		// List of animals
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));

		// checker
		print(animals, new CheckIfHopper());
	}

	private static void print(List<Animal> animals, CheckTrait checker) {
		for(Animal animal : animals) {
			// general check
			if(checker.test(animal)) {
				System.out.println(animal + " ");
			}
			System.out.println();
		}
	}
}
