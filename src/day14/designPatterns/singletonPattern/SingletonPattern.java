package day14.designPatterns.singletonPattern;

class Employee {
	private static final Employee instance = new Employee();

	private Employee() {

	}

	public static Employee getInstance() {
		return instance;
	}

	public void showMethod() {
		System.out.println("Hello World");
	}

}

class Task {
	Employee disp() {
		return Employee.getInstance();
	}
}

public class SingletonPattern {
	public static void main(String[] args) {
		// Illegal way of creating object
		// Employee e = new Employee(); -> The constructor Employee() is not visible

		Employee e = Employee.getInstance();
		Employee e1 = Employee.getInstance();
		System.out.println("Hashcode of e:" + e.hashCode());
		System.out.println("Hashcode of e1:" + e1.hashCode());
		// We note that the hashcode of both objects is same
		Task t1 = new Task();
		System.out.println(t1.disp());
		Task t2 = new Task();
		System.out.println(t2.disp());

	}
}

