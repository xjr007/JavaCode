import java.io.*;

public class Manipulate {
	public static final String relative_path = "../data/";
	public static final String absolute_path = "/home/thedevilsduke/Documents/exam/ocp/exercise/io/data/";
	void readData() throws IOException {
		File zooFile = new File(relative_path, "zoo.txt");
		
		if(!zooFile.exists()) {
			throw new IOException("File not found");
		}

		try(var br = new BufferedReader(new FileReader(zooFile) )) {
			Manipulate handler = new Manipulate();
			handler.printData(br);

		} catch(IOException e) {
			e.getMessage();
		} finally {
			System.out.println("Number of bytes: " + zooFile.length() );
		}
	}
	void printData(Reader r) throws IOException {
		int data = 0;
		while((data = r.read()) != -1) {
			System.out.println(data);
		}
		System.out.println(data > 0);
	}

	void checkFile() throws IOException {
		File file = new File(relative_path, "zoo.txt");
		System.out.println("File info: " + file.length() + file.exists());
	}

	public static void main(String... args) {
		Manipulate app = new Manipulate();
		try {
		app.readData();
		app.checkFile();
		} catch(Exception e) {
			e.getMessage();
		}
	}
}
