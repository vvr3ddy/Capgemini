package day7.collections;

import java.util.*;

public class ArrayListSort {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num = 0;
		System.out.println("Enter 10 integers:");
		ArrayList<Integer> e = new ArrayList<Integer>();
		ArrayList<Integer> o = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			num = read.nextInt();
			if (num % 2 == 0)
				e.add(num);
			else
				o.add(num);
		}

		System.out.println("Even Array:" + e);
		System.out.println("Odd Array:" + o);
	}

}
