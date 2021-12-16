import java.nio.file.*;

public class A {
	public static void main(String[] args) {
		Path sample_path = Paths.get("../../data/sample.txt");
		Path zoo_path = Paths.get("../../data/zoo.txt");
		Path varg_path = Paths.get("../", "../", "data/");
	}
}
