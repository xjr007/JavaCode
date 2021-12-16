public class BookReader implements AutoCloseable {
	private String tag;
	public BookReader(String tag) {
		this.tag = tag;
	}

	@Override public void close() {
		System.out.println("Closed " + tag);
	}
}

class A {
	public static void main(String[] args) {
		try(var bookReader = new BookReader("James Patterson")) {
			System.out.println("Try block");
		} finally {
			System.out.println("Finally block");
		}
	}
}
