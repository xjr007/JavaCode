import java.util.*;
import java.util.function.*;

public class PredicateSearch {
	private static Consumer<String> msg = x -> System.out.print(x + " ");

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		animals.add( new Animal("fish", false, true) );
		animals.add( new Animal("Bear", false, true) );
		animals.add( new Animal("Rabbit", true, false) );
		animals.add( new Animal("Frog", true, true) );

		print( animals, a -> a.canHop() );
	}

	private static void print( List<Animal> animals, Predicate<Animal> checker ) {
		for( Animal animal: animals ) {
			if( checker.test(animal) ) {
				msg.accept(animal.toString());
				System.out.println();
			}
		}
	}
}

class Animal {
	private String name;
	private boolean canHop;
	private boolean canSwim;

	public Animal( String name, boolean canHop, boolean canSwim ) {
		this.name = name;
		this.canHop = canHop;
		this.canSwim = canSwim;	       
	}

	public boolean canHop() {
		return canHop;
	}

	public boolean canSwim() {
		return canSwim;
	}

	public String toString() {
		return name;
	}
}
