package day6.Collections;
import java.util.*;

public class ArrayListWithGeneric {
	public static void main(String[] args) {
		ArrayList<Integer> myArr = new ArrayList<Integer>();
		myArr.add(1);
		myArr.add(1000);
		//myArr.add(10.0f); // results in compile time error because of different type
	}
}
