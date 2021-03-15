package Main01;

import java.util.*;

public class Source {
	public static int[] solution(int[] data, int n) {
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		for (int i : data) {
			if (!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
		}
		List<Integer> arr = new ArrayList<>();
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() > n) {

			} else {
				arr.add(e.getKey());
			}
		}
		int[] res = new int[arr.size()];
		for(int i=0;i<arr.size();i++) {
			res[i] = arr.get(i);
			
		}
		return res;
	}

	public static void main(String[] args) {

	}
}
