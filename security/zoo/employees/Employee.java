import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Employee implements Serializable {
	private String name;
	private String ssn;
	private int age;

	private Employee() {}

	private static Map<String, Employee> pool = new ConcurrentHashMap<>();

	public Employee(String name, String ssn, int age) {
		this.name = new String(name);
		this.ssn = new String(ssn);
		this.age = Integer.valueOf(age);
	}

	private static final ObjectStreamField[] serialPersistentFields = {
		new ObjectStreamField("name", String.class),
		new ObjectStreamField("ssn", String.class)
	};

	private static String encrypt(String input) {
		return new String(input);
	}

	private static String decrypt(String input) {
		return new String(input);
	}

	private void writeObject(ObjectOutputStream s) throws Exception {
		ObjectOutputStream.PutField fields = s.putFields();
		fields.put("name", name);
		fields.put("ssn", encrypt(ssn));
		s.writeFields();
	}

	private void readObject(ObjectInputStream s) throws Exception {
		ObjectInputStream.GetField fields = s.readFields();
		this.name = (String) fields.get("name", null);
		this.ssn = decrypt((String) fields.get("ssn", null));
	}

	public synchronized Object readResolve() throws ObjectStreamException {
		var existingEmployee = pool.get(name);

		if(pool.get(name) == null) {
			pool.put(name, this);
			return this;
		} else {
			existingEmployee.name = this.name;
			existingEmployee.ssn = this.ssn;
			return existingEmployee;
		}
	}

	public Object writeReplace() throws ObjectStreamException {
		var e = pool.get(name);
		return e != null ? e : this;
	}

	public static void main(String[] args) throws Exception {
		Employee employee = new Employee("John", "123456", 5);
		File file = new File("../../../io/data/zoo.txt");

		try(var objIn = new ObjectInputStream(
			new FileInputStream(file));
			var objOut = new ObjectOutputStream(
			new FileOutputStream(file))) {
			employee.readObject(objIn);
			employee.writeObject(objOut);
		}

	
	}
}
