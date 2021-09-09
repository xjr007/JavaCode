import java.util.concurrent.*;
import java.util.*;

public class A {
	private void _1() throws Exception {
		ExecutorService service = null;

		try{
			service = Executors.newSingleThreadExecutor();
			Callable<String> task = () -> "result";
			System.out.println("begin");
			List<Future<String>> list = service.invokeAll(
					List.of(task, task, task));
			for(Future<String> future: list) {
				System.out.println(future.get());
			}
			System.out.println("end");
		}finally{
			if(service != null) service.shutdown();
		}
	}

	public static void main(String[] args) throws Exception {
		A a = new A();
		a._1();
	}
}
