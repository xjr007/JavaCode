public class B {
	public static void main(String[] args) {
		B b = new B();
		b.doesThisCompile(true);
	}

	public void doesThisCompile(boolean check) {
		// This does not compile
		var question;
		question = 1;
		var answer;

		if(check) {
			answer = 2;
		} else {
			answer = 3;
		}
		System.out.println(answer);
	}
}
