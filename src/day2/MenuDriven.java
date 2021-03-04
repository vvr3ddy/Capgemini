package day2;

import java.util.Scanner;

public class MenuDriven {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("press \n 1. withdraw \n 2. deposit \n 3. balance");
		int ch = read.nextInt();
		int bal = 1000;
		while (ch == 1 || ch == 2 || ch == 3) {
			if (ch == 1) {
				System.out.println("you are withdrawing.");
				System.out.println("Enter amount to withdraw:");
				bal -= read.nextInt();
			} else if (ch == 2) {
				System.out.println("you are depositing.");
				System.out.println("Enter amount to deposit:");
				bal += read.nextInt();
			} else if (ch == 3) {
				System.out.println("Balance = " + bal);
			}
			System.out.println("Enter the choice:");
			ch = read.nextInt();
		}
	}
}
