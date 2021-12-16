import java.io.*;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Console console = System.console();
		console.writer().format(new Locale("fr", "CA"), "Hello World");
	}
}
