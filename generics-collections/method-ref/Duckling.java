public class Duckling {
	public static void makeSound(String sound) {
		LearnToSpeak learner = System.out::println;
		DuckHelper.teacher(sound, learner);
	}
}
