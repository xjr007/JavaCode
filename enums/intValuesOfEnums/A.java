package enums.intValuesOfEnums;

import java.util.function.*;
import enums.Season;

public class A {
	static Consumer<String> print = System.out::println;
	public static void main(String... args) {
		for( Season season: Season.values() ) {
			print.accept( season.name() + " " + season.ordinal() );
		}
	}
}
