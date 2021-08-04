public final class A {
	public void aMethod() {
		System.out.println("Method in A");
	}
}

class B extends A {
	public static void main(String... args) {
		A a = new A();
		a.aMethod();
	}
}
