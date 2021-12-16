import java.nio.file.*;
import java.io.*;

public class A {
	public static void main(String[] args) throws IOException {
		System.out.println(Files.getLastModifiedTime(Path.of("../../data/zoo.log")).toMillis());
	}
}
