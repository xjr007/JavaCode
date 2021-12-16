import java.util.concurrent.*;
import java.util.*;

public class A {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// service
		ScheduledExecutorService service = null;
		
		// tasks
		Callable<Integer> callable_task = () -> 45 * 3;

		Runnable runnable_task = () -> System.out.println("I am on my way to the zoo.");

		try {
		 	service = Executors.newSingleThreadScheduledExecutor();
			
			// Scheduling tasks
			ScheduledFuture<Integer> callable_out = 
				service.schedule(callable_task, 2L, TimeUnit.SECONDS);
			service.schedule(runnable_task, 2L, TimeUnit.SECONDS);

			System.out.println(callable_out.get());

		} catch(ExecutionException e) {
			System.out.println(e.getMessage());
		
		} catch(InterruptedException e) {
			System.out.println(e.getMessage());
		} finally {
			if(service != null) service.shutdown();
		}

		if(service != null) service.awaitTermination(30, TimeUnit.SECONDS);

		if(service.isTerminated()) System.out.println("Scheduled event has ended.");
	}
}
