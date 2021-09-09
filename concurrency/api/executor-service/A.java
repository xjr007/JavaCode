import java.util.concurrent.*;

public class A {
	private void _1() {
		ExecutorService service = null;
		Runnable task1 = () -> System.out.println("Printing zoo inventory");
		Runnable task2 = () -> {
			for(int i = 0; i < 3; i++) 
				System.out.println("Printing record: " + i);
		};

		try{
			service = Executors.newSingleThreadExecutor();
			System.out.println("begin");
			System.out.println(service.submit(task1));
			System.out.println(service.submit(task2));
			System.out.println(service.submit(task1));
			System.out.println("end");
		} finally {
			if(service != null) service.shutdown();
		}
	}

	public static void main(String[] args) {
		A a = new A();
		a._1();
	}
}
