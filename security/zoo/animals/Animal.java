import java.util.*;

public final class Animal implements Cloneable {
	public static void main(String[] args) throws Exception {
		ArrayList<String> food = new ArrayList<>();
		food.add("grass");
		Animal sheep = new Animal(food);
		Animal cloneOfSheep = (Animal) sheep.clone();
		System.out.println(sheep == cloneOfSheep);
		System.out.println(sheep.favFoods == cloneOfSheep.favFoods);
	}

	private final ArrayList<String> favFoods;

	public Animal(ArrayList<String> favFoods) {
		if(favFoods == null) {
			throw new RuntimeException("favFoods is required.");
		}
		this.favFoods = favFoods;
		//this.favFoods = new ArrayList<String>(favFoods);
	}

	public int getFavFoodsCount() {
		return favFoods.size();
	}

	public String getFavFoodsElement(int index) {
		return favFoods.get(index);
	}

	public Animal clone() {
		ArrayList<String> listClone = (ArrayList) favFoods.clone();
		return new Animal(listClone);
	}
}
