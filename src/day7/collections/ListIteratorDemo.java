package day7.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> myArr = new ArrayList<String>(Arrays.asList("A", "B", "Aa", "Bb", "cC", "Dd", "Cc"));
		ListIterator<String> itr = myArr.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
