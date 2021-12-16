import java.io.*;

public class Showcase {
	public static void main(String[] args) {
		var file = new File("/home/thedevilsduke/Documents/exam/ocp/exercises/io/data/zoo.txt");
		System.out.println("File exists: " + file.exists());
		
		if(!file.exists()) {
			file.mkdirs();
		} else {
			System.out.println("Absolute Path: " + file.getAbsolutePath());
			System.out.println("Is dir: " + file.isDirectory());
			System.out.println("Parent Path: " + file.getParent());
			
			if(file.isFile()) {
				System.out.println("Size: " + file.length());
				System.out.println("Last modified: " + file.lastModified());
			} else {
				for(File subfile: file.listFiles()) {
					System.out.println("" + subfile.getName());
				}
			}
		}
	}
}
