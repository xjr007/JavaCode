import java.util.*;
import java.util.function.*;

public class A {
	public static void main(String[] args) {
		Supplier<List<String>> methRef = ArrayList::new; //	new ArrayList();

		Function<Integer, List<String>> methRef2 = ArrayList::new; //	x -> new ArrayList(x);
	}
}
