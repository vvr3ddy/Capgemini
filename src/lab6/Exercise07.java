/*
 * Exercise 07 of lab 6
 * Create a method which accepts an integer array, reverse the numbers in the array
 * and returns the resulting array in sorted order
 */
package lab6;

import java.util.*;

public class Exercise07 {

	public static List<Integer> getSorted(int[] arr) {
		List<Integer> sorted = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (int i : arr) {
			sb.setLength(0);
			sb.append(String.valueOf(i));
			sb.reverse();
			sorted.add(Integer.parseInt(sb.toString()));
		}
		Collections.sort(sorted);
		return sorted;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the size of arr:");
		int size = read.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter a number (atleast 2 dig or more):");
			arr[i] = read.nextInt();
		}
		System.out.println("\nOriginal Array:");
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		List<Integer> sorted = getSorted(arr);
		System.out.println("Resulting array:");

		for (int i : sorted) {
			System.out.print(i + "\t");
		}

	}
}
