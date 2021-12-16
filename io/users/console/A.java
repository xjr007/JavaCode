import java.io.*;

public class A {
	void usingConsole() {
		// Console console = System.console();
		Console console = null;
		if(console == null) {
			System.err.println("Console not available.");
		} else {
			String userInput = console.readLine();
			console.writer().println("You entered: " + userInput);
		}
	}

	public static void main(String[] args) {
		A a = new A();
		a.usingConsole();
	}
}
