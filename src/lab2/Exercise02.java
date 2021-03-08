package lab2;

import java.util.*;

public class Exercise02 {
	public static String[] sortStrings(String[] arr) {
		Arrays.sort(arr);
		int size = arr.length;
		if (size % 2 == 0) {
			for (int i = 0; i < size / 2; i++) {
				arr[i] = arr[i].toUpperCase();
			}
			for (int i = size / 2; i < size; i++) {
				arr[i] = arr[i].toLowerCase();
			}
		} else {
			for (int i = 0; i < size / 2 + 1; i++) {
				arr[i] = arr[i].toUpperCase();
			}
			for (int i = size / 2 + 1; i < size; i++) {
				arr[i] = arr[i].toLowerCase();
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		String[] arr = new String[read.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = read.nextLine();
		}
		arr = sortStrings(arr);
		for(String s:arr) {
			System.out.println(s);
		}

	}
}
