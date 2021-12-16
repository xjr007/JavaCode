import java.io.*;

public class CopyPaste {
	void copyFileWithBuffer(File src, File dest) throws IOException {
		try(var in = new BufferedInputStream(
			new FileInputStream(src));
			var out = new BufferedOutputStream(
			new FileOutputStream(dest))) {
			var buffer = new byte[1024];
			
			int lengthRead;
			while( (lengthRead = in.read(buffer)) > 0 ) {
				out.write(buffer, 0, lengthRead);
				out.flush();
			}

		} catch(FileNotFoundException e) {
			throw new FileNotFoundException("File does not exist.");
		} catch(IOException e) {
			throw new IOException("Something went wrong...");
		}
	}

	public static void main(String[] args) throws IOException {
		File zoo_file = new File("../../data/", "zoo.txt");
		File sample_file = new File("../../data/", "sample.txt");
		
		CopyPaste fileHandler = new CopyPaste();
		try {
			fileHandler.copyFileWithBuffer(zoo_file, sample_file);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
