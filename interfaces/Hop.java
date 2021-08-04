interface Hop {
	static int getJumpHeight() {
		return 6;
	}

	private int calculateJumpHeight() {
		return getJumpHeight();
	}

	default void printJumpHeight() {
		System.out.println(calculateJumpHeight());
	}


}
