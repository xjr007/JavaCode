import java.io.*;

public class CopyPaste {
	private static final String path = "../data/";
	void copyFile(File src, File dest) throws IOException {
		// Copies ALL contents of src -> dest

		try(var in = new FileInputStream(src);
			var out = new FileOutputStream(dest)) {
				int b;
				while( (b = in.read()) != -1 ) {
					out.write(b);
				}
		} catch(FileNotFoundException e) {
			throw new FileNotFoundException("File does not exist.");
		}
	}

	public static void main(String... args) throws IOException {
		CopyPaste fileHandler = new CopyPaste();
		var zoo_file = new File(path, "zoo.txt");
		var sample_file = new File(path, "sample.txt");
		try {
			fileHandler.copyFile(zoo_file, sample_file);
		} catch(IOException e) {
			e.getMessage();
			System.out.println();
			e.printStackTrace();
		}
	}
}
