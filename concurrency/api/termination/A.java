import java.util.concurrent.*;

public class A {
	private static Runnable task = () -> System.out.println("Executing task");
	private class B {
		ExecutorService service = null;
		synchronized void main() throws InterruptedException {
			try{
				service = Executors.newSingleThreadExecutor();
				service.submit(task);
				System.out.println("Loading...");
				service.awaitTermination(2, TimeUnit.SECONDS);
				System.out.println("End process.");
			} finally{
				if(service != null) service.shutdown();
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			service.submit(task);

		} finally {
			if(service != null) service.shutdown();
		}

		if(service != null) {
			try {
				service.awaitTermination(2, TimeUnit.SECONDS);
				if(service.isTerminated()) {
					System.out.println("Complete.");
				} else {
					System.out.println("At least 1 task is still running");
				}
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		A.B b = new A().new B();
		b.main();
	}
}
