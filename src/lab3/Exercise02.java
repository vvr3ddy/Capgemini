package lab3;

import java.util.*;

public class Exercise02 {
	public static String getImage(String str) {
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		sb.reverse();
		str = str + "|"+sb.toString();
		return str;
	}
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println(getImage(read.nextLine()));
	}
}
