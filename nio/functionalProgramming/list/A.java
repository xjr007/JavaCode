import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class A {
	static void getDirectoryTree() throws IOException {
		try(Stream<Path> s = Files.list(Path.of(System.getProperty("user.dir")))) {
			s.forEach(System.out::println);
		}
	}

	public static void main(String[] args) throws IOException {
		getDirectoryTree();
	}
}
