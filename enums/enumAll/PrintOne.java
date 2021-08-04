enum One {
	ONCE(true);
	
	private One(boolean b) {
		System.out.print(" Constructing ");
	}
}

public class PrintOne {
	public static void main(String... args) {
		System.out.print("begin...");

		One _1stCall = One.ONCE;
		One _2ndCall = One.ONCE;

		System.out.println("...end");
	}
}
