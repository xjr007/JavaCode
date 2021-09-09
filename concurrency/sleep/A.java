public class A {
	private static int counter;

	public static void main(String[] args) throws InterruptedException {
		new Thread() {
			public void run() {
				counter++;
			}
		};

		while(counter < 10) {
			System.out.println("less");
			Thread.sleep(2000);
		}
		System.out.println("more");
	}
}
