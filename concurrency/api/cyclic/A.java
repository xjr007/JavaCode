import java.util.concurrent.*;

public class A {
	private void meth_1() {
		System.out.println("Method 1");
	}

	private void meth_2() {
		System.out.println("Method 2");
	}	

	private void meth_3() {
		System.out.println("Method 3");
	}

	public void runMethods(CyclicBarrier c1, CyclicBarrier c2) {
		try {
			meth_1();
			c1.await();
			meth_2();
			c2.await();
			meth_3();

		} catch(InterruptedException | BrokenBarrierException e) {
			throw new RuntimeException(
				"Problem running methods with cyclic barrier.");
		}
	}

	public static void main(String[] args) {
		ExecutorService service = null;

		try {
			service = Executors.newFixedThreadPool(15);
			var manager = new A();
			var c1 = new CyclicBarrier(2);
			var c2 = new CyclicBarrier(3, () -> System.out.println("Marker: Method 1 and 2 now complete."));

			for(var i = 0; i < 15; i++) {
				service.submit(() -> manager.runMethods(c1, c2));
			}
		/*	service.submit(() -> manager.runMethods(c1, c2));
			service.submit(() -> manager.runMethods(c1, c2));
			service.submit(() -> manager.runMethods(c1, c2));
			service.submit(() -> System.out.println("Random thread"));
*/
		} finally {
			if(service != null) service.shutdown();
		}

		if(service != null) 
			try {
				service.awaitTermination(1, TimeUnit.SECONDS);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}

		if(service.isTerminated()) System.out.println("Program End.");
	}
	
}
