import java.util.stream.*;
import java.util.function.*;
import java.util.*;

public class A {
	public static void main(String[] args) {
		var list = List.of("monkey", "2", "chimp");
		Stream<String> infinite = Stream.generate( () -> "chimp" );

		Predicate<String> cond = x -> Character.isLetter(x.charAt(0));

		System.out.println( list.stream().anyMatch(cond) );
		System.out.println( list.stream().allMatch(cond) );
		System.out.println( list.stream().noneMatch(cond) );
		System.out.println( infinite.anyMatch(cond) );
		
		
		
	}
}
