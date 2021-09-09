import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class A {
	private AtomicInteger counter = new AtomicInteger(0);
	
	private void incrementAndReport() {
		System.out.println(counter.incrementAndGet() + " ");
	}

	private void _1() {
		ExecutorService service = null;
		try{
			service = Executors.newFixedThreadPool(20);
			A a = new A();
			for(int i = 0; i < 10; i++) {
				service.submit(() -> a.incrementAndReport());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			if(service != null) service.shutdown();
		}
	}

	public static void main(String[] args) {
		A a = new A();
		a._1();
	}
}
