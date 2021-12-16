import java.io.*;

public class Read {
	private static final String data_path = "/home/thedevilsduke/Documents/exam/ocp/exercises/io/data/";
	public static void main(String[] args) throws IOException {
		
		if(new File(data_path, "zoo-data.txt").exists()) {
			try(var br = new BufferedReader(new FileReader(
							"zoo-data.txt"))) {
				System.out.println(br.readLine());
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}else System.out.println("Does not exist");
	}
}
