package day2;

public class StaticMethods {
	static {
		System.out.println("1");
	}
	public static void main(String[] args) {
		System.out.println("Main");
	}
	static {
		System.out.println("2");
	}
}
