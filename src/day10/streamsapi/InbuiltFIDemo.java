package day10.streamsapi;

import java.util.function.Function;
import java.util.function.Predicate;

public class InbuiltFIDemo {

	public static void main(String[] args) {
		Predicate<Integer> p1 = (age) -> age > 18;
		System.out.println(p1.test(34));

		Function<String, String> f1 = (name) -> "Hello " + name; // Since We are doing unary operation, we can use UnaryOperator FI
		System.out.println(f1.apply("VVR"));

		Function<String, Integer> f2 = (name) -> name.length(); // We can use ToIntFunction instead to have better code
		System.out.println(f2.apply("Sample Test String"));

		Predicate<String> p2 = (name) -> name.startsWith("A");
		System.out.println("Does name start with A:" + p2.test("Ambrose"));

		Function<String, Boolean> f3 = (name) -> name.startsWith("A");  // Since it returns a boolean, using Predicate is better
		System.out.println(f3.apply("Amanda"));
	}

}
