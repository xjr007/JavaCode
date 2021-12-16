import java.nio.file.*;
import java.io.*;

public class A {
	public static void main(String[] args) throws IOException {
		System.out.println("File size in bytes: " + Files.size(Paths.get("../../data/zoo.log")));
	}
}
