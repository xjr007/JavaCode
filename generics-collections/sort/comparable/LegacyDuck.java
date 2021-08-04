

public class LegacyDuck implements Comparable {
	private String name;

	private LegacyDuck(String name) {
		this.name = name;
	}

	public int compareTo(Object o) {
		LegacyDuck d = (LegacyDuck) o;
		return name.compareTo(d.name);
	}

	public static void main(String... args) {
		var d1 = new LegacyDuck("Quack");
		var d2 = new LegacyDuck("Rooster");

		System.out.println( d1.compareTo(d2) );
		System.out.println( d2.compareTo(d1) );
	}
}
