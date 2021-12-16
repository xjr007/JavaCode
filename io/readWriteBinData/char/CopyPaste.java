import java.io.*;

public class CopyPaste {
	public void copyFile(File src, File dest) throws IOException {
		try(var reader = new FileReader(src);
			var writer = new FileWriter(dest)) {
			
			int b;
			while( (b = reader.read()) != -1 ) {
				writer.write(b);
			}
		} catch(FileNotFoundException e) {
			throw new FileNotFoundException("File not found.");
		} catch(IOException e) {
			throw new IOException("Error copying file...");
		}
	}

	public static void main(String... args) throws IOException {
		var zoo_file = new File("../../data/zoo.txt");
		var sample_file = new File("../../data/sample.txt");

		CopyPaste fileHandler = new CopyPaste();
		try {
			fileHandler.copyFile(zoo_file, sample_file);
		} catch(IOException e) {
			e.getMessage();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
