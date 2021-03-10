package day5;

import java.io.*;

public class IOStreamDemo3 {
	public static void main(String[] args) throws IOException {
		File file = new File("abc.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(file, true);
			fw.write("HELLO");
			fw.write('\n');
			fw.flush(); // important to use else data wont be copied to the destination
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			fw.close();
		}
		file.deleteOnExit();

	}
}
