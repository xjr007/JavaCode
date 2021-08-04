public class A {
	public static void main(String[] args) {
		testVar(true);
	}

	private static void testVar(boolean flag) {
		// This does compile for var
		var testThis = "Test Passed.";
		var testAgain = 1;

		if(flag) {
			testAgain = 2;	
		} else {
			testAgain = 3;
		}

		System.out.println(testThis + "\n" + testAgain + "\n" + flag);
	}
}
