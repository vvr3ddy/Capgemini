package day10.Tasks.wrestlers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WWEWrestlerImplementation {
	public static void main(String[] args) {
		List<WWE> wrestlers = addWrestlers();
		System.out.println("Total Wrestlers:" + countWrestlers(wrestlers));
		System.out.println(
				"\nSum of weight of all wrestlers whose weight is above 200: " + sumWrestlersWeight(wrestlers, 200));
		System.out.println("\nNames of Wrestlers:");
		List<String> names = printFirstName(wrestlers);
		names.forEach(System.out::println);
	}

	public static long countWrestlers(List<WWE> wrestlers) {
		return wrestlers.stream().count();
	}

	public static long sumWrestlersWeight(List<WWE> wrestlers, int weight) {
		return wrestlers.stream().filter(e -> e.getWeight() > weight).mapToInt(WWE::getWeight).sum();
	}

	public static List<String> printFirstName(List<WWE> wrestlers) {
		return wrestlers.stream().map(WWE::getFirstName).collect(Collectors.toList());
	}

	public static List<WWE> addWrestlers() {
		List<WWE> wrestlers = new ArrayList<>();
		wrestlers.add(new WWE("Andre", " The Giant", 520));
		wrestlers.add(new WWE("Giant", "Silva", 385));
		wrestlers.add(new WWE("The", "Yeti", 366));
		wrestlers.add(new WWE("Mustafa", "Ali", 182));
		wrestlers.add(new WWE("Rey", "Mysterio", 175));
		wrestlers.add(new WWE("Xavier", "Woods", 205));
		return wrestlers;
	}
}
