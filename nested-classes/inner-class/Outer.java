public class Outer {
	private String greeting = "Hi";
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.peerCaller();

		// diff way to inst. Inner
		Inner inner = outer.new Inner();
		inner.go();
	}

	protected class Inner {
		public int repeat = 3;

		public void go() {
			for(int i=0;i<repeat;i++) System.out.println(greeting);
		}
	}

	private void peerCaller() {
		callInner();
	}

	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}

}
