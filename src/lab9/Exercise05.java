package lab9;

import java.util.function.Function;

class Calculator {
	int factorial(int n) {
		if(n==1||n==0)return 1;
		else return n*factorial(n-1);
	}
}
public class Exercise05 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Function<Integer, Integer> fi = (a) -> cal.factorial(a);
		System.out.println(fi.apply(5));
	}
}
