package day6.io;

import java.io.*;

class Empl implements Serializable{ //need to implement this interface to make the class serializable
	int id;
	static String name; //static data will not be serialized
	transient int age; // if we done want to serialize any non static member, we declare it transient
	public Empl(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
public class SerializationDemo {
	public static void main(String[] args) throws IOException {
		Empl e = new Empl(1,"John Doe", 18);
		FileOutputStream fout = new FileOutputStream("Serdemo.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(e);
		oos.flush();	
		oos.close();
		
	}
}
