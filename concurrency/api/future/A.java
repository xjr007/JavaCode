import java.util.concurrent.*;

public class A {
	private static int counter = 0;

	private void _1() throws Exception {
		ExecutorService service = null;

		try {
			service = Executors.newSingleThreadExecutor();
			Future<?> result = service.submit(() -> {
				for(int i = 0; i < 500; i++)
					A.counter++;
			});
			
			result.get(10, TimeUnit.MICROSECONDS);
			System.out.println("Reached!");
		}catch(TimeoutException e) {
			System.out.println("Not reached in time!");
		}finally {
			if(service != null) service.shutdown();
		}
	}

	public static void main(String[] args) throws Exception {
		A a = new A();
		a._1();
	}
}
