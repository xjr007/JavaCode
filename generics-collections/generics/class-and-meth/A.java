public class A <T> {
	private static <A> A isType(A type) {
		return type;
	}

	public static void main(String[] args) {
		A<B> a = new A<>();
		String type = "";
		type = a.isType("String");
		System.out.println(type);

	}
}

class B {}
