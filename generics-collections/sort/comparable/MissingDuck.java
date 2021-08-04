public class MissingDuck implements Comparable<MissingDuck> {
	private String name;

	private MissingDuck(String name) {
		this.name = name;
	}

	public int compareTo(MissingDuck duck) {
		if(duck == null) 
			throw new IllegalArgumentException("Poorly formed duck!");
		
		if(this.name == null && duck.name == null)
			return 0;
		else if(this.name == null) return -1;
		else if(duck.name == null) return 1;
		else return name.compareTo(duck.name);
	}

	public static void main(String... arguments) {
		var d1 = new MissingDuck("Quack");
		var d2 = new MissingDuck("Rooster");
		var d3 = new MissingDuck(null);

		System.out.println( d1.compareTo(d2) );		// -1
		System.out.println( d2.compareTo(d1) );		// 1
		System.out.println( d3.compareTo(d1) );		// -1
		System.out.println( d3.compareTo(d3) );		// 0
		System.out.println( d1.compareTo(null) );	// Exception
	}
}
