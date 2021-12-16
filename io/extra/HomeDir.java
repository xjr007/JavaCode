import java.io.*;

public class HomeDir {
	public static void main(String[] args) {
		File home_dir = new File(System.getProperty("user.home"));
		File file = new File(home_dir, "/Documents/exam/ocp/exercises/io/data/sample.txt");
		
		HomeDir cursor = new HomeDir();
		cursor.fileChecker(file);
	}

	private void fileChecker(File file) {
		if(file.exists()) {
			System.out.println("File exist: " + file.exists());
			System.out.println("Last modified: " + file.lastModified());
		}
	}
}
