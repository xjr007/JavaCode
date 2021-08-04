import java.util.function.Consumer;

public class A {
	final private Consumer<Integer> print = System.out::println;
	private int x = 10;
	
	public static void main(String... args) {
		A a = new A();

		B b = a.new B();
		//A.B b = a.new B();
		
		A.B.C c = b.new C();
		
		c.allTheX();
	}

	class B {
		private int x = 20;

		class C {
			private int x = 30;

			public void allTheX() {
				print.accept(x);
				print.accept(this.x);
				print.accept(B.this.x);
				print.accept(A.this.x);
			}
		}
	}
}
