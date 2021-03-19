package lab9;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Exercise03 {
	public static boolean authenticate(String uName, String password) {
		BiFunction<String, String, Boolean> auth = (a, b) -> {
			return a == null ? false : b == null ? false : true;
		};
		return auth.apply(uName,password);
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter your credentials:");
		System.out.println("Username & Password in separate lines:");
		String valid = authenticate(read.nextLine(),read.nextLine())?"Valid Credentials":"Invalid Credentials";
		System.out.println(valid);
	}
}
