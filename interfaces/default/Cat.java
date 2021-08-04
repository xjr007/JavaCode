public class Cat implements Walk, Run {
	public static void main(String[] args) {
		System.out.println(new Cat().getWalkSpeed());
	}

	public int getSpeed() {
		return 1;
	}

	public int getWalkSpeed() {
		return Walk.super.getSpeed();
	}
}
