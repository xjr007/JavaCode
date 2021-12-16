import java.io.File;
import java.nio.file.*;

public class A {
	public static void main(String[] args) {
		File file = new File("../../data/zoo.txt");
		Path path = file.toPath();
		File toFile = path.toFile();
	}
}
