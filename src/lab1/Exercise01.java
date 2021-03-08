package lab1;

import java.util.*;

public class Exercise01 {
	public static int sumOfCubesOfDigits(int n) {
		int res = 0;
		int dig = 0;
		while (n > 0) {
			dig = n % 10;
			res += Math.pow(dig, 3);
			n /= 10;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println(sumOfCubesOfDigits(read.nextInt()));
	}
}
