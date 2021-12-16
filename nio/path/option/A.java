import java.nio.file.*;
import java.nio.*;
import java.io.*;

public class A {
	void copy(Path src, Path target) throws IOException {
		Files.move(src, target,
				LinkOption.NOFOLLOW_LINKS,
				StandardCopyOption.ATOMIC_MOVE
				);
	}
	
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("./data/sample.txt");
		Path path2 = Path.of("./data/etc/", "zoo.log");
		boolean exists = Files.exists(path2, LinkOption.NOFOLLOW_LINKS);
		System.out.println(exists);

		A a = new A();
		try {
			a.copy(path, path2);
		} catch(IOException e) {
			System.err.println("File not found.");
		}

	}
}
