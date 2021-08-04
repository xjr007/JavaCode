public class UseTreeSet {
	/*	This code does not compile.
	 *	Duck class not in scope.
	 *
	 * */
	static class Rabbit { int id; }
	
	public static void main(String... args) {
		Set<Duck> ducks = new TreeSet<>();
		ducks.add( new Duck("Puddles") );

		Set<Rabbit> rabbit = new TreeSet<>();
		rabbits.add( new Rabbit() );	//	ClassCastException
	}

	public static void main1() {
		Set<Rabbit> rabbits = new TreeSet<>( (r1, r2) -> r1.id - r2.id );
	}

}
