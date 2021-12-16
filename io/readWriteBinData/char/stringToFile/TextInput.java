import java.io.*;

public class TextInput {
	void writeToFile(File dest, String text) throws IOException {
		try(var writer = new BufferedWriter(
			new FileWriter(dest))) {
			writer.write(text);
		} catch(FileNotFoundException e) {
			throw new FileNotFoundException("File does not exist.");
		} catch(IOException e) {
			throw new IOException("Could not write to file " + dest.getName() );
		}
	}

	public static void main(String[] args) throws IOException {
		var out_file = new File("../../data/sample.txt");

		TextInput fileHandler = new TextInput();
		try {
			var textToWrite = "This is a String that is being written to this text file.";
			fileHandler.writeToFile(out_file, textToWrite);
		} catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("Application error.");
			e.printStackTrace();
		}
	}
}
