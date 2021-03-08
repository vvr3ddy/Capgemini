package lab3;

import java.util.*;

public class Exercise04 {
	static int modifyNumber(int number1) {
		String s = String.valueOf(number1);
		StringBuffer sb = new StringBuffer();
		int diff = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i == s.length() - 1) {
				sb.append(s.charAt(i));
			} else {
				diff = Math.abs(Integer.valueOf(s.charAt(i)) - Integer.valueOf(s.charAt(i + 1)));
				sb.append(String.valueOf(diff));
			}

		}
		return Integer.valueOf(new String(sb));
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println(modifyNumber(read.nextInt()));
	}
}
