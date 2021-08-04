package enums.arraynums;

import java.util.*;
import java.util.function.Consumer;
import enums.Season;

public class SeasonSelector {
	static Consumer<String> print = System.out::println;

	public static void main(String... args)  {
		final SeasonSelector currentSeason = new SeasonSelector();
		print.accept( currentSeason.getSeason() );
	}

	private Season getSeason() {
		final Random random = new Random();
		final int rand_int = random.nextInt(4);

		Season[] seasonArray = new Season[4];
		seasonArray = Season.values();

		return seasonArray[rand_int];
	}
}
