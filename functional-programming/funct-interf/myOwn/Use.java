public class Use {

	public static void main(String... args) {
		Use use = new Use();
		TakeThree<String, Integer, Character, String> take3 = (s, i, c) -> {
			s = s.concat(String.valueOf(i));
			s = s.concat(String.valueOf(c));
			return s;
		};

		

		System.out.println(take3.apply("hello", 1, 'W'));
	}
}
