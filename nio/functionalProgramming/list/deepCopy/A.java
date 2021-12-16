import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class A {
	public void copyPath(Path src, Path trgt) throws IOException {
		try {
			Files.copy(src, trgt);
			if(Files.isDirectory(src))
				try(Stream<Path> s = Files.list(src)) {
					s.forEach(p -> {
					try {
						copyPath(p, trgt.resolve( p.getFileName() ));
					}catch(IOException e) {
						e.printStackTrace();
					}});
				}
		} catch(IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("../../data/zoo.log");
		Path path2 = Path.of("../../data/sample.txt");
		
		A a = new A();
		try {
			a.copyPath(path, path2);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
