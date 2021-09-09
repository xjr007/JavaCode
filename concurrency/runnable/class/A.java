public class A implements Runnable {
	private void _1() {
		Runnable task1 = () -> System.out.println("Start thread 1");
		Runnable task2 = () -> {};
		
		Thread thread1 = new Thread( task1 );
		thread1.start();

		Thread thread2 = new Thread( task2 );
		thread2.start();

		Thread thread3 = new Thread( new A() );
		thread3.start();
		System.out.println("Stop");
	}
	public void run() {
		System.out.println("Running");
	}
	
	public static void main(String[] args) {
		A a = new A();
		a._1();
	}
}
