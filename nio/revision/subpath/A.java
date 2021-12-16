import java.nio.file.*;

public class A {
	public static void main(String[] args) {
		Path path = Path.of("./data/etc/zoo.log");
		Path piece = path.subpath(1, 4);
		System.out.println(piece.getNameCount());
		System.out.println(piece.getFileName());
	}
}
