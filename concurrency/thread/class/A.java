public class A extends Thread {
	private void _1() {
		System.out.println("Start");
		new A().start();
	}

	@Override
	public void run() {
		System.out.println("Running");
	}

	public static void main(String[] args) {
		A a = new A();
		a._1();
		System.out.println("Stop");
	}
}
