import java.util.*;
import static java.lang.System.out;

public class A {
	private static void showMaps(Map<String, String> map) {
		//	HashMap & TreeMap
		
		map.put("koala", "bamboo");
		map.put("lion", "meat");
		map.put("giraffe", "leaf");

		String food = map.get("koala");	// returns value of selected key

		for(String key: map.keySet()) {	// returns set of all keys
			out.print(key+ ", ");
		}

		out.println( map.containsKey("lion") );	// true
		out.println( map.containsValue("meat") );	// true
		out.println( map.size() );	// 3
		
		//	clear all
		map.clear();

		out.println( map.size() );	// 0
		out.println( map.isEmpty() );	// true

	}

	public static void main(String[] args) {
		showMaps( new HashMap<>() );	// assorted keys
		out.println();
		showMaps( new TreeMap<>() );	// sorted keys
	}
}
