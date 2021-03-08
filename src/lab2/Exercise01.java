package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise01 {
	public static int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[] arr = new int[read.nextInt()];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = read.nextInt();
		}
		System.out.println(getSecondSmallest(arr));
		
	}
}
