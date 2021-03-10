package day5;

import java.io.*;

public class IOStreamDemo4 {
	public static void main(String[] args) throws IOException {
		File file;
		try {
			file = new File("abc.txt");
			FileReader fr = new FileReader(file);
			if (!file.exists()) {
				throw new FileNotFoundException("File Not found at source");
			} else {
				while (fr.read() != -1) {
					System.out.println((char) fr.read());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
