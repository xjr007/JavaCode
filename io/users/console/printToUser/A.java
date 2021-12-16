import java.io.*;

public class A {
	public static void main(String[] args) {
		Console console = System.console();
		if(console == null) {
			throw new RuntimeException("Console not available.");
		} else {
			console.writer().println("Welcome to our Zoo!");
			console.format("It has %d animals and employs %d people", 392, 25);
			console.writer().println();
			console.printf("The zoo spans %5.1f acres\n", 128.91);
		}
	}
}
