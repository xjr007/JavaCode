public class Bunny implements Hop {
	public static void main(String[] args) {
		System.out.println(Hop.getJumpHeight());
		new Bunny().printJumpHeight();
	}
}
