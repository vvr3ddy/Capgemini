package day3.oops;

class Parent {
	int a = 10;
}

class Child extends Parent {
	int b = 20;
	int a = 20;

	void add() {
		System.out.println(b + a);
	}

	void addDup() {
		System.out.println(a + a);
	}

	void addSup() {
		System.out.println(a + super.a);
	}
}

public class SuperVariables {
	public static void main(String[] args) {
		Child c = new Child();
		c.add();
		c.addDup();
		c.addSup();
	}
}
