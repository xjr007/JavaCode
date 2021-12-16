import java.util.concurrent.*;
import java.util.*;

public class A {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = null;
		Callable<String> task_1 = () -> "This is task 1";
		Callable<String> task_2 = () -> "This is task 2";

		try {
			service = Executors.newSingleThreadExecutor();
			List<Callable<String>> list = List.of(task_1, task_2);
			String result = service.invokeAny(list, 1, TimeUnit.MINUTES);
			System.out.println( result );
		} catch(InterruptedException e) {
			throw new InterruptedException("Could not complete thread execution.");
		} catch(ExecutionException e) {
		
		} catch(TimeoutException e) {
		
		} finally {
			if(service != null) service.shutdown();
		}

		if(service != null) service.awaitTermination(2, TimeUnit.SECONDS);

		if(service.isTerminated()) System.out.println("Task completed.");
	}
}
