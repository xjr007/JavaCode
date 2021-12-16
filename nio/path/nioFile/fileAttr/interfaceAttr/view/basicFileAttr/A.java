import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class A {
	public static void main(String[] args) throws IOException {
		Path path = Path.of("../../../../data/zoo.log");
		BasicFileAttributeView view = Files.getFileAttributeView(
				path,
				BasicFileAttributeView.class);
		BasicFileAttributes attributes = view.readAttributes();

		// Modify file last modified
		FileTime lastModifiedTime = FileTime.fromMillis(
				attributes.lastModifiedTime().toMillis() + 10_000);
		view.setTimes(lastModifiedTime, null, null);
		System.out.println(lastModifiedTime);

	}
}
