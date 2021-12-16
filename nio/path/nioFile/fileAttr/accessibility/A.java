import java.nio.file.*;
import java.io.*;

public class A {
	static void checkAccessibility() throws IOException {
		System.out.println(Files.isHidden(Paths.get("../../data/zoo.log")));
		System.out.println(Files.isReadable(Paths.get("../../data/zoo.log")));
		System.out.println(Files.isWritable(Path.of("../../data/zoo.log")));
		System.out.println(Files.isExecutable(Path.of("../../data/zoo.log")));
	}

	public static void main(String[] args) {
		try {
		checkAccessibility();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
