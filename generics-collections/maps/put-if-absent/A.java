import java.util.*;

public class A {
	private static void showPutIfAbsent() {
		Map<String, String> favourites = new HashMap<>();
		favourites.put("Jenny", "Bus Tour");
		favourites.put("Tom", null);

		favourites.putIfAbsent("Jenny", "Tram");			// returns Bus Tour
		String s1 = favourites.putIfAbsent("Sam", "Tram");		// returns null
		String s2 = favourites.putIfAbsent("Tom", "Tram");		// returns null
		System.out.println(favourites);					// {Tom=Tram, Jenny=Bus Tour, Sam=Tram}
		System.out.println(s1 + " " + s2);
	}

	public static void main(String[] args) {
		showPutIfAbsent();
	} 
}
