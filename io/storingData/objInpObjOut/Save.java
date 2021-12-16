import java.io.*;
import java.util.*;

public class Save {
	void saveToFile(List<Gorilla> gorillas, File dataFile) throws IOException {
		try(var out = new ObjectOutputStream(
			new BufferedOutputStream(
				new FileOutputStream(dataFile)))) {
			
			for(Gorilla gorilla: gorillas)
			       out.writeObject(gorilla);
			
			out.flush();

		} catch(FileNotFoundException e) {
			throw new FileNotFoundException("File does not exist.");
		
		} catch(IOException e) {
			throw new IOException("Could not write to file.");
		}
	}

	List<Gorilla> readFromFile(File dataFile) throws IOException, ClassNotFoundException {
		var gorillas = new ArrayList<Gorilla>();

		try(var in = new ObjectInputStream(
			new BufferedInputStream(
				new FileInputStream(dataFile)))) {
			
			while(true) {
				var obj = in.readObject();
				if(obj instanceof Gorilla) {
					gorillas.add( (Gorilla) obj );
				}
			}

		} catch(EOFException e) {
			System.out.println("End of file reached.");
		}

		return gorillas;
	}
	
	public static void main(String[] args) {
		// List of Gorillas
		List<Gorilla> gorillas = new ArrayList<>();
		gorillas.add(new Gorilla("Adult", 7, "Banana"));
		gorillas.add(new Gorilla("Teenager", 2, "Apple"));

		try {
			// Writing to file
			Save save = new Save();
			File gorilla_file = new File("../../data/gorillas.txt");
			save.saveToFile(gorillas, gorilla_file);

			// Reading from file
			for(Gorilla gorilla: save.readFromFile(gorilla_file)) 
				System.out.println(gorilla);

		} catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("Application error.");
			e.printStackTrace();
		}
	}
}

class Gorilla implements Serializable {
		private String size;
		private int age;
		private transient String favFood;

		Gorilla(String size, int age, String favFood) {
			this.size = new String(size);
			this.age = Integer.valueOf(age);
			this.favFood = new String(favFood);
		}

		public String toString() {
			return "Gorilla size is a/an " + size + " and is " + age + 
				" years old. It's favourite food is a " + favFood + "\n";
		}
}
