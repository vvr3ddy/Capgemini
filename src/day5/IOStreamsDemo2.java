package day5;

import java.io.File;

public class IOStreamsDemo2 {
	public static void main(String[] args) {
		File f = new File("movies");
		if (!f.exists()) {
			System.out.println("Creating a new Folder");
			if (f.mkdir())
				System.out.println("Created a new Folder Successfully.");
			else
				System.out.println("Error creating new Folder");
		}
		else {
			if(f.delete()) System.out.println("Deleted folder");
		}
	}
}
