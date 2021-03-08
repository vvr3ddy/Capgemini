package lab1;

import java.util.*;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Traffic Light System");
		System.out.println("1. Red 2. Yellow 3. Green");
		System.out.println("Enter your choice :");
		switch (read.nextInt()) {
		case 1:
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("Ready");
			break;
		case 3:
			System.out.println("Go");
			break;
		default:
			System.out.println("Invalid option");
			break;
		}
	}
}
