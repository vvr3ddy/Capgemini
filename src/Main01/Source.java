package Main01;

import java.util.*;

class ArrayListOps {
	public ArrayList<Integer> makeArrayListInt(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(0);
		}
		return list;
	}

	public ArrayList<Integer> reverseList(ArrayList<Integer> list) {
		Collections.reverse(list);
		return list;
	}

	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n) {
		int elem = 0;
		for (int i = 0; i < list.size(); i++) {
			elem = list.get(i);
			if (elem == m) {
				list.set(i, n);
			}
		}
		return list;
	}

}

public class Source {
	public static void main(String[] args) {
	}
}