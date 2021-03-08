package lab1;

import java.util.*;

public class Exercise08 {
	public static boolean checkNumber(int number) {
		int res = number & (number - 1);
		return res==0 ? true : false;
	}
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println(checkNumber(read.nextInt()));
	}
}
