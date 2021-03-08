package lab2;

import java.util.*;

public class Exercise04 {
	public static int[] modifyArray(int[] arr) {
		Integer[] ar = new Integer[arr.length];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = arr[i];
		}
		Set<Integer> dist = new HashSet<>();
		Collections.addAll(dist, ar);
		int[] res = new int[dist.size()];
		int j = 0;
		for (int i : dist) {
			System.out.println(i);
			res[j++] = i;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[] arr = new int[read.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = read.nextInt();
		}
		int res[] = modifyArray(arr);
		for (int i : res) {
			System.out.println(i);
		}
	}
}
