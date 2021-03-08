package lab1;

import java.util.*;

public class Exercise06 {
	public static int calculateDifference(int n) {
		int diff = 0;
		int tmp = n;
		int sum = 0;
		while (n > 0) {
			diff += Math.pow(n, 2);
			n--;
		}
		while (tmp > 0) {
			sum += tmp;
			tmp--;
		}
		return (int) (diff - Math.pow(sum, 2));
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println(calculateDifference(read.nextInt()));
	}
}
