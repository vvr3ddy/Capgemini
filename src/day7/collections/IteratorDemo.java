package day7.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<String> myArr = new ArrayList<String>(Arrays.asList("A", "B", "Aa", "Bb", "cC", "Dd", "Cc"));

		Iterator<String> itr = myArr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		

	}

}
