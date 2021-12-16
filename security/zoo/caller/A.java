import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class A {
	private void readFile() {
		Console console = System.console();
		String dirName = console.readLine();

		if(dirName.equals("mammals") || dirName.equals("birds")) {
			Path path = Paths.get("../data/diets/" + dirName);
			try(Stream<Path> stream = Files.walk(path)) {
				stream.filter(p -> p.toString().endsWith(".txt"))
					.forEach(System.out::println);
			}catch(IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("File not found");
		}
	}
	public static void main(String[] args) {
		A a = new A();
		a.readFile();
	}
}
