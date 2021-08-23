import java.util.function.*;
import java.util.stream.*;
import java.util.*;
import java.io.*;

public class A {
	
	public static List<String> create() throws IOException {
		throw new IOException();
	}

	private static List<String> createSafe() {		// safe wrapper
		try{
			return A.create();
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
	}

	private void _1() throws IOException {
		A.create().stream().count();

		// Supplier<List<String>> s = A::create;	// Exception is unhandled in lambda
		
		Supplier<List<String>> s = () -> {		// Catch checked and turn it into unchecked
			try{
				return A.create();
			} catch(IOException e) {
				throw new RuntimeException(e);
			}
		};
	}

	private void _2() {
		Supplier<List<String>> safe = A::createSafe;
	}

	public static void main(String[] args) {
		A a = new A();
		try{
			a._1();
			a._2();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class B {
	public static void main(String[] args) {
		A a = new A();

		try{
			a.create();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
