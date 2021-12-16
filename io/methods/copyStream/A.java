import java.io.*;

public class A {
	private static final String path = "../../data/";
	void copyStream(InputStream in, OutputStream out) throws IOException {
		int b;
		//System.out.println("Copying..");
		while((b = in.read()) != -1) {
			System.out.println("Copying..");
			out.write(b);
		}

		A a = new A();

		System.out.println(b > 0);
		//System.out.println("Copying..");
	}	
	
	void copyStream(Reader in, Writer out) throws IOException {
		int b;
		while((b = in.read()) != -1) {
			out.write(b);
		}
		System.out.println("Copying..");
	}

	BufferedInputStream readData(File file) throws IOException {
		BufferedInputStream stream = null;
		try(var br = new BufferedInputStream(
		new FileInputStream(file))) {
			stream = br;
		
		} catch(IOException e) {
			e.getMessage();
		}

		System.out.println("Read data..");

		return stream;
		
	}

	BufferedOutputStream writeData(File file) throws IOException {
		BufferedOutputStream stream = null;
		try(var bw = new BufferedOutputStream(
		new FileOutputStream(file))) {
			stream = bw;
		} catch(IOException e) {
			e.getMessage();
		}

		System.out.println("Wrote data..");
		return stream;
	}

	void printData(InputStream is) throws IOException {
		int b;
		while ((b = is.read()) != -1) {
			System.out.print(b);
		}
	}

	public static void main(String[] args) {
		File sample = new File(path, "sample.txt");
		File zoo = new File(path, "zoo.txt");

		A handler = new A();

		if(sample.exists() && zoo.exists()) {
			try {
				var zoo_data = handler.readData(zoo);
				var sample_data = handler.writeData(sample);
				handler.copyStream(zoo_data, sample_data);
				byte[] array = new byte[256];
				zoo_data.read(array);
				String data = new String(array);
				System.out.println("Bytes in file: " + zoo_data.available());
				System.out.println(data);
				
			} catch(IOException e) {
				e.getMessage();
			}
		} else {
			System.out.println("Something went wrong...");
		}
	}
}
