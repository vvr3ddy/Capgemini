package day3.oops;

class Parent2 {

	void vehicle() {
		System.out.println("Audi");
	}
}

class Child2 extends Parent2 {
	@Override
	void vehicle() {
		System.out.println("Porsche");
	}
}

public class PolymorphismDemo {
	public static void main(String[] args) {
		Child2 child2 = new Child2();
		child2.vehicle();
	}
}
