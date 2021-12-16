import java.util.concurrent.*;

public class A {
	static void taskTerminator() throws InterruptedException, Exception {
		ExecutorService service = null;
		Callable<String> task = null;
		
		try {
			task = () -> {
			var name = "Jamie";
			var age = 15;
			var sport = "Rugby";

			return name.concat(" is ").concat(String.valueOf(age)).concat(" and plays ").concat(sport);
			};
		} catch(Exception e) {
			System.out.println("Invalid task.");
		}

		try {
			service = Executors.newSingleThreadExecutor();
			var res = service.submit(task);
			System.out.println(res.get());
		} catch(Exception e) {
			throw new Exception("Task could not be completed.");
		} finally {
			if(service != null) service.shutdown();
		}

		if(service != null) service.awaitTermination(1, TimeUnit.MINUTES);
		if(service.isTerminated()) System.out.println("All tasks completed.");
		else System.out.println("At least 1 task is still running.");
	}

	public static void main(String[] args) throws Exception {
		taskTerminator();
	}
}
