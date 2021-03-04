package day2;

import java.util.Scanner;

public class TypeCastingDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double d = 1234.56;
		float f = 123.45f;
		int a = (int) d;
		int b = 100;
		double d1 = b;
		int a1 = 130;
		byte b1 = (byte) a1; 
		System.out.println(d + "\n" + f + "\n" + a + "\n" + b + "\n" + d1 + "\n" + b1);
	}
}