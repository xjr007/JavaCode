import java.nio.file.*;

public class A {
	public static void main(String[] args) {
		var path = Paths.get("birds/condor.txt");
		System.out.println("Is absolute path? " + path.isAbsolute());
		System.out.println("Absolute path " + path.toAbsolutePath());
	}
}
