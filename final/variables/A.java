public class A {
	public static void main(String... args) {
		A state = new A();
		state.localVariables();
	}

	void localVariables() {
		// using unassigned final local variable -> compilor error
		
		final int notInit; // must be assigned later
		final int init = 5; // fulfilled final variable
		boolean flag = false;
		String stmnt = "Final local variables must be initialized before being used.";
		/*	init = notInit + init // when method ends, notInit is empty -> compilor error
		 */

		int res = (notInit = 1) + init;
		System.out.println(res);
	}
}
