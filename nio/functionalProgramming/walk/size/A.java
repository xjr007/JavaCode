import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class A {
	private static List<String> error_messages = new ArrayList<>();
	private static int i;

	private long getSize(Path path) {
		try {
			return Files.size(path);
		} catch(IOException e) {
			i++;
			error_messages.add(e.getMessage());
		}

		return 0L;
	}

	public long getPathSize(Path src) throws IOException {
		try(var s = Files.walk(src)) {
			return s.parallel()
				.filter(p -> !Files.isDirectory(p))
				.mapToLong(this::getSize)
				.sum();
		} catch(IOException e) {
			throw new IOException("Could not retrieve file size.");
		}
	}

	public static void main(String[] args) throws Exception {
		//Path path = Paths.get("../../data/zoo.log");
		Path path = Path.of("/home/thedevilsduke/Documents");
		try {
			A a = new A();
			long size = a.getPathSize(path);
			System.out.printf("Total size of %s: %.2f MB \n", path.getFileName(), ( size/ 1_024_000.0 ));
		} catch(Exception e) {
			i++;
			error_messages.add(e.getMessage());
			e.printStackTrace();
			System.out.println();
		} finally {
			int n = 0;
			System.out.print("Occurred errors:");
			if(i <= 0) System.out.println(0);
			else {
				System.out.println(" " + i);
				for(String error: error_messages) System.out.println("" + ++n + ". " + error);
			}
		}
	}
}
