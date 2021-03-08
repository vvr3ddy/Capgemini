package lab3;

import java.util.*;

public class Exercise01 {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n, sum = 0;
		String s = read.nextLine();
		StringTokenizer str = new StringTokenizer(s," ");
		while(str.hasMoreTokens()) {
			n = Integer.valueOf(new String(str.nextToken()));
			sum +=n;
			System.out.println(n+":"+sum);
		}
	}
}
