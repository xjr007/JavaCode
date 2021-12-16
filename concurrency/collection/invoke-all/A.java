import java.util.concurrent.*;
import java.util.*;

public class A {
	public static void main(String[] args) throws InterruptedException, Exception {
		ExecutorService service = null;
		
		// Some tasks
		
		Callable<String> task_1 = () -> "Callable task 1.";
		Callable<String> task_2 = () -> {
			var x = 5;
			var y = 10;

			return "" + x * y;
		};

		Runnable task_3 = () -> System.out.println("Runnable task 1.");
		Runnable task_4 = () -> {
			var x = 4;
			var y = 9;
			
			System.out.println(x * y);
			return;
		};

		// Thread creation
		
		try {
			service = Executors.newSingleThreadExecutor();
			
			List<Future<String>> list = service.invokeAll(
					List.of(task_1, task_2)
					);
			for(Future<String> result: list) System.out.println(result.get());
		} catch(InterruptedException e) {
			throw new InterruptedException("Could not complete all tasks.");
		} catch(Exception e) {
			throw new Exception("Could not run thread.");
		} finally {
			if(service != null) service.shutdown();
		}

	}
}
