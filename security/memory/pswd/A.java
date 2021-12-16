import java.io.*;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Console console = System.console();
		char[] pswd = console.readPassword();
		char[] pswd2 = pswd.clone();
		System.out.println(pswd);
		System.out.println(pswd2);
		pswd2 = null;
		Arrays.fill(pswd, 'x');
		System.out.println(pswd);
	}
}
