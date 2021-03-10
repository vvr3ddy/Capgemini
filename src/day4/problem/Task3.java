package day4.problem;

import java.util.*;

public class Task3 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a, b;
		int res = 0;
		try {
			a = read.nextInt();
			b = read.nextInt();
			res = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero error");
		} catch (InputMismatchException ime) {
			System.out.println("Enter only an integer");
		}
		System.out.println("Result:" + res);
	}
}
