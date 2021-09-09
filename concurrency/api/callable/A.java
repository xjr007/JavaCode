import java.util.concurrent.*;

public class A {
	private void _1() throws Exception {
		ExecutorService service = null;

		try {
			service = Executors.newSingleThreadExecutor();
			Future<Integer> result = service.submit(() -> 30 + 11);
			System.out.println(result.get());
		}finally {
			if(service != null) service.shutdown();
		}

		if(service != null) service.awaitTermination(1, TimeUnit.MINUTES);
		if(service.isTerminated()) System.out.println("Finished");
		else System.out.println("At least 1 task is still running");
	}

	public static void main(String[] args) throws Exception {
		A a = new A();
		a._1();
	}
}
