import java.util.*;

public class NeverDoThis {
	@SafeVarargs final int thisIsUnsafe(List<Integer>... carrot) {
		Object[] stick = carrot;
		stick[0] = Arrays.asList("nope!");
		
		return carrot[0].get(0);
	}

	public static void main(String[] args) {
		var carrot = new ArrayList<Integer>();
		new NeverDoThis().thisIsUnsafe(carrot);
	}
}
