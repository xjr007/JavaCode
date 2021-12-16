import java.util.concurrent.*;

public class A {
	void useCallable() throws Exception {
		ExecutorService service = null;
		Callable<Integer> task = () -> 45 + 15;

		try {
			service = Executors.newSingleThreadExecutor();
			Future<Integer> result = service.submit(task);
			System.out.println(result.get());
		} catch(Exception e) {
			throw new Exception("Task execution failure.");
		} finally {
			if(service != null) service.shutdown();
		}
	}

	public static void main(String[] args) throws Exception {
		 A a = new A();
		 a.useCallable();
	}
}
