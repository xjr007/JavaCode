import java.nio.file.*;
import java.io.*;

public class A {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("./data/zoo/zoo.log");
		Path path2 = Path.of("./data/zoo2/zoo2.log");

		Path pathD = Paths.get("./data/zoo");
		Path pathD2 = Path.of("./data/zoo2");

		if(Files.exists(path) && Files.exists(pathD) && Files.exists(pathD2)) {
		System.out.println((Files.copy(path, path2, StandardCopyOption.REPLACE_EXISTING)).toString());
		//System.out.println((Files.copy(pathD, pathD2, StandardCopyOption.REPLACE_EXISTING)).toString());
		} else {
		
		}
	}
}
