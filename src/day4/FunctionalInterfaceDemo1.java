package day4;

@FunctionalInterface
interface Test {
	void print();
	// void print2(); enabling this leads to an error
}

@FunctionalInterface
interface Calculator {
	int calculate(int a, int b);
}

public class FunctionalInterfaceDemo1 {
	public static void main(String[] args) {
		Test t = () -> System.out.println("Hello this is print method"); // calls print
		Test t2 = () -> {
			System.out.println("This is print method impl.");
			System.out.println("It has more than one line");
		};
		t.print();
		t2.print();
		
		
		Calculator add = (a, b) -> a+b;
		Calculator sub = (a, b) -> a-b;
		
		System.out.println(add.calculate(10, 20));
		
	}
	
	
	
}
