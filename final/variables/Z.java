public class Z {
	// final static & final instance variables
	
	// static
	final static String name;
	final static String sname = "Smith";

	static {
		name = "John";
	}

	// instance (but assigned in init block)
	final String myName;
	final String mySname = "Frey";
	{
		myName = "Walter";
	}
	
	// instance (initialized in constructor)
	final String address;
	final int postNum = 5600;
	
	Z() {
		this.address = "69, Ralgan Avenue, Goodhood";
	}

	public static void main(String[] args) {
		Z state = new Z();
		System.out.println("Name: " + state.myName + "\nSurname: " + state.mySname + "\nAddress: " + state.address + "\nPostal Code: " + state.postNum);
	}
}
