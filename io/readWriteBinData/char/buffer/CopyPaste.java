import java.io.*;

public class CopyPaste {
	void copyTextFileWithBuffer(File src, File dest) throws IOException {
		try(var reader = new BufferedReader(
			new FileReader(src));
			var writer = new BufferedWriter(new FileWriter(dest))) {
		
			String s;
			while( (s = reader.readLine()) != null ) {
				writer.write(s);
				writer.newLine();
			}

		} catch(FileNotFoundException e) {
			throw new FileNotFoundException("File does not exist");
		} catch(IOException e) {
			throw new IOException("Could not write to file.");
		}
	}
	
	public static void main(String[] args) throws IOException {
		var zoo_file = new File("../../../data/zoo.txt");
		var sample_file = new File("../../../data/sample.txt");

		CopyPaste fileHandler = new CopyPaste();
		try {
			fileHandler.copyTextFileWithBuffer(zoo_file, sample_file);
		
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println("Application error.");
			e.printStackTrace();
		}
	}
}
