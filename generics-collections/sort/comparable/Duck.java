import java.util.*;

public class Duck implements Comparable<Duck> {
	private String name;

	private Duck(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public int compareTo(Duck d) {
		return name.compareTo(d.name);		// name - compareTo() method of String class is invoked
	}

	public static void main(String[] args) {
		var ducks = new ArrayList<Duck>();
		ducks.add( new Duck("Quack") );
		ducks.add( new Duck("Puddles") );

		Collections.sort(ducks);
		System.out.println(ducks);
	}
}
