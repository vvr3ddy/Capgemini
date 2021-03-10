package day5;

import java.io.*;

public class IOStreamsDemo {
	public static void main(String[] args) throws IOException {
		
		// create a new file if it doesn't exist already
		File f = new File("abc.txt");
		if (f.exists()) {
			System.out.println("File Present");
		} else {
			if (f.createNewFile()) {
				System.out.println("File Created at:");
				System.out.println(f.getAbsoluteFile());
			}else {
				System.out.println("Error creating file");
			}
		}
		
	}
}
