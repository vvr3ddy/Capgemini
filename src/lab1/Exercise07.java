package lab1;

import java.util.*;

public class Exercise07 {
	public static boolean checkNumber(int number) {
		boolean flag = false;
		int curDig = 0, prevDig = 0;
		while (number > 0) {
			curDig = number % 10;
			flag = curDig <= prevDig ? true : false;
			prevDig = curDig;
			number /= 10;
		}
		return flag;

	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println(checkNumber(read.nextInt()));
	}
}
