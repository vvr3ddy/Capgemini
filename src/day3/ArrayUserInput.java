package day3;

import java.util.*;

public class ArrayUserInput {
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int children = 0;
		int adults = 0;
		int seniors = 0;

		System.out.println("Enter the size of array:");
		int[] ages = new int[read.nextInt()];
		for (int i = 0; i < ages.length; i++) {
			System.out.println("Enter the age of " + (i + 1) + ":");
			ages[i] = read.nextInt();
		}

		for (int i : ages) {
			if (i < 18) {
				children++;
			} else if (i >= 18 && i < 55) {
				adults++;
			} else {
				seniors++;
			}

		}
		System.out.println();
		System.out.println("No of Children:" + children);
		System.out.println("No of Adults:" + adults);
		System.out.println("No of Seniors:" + seniors);

	}
}
