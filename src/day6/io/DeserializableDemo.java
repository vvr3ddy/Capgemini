package day6.io;

import java.io.*;

public class DeserializableDemo implements Serializable {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("Serdemo.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Empl e = (Empl) ois.readObject();
		System.out.println(e.id);
		System.out.println(e.name); // static data is not serialized hence null
		System.out.println(e.age); //transient so it'll display 0
		
	}
}
