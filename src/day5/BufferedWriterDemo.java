package day5;

import java.io.*;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter("Abc.txt"));

		// or

		FileWriter fw = new FileWriter("File.txt");
		BufferedWriter bw1 = new BufferedWriter(fw);
		
		
		bw1.write("HELLO");
		bw1.newLine();
		bw1.write("WORLD");
		
		bw1.flush();
		
		bw1.close();
	}
}
