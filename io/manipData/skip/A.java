import java.io.*;

public class A {
	private static final String path = "../../data/";
	void readData(InputStream is) throws IOException {
		System.out.print( (char) is.read() );
		is.skip(15);
		is.read();
		System.out.print( (char) is.read() );
		System.out.print( (char) is.read() );
		System.out.print( (char) is.read() );
	}
	void validateFile(File file) throws IOException {
		if(!file.exists()) throw new IOException("File not found.");
		
		try(var bis = new BufferedInputStream(
			new FileInputStream(file))) {
			
			A handler = new A();
			handler.readData(bis);

		} catch(IOException e) {
			e.getMessage();
		}

		
	}

	public static void main(String[] args) {
		File file = new File(path, "zoo.txt");

		try {
			A a = new A();
			a.validateFile(file);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("..");
			e.getMessage();
		}
	}
}
