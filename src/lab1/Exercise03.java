package lab1;

import java.util.*;

public class Exercise03 {
	public static int nonrecFiboSeries(int n) {
		int t0 = 1;
		int t1 = 1;
		int sum = 0;
		if(n == 1||n==0) {
			return n;
		}
		for (int i = 2; i < n; i++) {
			sum = t0 + t1;
			t0 = t1;
			t1 = sum;
		}
		return sum;
	}

	public static int recFiboSeries(int n) {
		if (n <= 1)
			return n;
		return recFiboSeries(n - 1) + recFiboSeries(n - 2);
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println(nonrecFiboSeries(read.nextInt()));
		System.out.println(recFiboSeries(read.nextInt()));
	}
}
