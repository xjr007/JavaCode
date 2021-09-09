import java.util.concurrent.*;
import java.util.*;

public class Z {
	private void _1() throws Exception, InterruptedException {
		ExecutorService service = null;
		Callable<String> task = () -> "result";
		try{
			System.out.println("begin");
			String data = service.invokeAny(List.of(task, task, task));
			System.out.println(data);
			System.out.println("end");
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(service != null) service.shutdown();
		}
	}

	public static void main(String[] args) throws Exception {
		Z z = new Z();
		z._1();
	}
}
