package day3.oops;

class Par {
	int A;
	String s;

	public Par() {
		System.out.println("Parent Invoked");
	}

	public Par(int A) {
		System.out.println("A:" + A);
	}

	public Par(String s) {
		System.out.println("S:" + s);
	}
}

class Chl extends Par {
	public Chl() {
		super();

		System.out.println("Child Invoked");
	}

	public Chl(int a) {
		super(a);
		System.out.println("Child Parameterized");
	}

	public Chl(String s) {
		super(s);
		System.out.println("Child Parameterized String");
	}
}

public class SuperConstructor {
	public static void main(String[] args) {
		Chl ch = new Chl();
		Chl c1 = new Chl(1);
		Chl c2 = new Chl("John");
	}
}
