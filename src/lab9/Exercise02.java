package lab9;

import java.util.Scanner;
import java.util.function.Function;

public class Exercise02 {
	public static String addSpaces(String str) {
//		Function<String, String> stringFormatter = (string) -> string.replace("", " ");
//		return stringFormatter.apply(str).trim();
		
		
		Function<String, String> addSpace = (x) -> x.replace(""," ");
		return addSpace.apply(str).trim();
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String string = read.nextLine();
		System.out.println(addSpaces(string)); // trim is important to avoid space before and after
												// first and last character
	}
}
