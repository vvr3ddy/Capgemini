package day5;

import java.io.*;

public class BufferedReaderDemo {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("File.txt"));
		String r = br.readLine();
		while (r != null) {
			System.out.println(r);
			r = br.readLine();
		}

	}
}
