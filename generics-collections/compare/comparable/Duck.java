import java.util.*;
import java.util.function.*;

public class Duck implements Comparable<Duck> {
	private String name;

	private Duck(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public int compareTo(Duck d) {
		// sorts ascending
		return name.compareTo(d.name);
	}
	
	public static void main(String[] args) {
		Supplier<Duck> duck_1 = () -> new Duck("Quack");
		Supplier<Duck> duck_2 = () -> new Duck("Puddles");

		var ducks = new ArrayList<Duck>();
		ducks.add(duck_1.get());
		ducks.add(duck_2.get());

		// sort by name
		Collections.sort(ducks);
		System.out.println(ducks);
	}
}
