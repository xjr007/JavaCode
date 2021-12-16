import java.nio.*;
import java.nio.file.Path;

public class  A {
	
	public static void main(String... args) {
		Path sample_path = Path.of("../../data/sample.txt");
		Path zoo_path = Path.of("../../data/zoo.txt");
		Path varg_path = Path.of("../", "../", "data/");
	}
}
