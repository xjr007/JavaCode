import java.nio.file.*;

public class A {
	public static void main(String[] args) {
		Path path = Paths.get("../../data/zoo.log");
		System.out.println("The path name is: " + path);
		for(int i = 0; i < path.getNameCount(); i++)
			System.out.println("Element " + i + " is: " + path.getName(i));
	}
}
