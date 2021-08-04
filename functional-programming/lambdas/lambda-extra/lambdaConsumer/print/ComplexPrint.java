import java.util.*;
import java.util.function.*;

public class ComplexPrint {
	private static Consumer<String> prntStmnt = x -> System.out.print(x + " ");
	private static IntConsumer addVar = x -> {
		x = x++ + x;
		System.out.println(x);
	};

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("This ");
		stringList.add("is printed ");
		stringList.add("using the consumer ");
		stringList.add("functional interface ");
		stringList.add("with a lambda.");

		for(String s: stringList) prntStmnt.accept(s);
		System.out.println();
		addVar.accept(1);
	}
}
