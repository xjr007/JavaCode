import java.util.*;

public class MultiFieldComparator implements Comparator<Squirrel> {

	public int compare(Squirrel s1, Squirrel s2) {
		int result = s1.getSpecies().compareTo( s2.getSpecies() );

		if(result != 0) return result;
		return s1.getWeight() - s2.getWeight();
	}
	
	public static void main(String []args) {
		List<Squirrel> squirrels = new ArrayList<>();
		var s1 = new Squirrel("Red", 3);
		var s2 = new Squirrel("Blue", 2);
		var s3 = new Squirrel("Red", 2);

		squirrels.add(s1);
		squirrels.add(s2);
		squirrels.add(s3);

		var multi = new MultiFieldComparator();
		Collections.sort( squirrels, multi );
		System.out.println(squirrels);

		Comparator<Squirrel> c = Comparator
			.comparing(Squirrel::getSpecies)
			.thenComparingInt(Squirrel::getWeight);

		Collections.sort( squirrels, multi.c );
	}
}
