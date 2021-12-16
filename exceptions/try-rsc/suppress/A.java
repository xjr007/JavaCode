class Turkey implements AutoCloseable {
	public void close() throws IllegalStateException {
		throw new IllegalStateException("Could not close gate.");
	}

	public Turkey() {
		System.out.println("Leading turkey's through gate.");
	}
}

class Cow implements AutoCloseable {
	public void close() throws ArithmeticException {
		throw new ArithmeticException("Could not count all cows");
	}
	
	public Cow() {
		System.out.println("Counting all the cows.");
	}
}

public class A {

	public void doChores() throws Exception {
		try(Turkey turkey = new Turkey();
		Cow cow = new Cow();) {
			throw new Exception("Things go wrong.");
		} catch(ArithmeticException | IllegalStateException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws Exception {
		A farm = new A();
		farm.doChores();
	}
}
