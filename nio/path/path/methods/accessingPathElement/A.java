import java.nio.file.*;

public class A {
	public void printPathInfo(Path path) {
		System.out.println("File name is " + path.getFileName());
		System.out.println("Root is " + path.getRoot());

		Path currParent = path;
		while( (currParent = currParent.getParent()) != null ) {
			System.out.println("Current parent is " + currParent);
		}
	}

	public static void main(String[] args) {
		A a = new A();
		a.printPathInfo(Path.of("zoo.log"));
		a.printPathInfo(Path.of("/home/thedevilsduke/Documents/exam/ocp/exercises/nio/path/path/data/zoo.log"));
		a.printPathInfo(Path.of("../../data/zoo.log"));
	}
}
