package day6.Collections;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList myArrList = new ArrayList();
		System.out.println("initial ArrayList: "+myArrList);
		myArrList.add(1); //auto boxed to Integer
		myArrList.add("Hello"); // String
		myArrList.add('A');
		myArrList.add(null);
		myArrList.add(3,"John Doe"); // adds element to  given index remaining elements get shifted one idx more
		
		System.out.println("After adding some elements:"+myArrList);
		myArrList.remove(1); // removes the content at idx 1
		myArrList.remove(String.valueOf("Hello")); //removes the value Hello
		System.out.println("After deleting some elements"+myArrList);
		System.out.println("List contains null ?:"+myArrList.contains(null));
		myArrList.set(3, "Some Value"); //replaces the value at idx 3 to specified value
		System.out.println("Array List:"+myArrList);
		System.out.println("clearing the list");
		myArrList.clear();
	}
}
