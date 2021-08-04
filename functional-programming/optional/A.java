import java.util.*;
import java.io.*;

public class A {
	public static void instanceMethods() throws IOException {
		Optional<Double> opt1 = average(90, 100);
		Optional<Double> opt2 = average();

		System.out.println( opt2.orElse(Double.NaN) );
		System.out.println( opt1.orElseGet( () -> Math.random() ));
		
		System.out.println( opt1.orElseThrow() );

		System.out.println(opt2.orElseThrow( () -> new IOException() ));
	}

	public static Double averageOfTests() {
		Optional average = Optional.ofNullable( average(80, 90, 100).get() );
		return (Double) average.get();
	}

	public static Optional<Double> average(int... scores) {
		if(scores.length == 0) return Optional.empty();
		
		int sum = 0;
		for(int score: scores) sum += score;
		return Optional.of( (double) sum / scores.length );	// Casting int to double becuase optional is decl as double
	}

	public static void main(String[] args) {
		// One liner >>
		Optional<Double> opt = average(80, 90, 100);
		opt.ifPresent(System.out::println);
		
		System.out.println( averageOfTests() );

		try{
			instanceMethods();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
