import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.stream.*;

public class A {
	private static int counter;
	private static List<String> error_messages = new ArrayList<>();

	public void find(Path path) throws IOException, Exception {
		long minSize = 1_000;
		
		try(var s = Files.find(path, 20, (p,a ) -> 
					a.isRegularFile() &&
					p.toString().endsWith(".java") &&
					a.size() > minSize)) {
			s.forEach(System.out::println);
		} catch(FileNotFoundException e) {
			counter++;
			throw new FileNotFoundException("File does not exist.");
		} catch(FileSystemLoopException e) {
			counter++;
			throw new FileSystemLoopException("Recursive search.");
		} catch(IOException e) {
			counter++;
			throw new IOException("Searching files.");
		} finally {
			counter++;
			throw new Exception("Exception occurred.");
		}
	}

	public static void main(String[] args) throws Exception {
		try {
			Path path = Path.of(args[0]);

			A a = new A();
			a.find(path);

		} catch(Exception e) {
			error_messages.add(e.getMessage());
		} finally {
			int i = 0;
			System.out.print("Errors occured: ");
			if(counter == 0) System.out.println(0);
			else {
				System.out.println(counter);
				for(String error: error_messages) System.out.println(++i + ". " + error);
			}
		}

	}
}
