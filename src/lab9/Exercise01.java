package lab9;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		//System.out.println("Enter two integers:");
		BiFunction<Integer, Integer, Double> biF = (a, b) -> Math.pow(a, b);
		//System.out.println(biF.apply(read.nextInt(), read.nextInt()));
		
		BiFunction<Integer, Integer, Double> power = (x, y) -> Math.pow(x, y);
		System.out.println(power.apply(2, 4));
	}
}
