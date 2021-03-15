/*
 * Lambda example
 */

package day9.java8newFeatures;

@FunctionalInterface
interface Calculator {
	int doOperation(int a, int b); // single abstract method

}

public class LambdasDemo {
	public static void main(String[] args) {
		Calculator add = (a, b) -> a + b;
		Calculator sub = (a, b) -> a - b;
		Calculator mul = (a, b) -> a * b;
		Calculator div = (a, b) -> {
			int c;
			try {

				c = a / b;
			} catch (ArithmeticException ae) {
				return -1;
			}
			return c;
		};
		System.out.println("Adding two nums:" + add.doOperation(10, 20));
		System.out.println("Multiplying two nums:" + mul.doOperation(5, 6));
		System.out.println("Subtracting two nums:" + sub.doOperation(10, 20));
		System.out.println("Dividing two nums:" + div.doOperation(10, 0));
	}
}
