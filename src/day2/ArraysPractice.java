package day2;

import java.util.Arrays;

public class ArraysPractice {
	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 9, 4 };
		int tS = 0, oS = 0, eS = 0;
		for (int i = 0; i < a.length; i++) {
			tS += a[i];
			if (a[i] % 2 == 0) {
				eS += a[i];
			} else {
				oS += a[i];
			}
		}
		System.out.println("Total Sum:" + tS);
		System.out.println("Even Sum:" + eS);
		System.out.println("Odd Sum:" + oS);
		Arrays.sort(a);
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					a[j] = a[j] + a[j + 1];
					a[j] = a[j] - a[j + 1];
					a[j + 1] = a[j] - a[j + 1];
				}
			}
		}
		for (int i : a)
			System.out.println(i);
	}
}
