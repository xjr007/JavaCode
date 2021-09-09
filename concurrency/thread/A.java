public class A {
	private void _1() {
		var threads = new Thread() {
			@Override
			public void run() {
				System.out.println("Running from Anonymous class");
			}
		};
		threads.start();
	}
	public static void main(String[ ] args) {
		A a = new A();
		a._1();
	}
}
