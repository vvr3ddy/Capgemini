package day14.Tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task02 {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		strings.add("This");
		strings.add("is");
		strings.add("a");
		strings.add("random");
		strings.add("apples");
		strings.add("bananas");
		
		System.out.println("Count of strings with length>5:"+strings.stream().filter(e->e.length()>5).count());
		System.out.println("Original String\n"+strings);
		System.out.println("Ascending order");
		List<String> ascStrings = strings.stream().sorted().collect(Collectors.toList());
		System.out.println(ascStrings);
		System.out.println("Descending order");
		List<String> descStrings = strings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(descStrings);
		List<String> withA = strings.stream().filter(e->e.startsWith("a")).collect(Collectors.toList());
		System.out.println("Strings starting with A");
		System.out.println(withA);
		
		
		
		
	}
}
