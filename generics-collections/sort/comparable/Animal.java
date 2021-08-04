public class Animal implements Comparable<Animal> {
	private int id;

	public int compareTo(Animal a) {
		return id - a.id;			// 2nd approach: Integer.compare(id, a.id)
	}

	public static void main(String... args) {
		var a1 = new Animal();
		var a2 = new Animal();
		
		a1.id = 5;
		a2.id = 7;

		print.accept( a1.compareTo(a2) );	// -2
		print.accept( a2.compareTo(a1) );	// 2
		print.accept( a1.compareTo(a1) );	// 0

	}
}
