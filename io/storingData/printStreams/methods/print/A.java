import java.io.*;

public class A {
	public static void main(String[] args) throws FileNotFoundException {
		try(PrintWriter out = new PrintWriter("../../../../data/sample.txt")) {
			out.write(String.valueOf(5));
			out.print(5);

			var chimp = new Chimpanzee();
			out.write( chimp == null ? "null": chimp.toString() );
			out.print(chimp);
		}
	}
}

class Chimpanzee implements Serializable {
	private String name;
	private int age;

	public Chimpanzee() {
		this.name = new String("Rufus");
		this.age = Integer.valueOf(4);
	}

	public String toString() {
		return name + " | " + age;
	}
}
