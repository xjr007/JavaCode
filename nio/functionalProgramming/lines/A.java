import java.util.stream.*;
import java.nio.file.*;
import java.io.*;

public class A {
	private void readLines(Path path) throws IOException {
		try(var s = Files.lines(path)) {
			s.filter(f -> f.startsWith("So"))
				.map(f -> f.substring(5))
				.forEach(System.out::println);
		} catch(IOException e) {
			throw new IOException("File could not be read.");
		}
	}

	public static void main(String[] args) throws Exception {
		Path path = Paths.get("../data/zoo.log");
		try {
			A a = new A();
			a.readLines(path);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
