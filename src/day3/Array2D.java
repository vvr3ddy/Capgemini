package day3;

import java.util.*;

public class Array2D {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		// Display the size of row and size of col in Java
		// 1. for even sized cols
		int[][] arr = new int[4][5];
		System.out.println("Rows in array:" + arr.length);
		System.out.println("Cols in array:" + arr[0].length);
		System.out.println();

		// 2. Jagged array
		int[][] arr1 = { { 1, 1, 1 }, { 1, 1 }, { 1, 1, 1, 1 } };
		System.out.println("Rows in arr1:" + arr1.length);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Cols in row " + (i + 1) + ":" + arr1[i].length);
		}

		// 3. Another way to create jagged arrays
		System.out.println();
		int[][] arr2 = new int[3][];
		arr2[0] = new int[3];
		arr2[1] = new int[5];
		arr2[2] = new int[9];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
}
