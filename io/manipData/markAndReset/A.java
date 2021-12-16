import java.io.*;
public class A {
	private static final String relative_path = "../../data/";
	public void readData(InputStream is) throws IOException {
		System.out.print( (char) is.read() );
		if(is.markSupported()) {
			is.mark(100);
			System.out.print( (char)is.read() );
			System.out.print( (char) is.read() );
			is.reset();
		}

		System.out.print( (char) is.read() );
		System.out.println( (char) is.read() );
	}
	public static void main(String... args) {
		File file = new File(relative_path, "zoo.txt");
		try(var bis = new BufferedInputStream(
			new FileInputStream(file))) {
		
			A handler = new A();
			handler.readData(bis);

		} catch(IOException e) {
			e.getMessage();
		} catch(Exception e) {
			e.printStackTrace();
		}
	} 
}
