import java.util.*;
import java.time.*;
import java.time.format.*;
import static java.time.format.FormatStyle.*;

public class LocaleDates {
	public static void print(DateTimeFormatter dtf, LocalDateTime dt, Locale locale) {
	System.out.println(dtf.format(dt) + ", " + dtf.withLocale(locale).format(dt));
	}
}

class A {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter
			.ofPattern("MMM, YYYY, dd 'at' hh:mm");
		
		LocalDateTime dt = LocalDateTime
			.of(2020, Month.JANUARY, 06, 06, 15, 30, 200);
		
		Locale zar = new Locale("en_ZAR");
		Locale italy = new Locale("it_IT");
		
		LocaleDates.print(dtf, dt, zar);

		LocaleDates.print(DateTimeFormatter.ofLocalizedDate(SHORT), dt, italy);
		LocaleDates.print(DateTimeFormatter.ofLocalizedTime(SHORT), dt, italy);
		LocaleDates.print(DateTimeFormatter.ofLocalizedDateTime(SHORT, SHORT), dt, italy);
	}

}
