public class A {
	private class B { int x = 2;}

	private void _1(int num) {
		num = num + 3;
		System.out.println(num);
	}
	public static void main(String[ ] args) {
		A a = new A();
		A.B b = new A().new B();
		a._1(b.x);
		System.out.println(b.x);
	}
}
