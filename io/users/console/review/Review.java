import java.io.*;
import java.util.*;

public class Review {
	void consoleMethods() {
		Console console = System.console();
		if(console == null) {
			throw new RuntimeException("Console not available.");
		} else {
			String name = console.readLine("Please enter your name:	");
			console.writer().format("Hi %s", name);
			console.writer().println();

			console.format("What is your address? ");
			String address = console.readLine();

			char[] pswd = console.readPassword("Enter a password " +
			" between %d and %d characters: ", 5, 10);
			char[] verify = console.readPassword("Enter the password again: ");
			console.printf("Passwords " + 
			(Arrays.equals(pswd, verify) ? "match" : "do not match"));
			console.writer().println();
		}
	}

	public static void main(String[] args) {
		Review run = new Review();
		run.consoleMethods();
	}
}
