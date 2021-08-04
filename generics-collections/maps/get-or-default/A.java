import java.util.*;
import static java.lang.System.out;

public class A {
	private static void showGetOrDflt() {
		Map<Character , String> map = new HashMap<>();
		String sentX = "X marks the ";
		String sentY = "Y marks the ";

		map.put('x', "spot");
		out.println( sentX + map.get('x') ); // returns null if no key is mapped
		out.println( sentX + map.getOrDefault('x', "") );
		out.println( sentY + map.get('y') );
		out.println( sentY + map.getOrDefault('y', "") );
	}

	public static void main(String[] args) {
		showGetOrDflt();
	}
}
