package day4;
class Par {
	static void doSomething() {
		System.out.println("Parent method");
	}
}

class Chl extends Par {
	static void doSomething() {
		System.out.println("Child method");
	}
}
public class StaticDemo {
	public static void main(String[] args) {
		Par ch = new Chl();
		ch.doSomething();
	}
}
