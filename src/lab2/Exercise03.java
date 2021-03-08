package lab2;

import java.util.*;

public class Exercise03 {
	public static int getSorted(int[] arr) {
		StringBuilder res = new StringBuilder();
		for(int i:arr) {
			res.append(i);
		}
		String[] tStr = res.toString().split("");
		
		Arrays.sort(tStr, Collections.reverseOrder());
		res.setLength(0);
		for(String s:tStr) {
			res.append(s);
		}
		return Integer.valueOf(res.toString());
		
		
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[] arr = new int[read.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = read.nextInt();
		}
		System.out.println(getSorted(arr));
	}
}
