public abstract class A {
	
	abstract void chew();

}

class B extends A {
	final void chew() {
		System.out.println("Chew");
	}
}

class C extends B {
	public static void main(String[] args) {
	
	}

	void chew() {
		System.out.println("Chewing");
	}
}
