import java.util.*;

public class HowToIter {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Something");
		list.add("smells");
		list.add("nice");

		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
	}
}
