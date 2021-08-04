@B(listOfNames={"Chad", "James"})
public class A extends ZooPlanner {
	public static void main(String... args) {
		System.out.println("Inheriting a deprecated class.");
	}

	public void plan() {
		System.out.println("Inheriting deprecated method.");
	}
}
