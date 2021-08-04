import static java.lang.System.out;

import java.util.*;
import java.util.function.*;

public class Methods {
	public static void main(String args[]) {
		showAdd();
		showRemove();
		showEmptyAndSize();
		showClear();
		showContains();
		showRemoveIf();
		showForEach();
	}

	private static void showAdd() {
		Collection<String> list = new ArrayList<>();
		out.println( list.add("Sparrow") );
		out.println( list.add("Sparrow") );

		Collection<String> set = new HashSet<>();
		out.println( set.add("Sparrow") );
		out.println( set.add("Sparrow") );
	}

	private static void showRemove() {
		Collection<String> birds = new ArrayList<>();
		birds.add("Hawk");
		birds.add("hawk");

		out.println( birds.remove("cardinal") );
		out.println( birds.remove("hawk") );
		out.println(birds);
	}

	private static void showEmptyAndSize() {
		Collection<String> birds = new ArrayList<>();
		out.println( birds.isEmpty() );
		out.println( birds.size() );

		birds.add("hawk");
		birds.add("hawk");
		
		out.println( birds.isEmpty() );
		out.println( birds.size() );
	}

	private static void showClear() {
		Collection<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("hawk");

		out.println( birds.isEmpty() );
		out.println( birds.size() );

		birds.clear();

		out.println( birds.isEmpty() );
		out.println( birds.size() );
	}

	private static void showContains() {
		Collection<String> birds = new ArrayList<>();
		birds.add("hawk");

		out.println( birds.contains("hawk") );
		out.println( birds.contains("robin") );
	}

	private static void showRemoveIf() {
		
		Collection<String> list = new ArrayList<>();
		list.add("Magician");
		list.add("Assistant");

		out.println(list);

		list.removeIf( s -> s.startsWith("A") );
		
		out.println(list);

		class WithMethodReference {
			void showRemoveIf() {
				Collection<String> set = new HashSet<>();
				set.add("Wand");
				set.add("");

				set.removeIf( String::isEmpty );
				
				out.println(set);
			}
		}

		WithMethodReference withMeth = new WithMethodReference();
		withMeth.showRemoveIf();
	}

	private static void showForEach() {
		Collection<String> cats = Arrays.asList("Annie", "Ripley");
		cats.forEach( out::println );
		cats.forEach( c -> out.println(c) );
	}

}
