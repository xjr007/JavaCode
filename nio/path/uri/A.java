import java.nio.file.*;
import java.net.*;

public class A {
	public static void main(String[] args) throws URISyntaxException {
		URI a = new URI("file:///home/thedevilsduke/Documents/exam/ocp/exercises/io/data/zoo.txt");
		Path b = Path.of(a);
		Path c = Paths.get(a);
		URI d = b.toUri();

		System.out.println(d.isAbsolute());
	}
}
