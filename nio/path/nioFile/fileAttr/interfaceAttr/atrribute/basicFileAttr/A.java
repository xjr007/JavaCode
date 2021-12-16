import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class A {
	public static void main(String[] args) {
		var path = Paths.get("../../data/zoo.log");

		try {
			BasicFileAttributes data = Files.readAttributes(path,
					BasicFileAttributes.class);

			System.out.println(data.isDirectory());
			System.out.println(data.isRegularFile());
			System.out.println(data.isSymbolicLink());
			System.out.println(data.size());
			System.out.println(data.lastModifiedTime());
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
