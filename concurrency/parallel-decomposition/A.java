import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;

public class A {
	private int work(int input) {
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}

		return input;
	}

	private void testSerialStream() {
		long start = System.currentTimeMillis();
		List.of(1, 2, 3, 4, 5)
			.stream()
			.map(x -> work(x))
			.forEach(System.out::println);
		System.out.println("Time taken (s): " + (System.currentTimeMillis() - start)/1000);

	}

	private void testParallelStream() {
		long start = System.currentTimeMillis();
		List.of(1, 2, 3, 4, 5)
			.parallelStream()
			.map(x -> work(x))
			.forEachOrdered(System.out::println);
		System.out.println("Time taken (s): " + (System.currentTimeMillis() - start)/1000);
	}

	public static void main(String[] args) {
		A handler = new A();
		handler.testSerialStream();
		handler.testParallelStream();
	}}
