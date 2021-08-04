import java.util.*;

public class SortRabbits {
	static class Rabbit { int id; }

	public static void main(String[] args) {
		List<Rabbit> rabbits = new ArrayList<>();
		rabbits.add( new Rabbit() );
		
		Comparator<Rabbit> compare = (r1, r2) -> r1.id - r2.id;
		Collections.sort(rabbits, compare);
		System.out.println(rabbits);
	}
}
