import java.util.concurrent.*;

public class A {
	private void demonstrateBlocking() throws Exception, InterruptedException {
		try {
			var blockingQueue = new LinkedBlockingQueue<Integer>();
			blockingQueue.offer(39);
			blockingQueue.offer(45, 3, TimeUnit.SECONDS);
			for(int i = 0; i < 1; i++) {
				System.out.println(blockingQueue.poll());
				System.out.println(
					blockingQueue.poll(
						10, 
						TimeUnit.MILLISECONDS));
			}
			throw new InterruptedException("This process was interrupted.");
		} catch(InterruptedException e) {
			System.out.println(e.getMessage());
			throw new Exception(e.getMessage());
		}
	
	}
	
	public static void main(String[] args) throws InterruptedException {
		A handler = new A();
		
		try {
			handler.demonstrateBlocking();
		} catch(Exception e) {
			System.out.println("Exception found: " + e.getMessage());
		}
	}
}
