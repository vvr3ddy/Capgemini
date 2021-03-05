package Main01;

import java.util.*;

public class Source {

	static int findKMaxElement(int n, int k, int[] arr) {

		PriorityQueue<Integer> queue = new PriorityQueue<>();

		ArrayList<Integer> res = new ArrayList<>();
		int i = 0;

		for (; i < k; i++)
			queue.add(arr[i]);

		res.add(queue.peek());

		queue.remove(arr[0]);

		for (; i < n; i++) {

			queue.add(arr[i]);

			res.add(queue.peek());

			queue.remove(arr[i - k + 1]);
		}
		Collections.sort(res, Collections.reverseOrder());

		return res.get(0);

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 2 };
		int k = 1, n = arr.length;

		int res = findKMaxElement(n, k, arr);
		System.out.println(res);
	}
}
