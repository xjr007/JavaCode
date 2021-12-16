import java.nio.file.*;

public class A {
	void readingFileAttributes() {
		System.out.println(Files.isDirectory(Paths.get("../../data/zoo.log")));
		System.out.println(Files.isSymbolicLink(Path.of("../../data")));
		System.out.println(Files.isRegularFile(Paths.get("../../data/zoo.log")));
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.readingFileAttributes();
	}
}
