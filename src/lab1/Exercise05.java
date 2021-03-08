package lab1;

import java.util.*;

public class Exercise05 {
	public static int calculateSum(int n) {
		int sum = 0;
		while (n > 0) {
			if (n % 3 == 0 || n % 5 == 0) {
				sum += n;
			}
			n--;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println(calculateSum(read.nextInt()));
	}
}
