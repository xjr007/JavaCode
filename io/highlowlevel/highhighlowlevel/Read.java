import java.io.*;

public class Read {
	public static void main(String[] args) throws IOException {
		try(var ois = new ObjectInputStream(
			new BufferedInputStream(
				new FileInputStream(
					"zoo-data.txt")))) {
		System.out.println(ois.readObject());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
