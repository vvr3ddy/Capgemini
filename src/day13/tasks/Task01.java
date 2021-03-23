package day13.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task01 {
	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(4, 7, -2, 8, -3, -11, 20, -14);
		List<Integer> posEven = myList.stream().filter(e -> (e % 2 == 0 && e > 0)).collect(Collectors.toList());
		posEven.forEach(System.out::println);

	}
}
