package day10.streamsapi;

import java.util.Arrays;
import java.util.List;

public class ReducerDemo {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int i = myList.stream().reduce((a, b) -> a + b).get();
		System.out.println(i);

		List<String> stringList = Arrays.asList("Hello ", "World ", "This ", "is ", "Sample.");
		System.out.println(stringList.stream().reduce((a, b) -> a.concat(b)).get());
	}
}
