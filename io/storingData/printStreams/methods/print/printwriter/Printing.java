import java.io.*;

public class Printing {
	void printToFile(PrintWriter out) throws IOException {
		out.print("Today's weather is: ");
		out.println("Sunny");
		out.print("Today's temperature at the zoo is: ");
		out.print(1 / 3.0);
		out.println('C');
		out.format("It has rained %5.2f inches this year %d", 10.2, 2021);
		out.println();
		out.printf("It may rain %s more inches this year", 1.2);
	}

	public static void main(String[] args) throws Exception {
		File src = new File("zoo.log");
		Printing a = new Printing();

		try(var out = new PrintWriter(
			new BufferedWriter(
				new FileWriter(src)))) {
			a.printToFile(out);
		} catch(FileNotFoundException e) {
			throw new FileNotFoundException("File does not exist.");
		} catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
