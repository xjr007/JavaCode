import java.io.*;

public class A {

	void validateFile() throws FileNotFoundException, IOException {
		try(var file = new BufferedReader(
			new FileReader(
				new File("zoo.log")))) {
			System.out.println("File exists");
		} catch(FileNotFoundException e) {
			System.err.println("File not found.");
		}
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Output");
		System.err.println("Error Output");

		A a = new A();
		a.validateFile();
	}
}
