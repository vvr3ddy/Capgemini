package day7.collections;

import java.util.*;

public class UtilityMethodsDemo {

	public static void main(String[] args) {
		ArrayList<String> myArr = new ArrayList<String>(Arrays.asList("A", "B", "Aa", "Bb", "cC", "Dd", "Cc"));
		System.out.println("myArr:" + myArr);

		Collections.reverse(myArr);
		System.out.println("myArr after reversing:" + myArr);

		Collections.sort(myArr);
		System.out.println("myArr after sorting:" + myArr);

		Collections.sort(myArr, Collections.reverseOrder());
		System.out.println("myArr after reversing order or sort:" + myArr);

		// To use binarySearch we must always have the list sorted Ascending
		System.out.println("Performing Binary Search");
		Collections.sort(myArr);
		System.out.println(Collections.binarySearch(myArr, "C"));

		System.out.println("Min Element:"+Collections.min(myArr));
		System.out.println("Max Element:"+Collections.max(myArr));
		

	}

}
