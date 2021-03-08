package lab1;

import java.util.*;

public class Exercise04 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		boolean flag = false;
		if (n > 2) {
			for (int i = 2; i <= n; i++) {
				flag = false;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						flag = true;
						break;
					}
				}
				if (flag == false) {
					System.out.println(i);
				}

			}
		}
	}
}
