public class A {
	private class B implements Runnable {
		public void run() {
			System.out.println("I am now running");
		}
	}

	private void _1() {
		Runnable thread_1 = () -> System.out.println("1st thread");
		Runnable thread_2 = () -> System.out.println("2nd thread");

		Thread threads_1 = new Thread(new A().new B());			// Implements Runnable Interface
		threads_1.start();

		Thread threads_2 = new Thread(thread_1);			// Of Type Runnable
		threads_2.start();
	}
	public static void main(String[] args) {
		A a = new A();
		a._1();
	}
}
