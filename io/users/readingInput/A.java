import java.io.*;

public class A {
	public static void main(String[] args ) throws IOException {
		var reader = new BufferedReader(
			new InputStreamReader(System.in));
		String userInput = reader.readLine();
		System.out.println("You entered: " + userInput);
	}
}
