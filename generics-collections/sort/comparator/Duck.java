import java.util.*;

public class Duck implements Comparable<Duck> {
	private String name;
	private int weight;

	private Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String toString() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public int compareTo(Duck d) {
		return name.compareTo(d.name);		// name - compareTo() method of String class is invoked
	}

	public static void main(String[] args) {
		// Comparator local class
		Comparator<Duck> byWeight = new Comparator<>() {
			public int compare(Duck d1, Duck d2) {
				return d1.getWeight() - d2.getWeight();
			}
		};
		/*	lambda:		Comparator<Duck> byWeight = (d1, d2) -> d1.getWeight() - d2.getWeight();
		 *	method ref:	Comparator<Duck> byWeight = Comparator.comparing(Duck::getWeight);
		 * */

		var ducks = new ArrayList<Duck>();
		ducks.add( new Duck("Quack", 7) );
		ducks.add( new Duck("Puddles", 10) );

		Collections.sort(ducks);
		System.out.println(ducks);		// {Puddles, Quack}
		
		Collections.sort(ducks, byWeight);	
		System.out.println(ducks);		// {Quack, Puddles}
	}
}
