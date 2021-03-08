package day4;

abstract class Calculate {
	int a = 10;

	void display() {
		System.out.println("Normal method");
	}

	abstract int doCalculate(int a, int b);

}

class Add extends Calculate {

	@Override
	int doCalculate(int a, int b) {

		return a + b;
	}

	void display() {
		System.out.println("Addition Method");
	}
}

class Sub extends Calculate {

	@Override
	int doCalculate(int a, int b) {
		return a - b;
	}

	void display() {
		System.out.println("Subtraction Method");
	}

}

public class AbstractDemo {
	public static void main(String[] args) {
		Calculate c = new Add();
		Calculate c1 = new Sub();
		System.out.println(c.doCalculate(10, 12));
		System.out.println(c1.doCalculate(10, 12));

	}
}
