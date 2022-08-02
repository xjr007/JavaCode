import java.util.concurrent.locks.*;

public class A {
	public static void printMessage(Lock lock) {
		try{
			lock.lock();
		} finally{
			lock.unlock();
		}
	}
	private void _1() {
		Lock lock = new ReentrantLock();
		new Thread( () -> printMessage(lock) ).start();

		if(lock.tryLock()) {
			try{
				System.out.println("Lock obtained, entering protected mode.");
			} finally{
				lock.unlock();
			}
		} else{
			System.out.println("Unable to obtain lock, doing something else");
		}
	}

	public static void main(String[] args) {
		A a = new A();
		a._1();
	}
}
