import java.util.*;

public class A {
	public static void addSound(List<? super String> list) {
		String sound = "quack";
		list.add(sound);
	}
	
	public static void main(String[] args) {
		List<String> sounds = new ArrayList<>();
		sounds.add("meow");
		sounds.add("woof");

		addSound(sounds);
		System.out.println(sounds);
	}
}
