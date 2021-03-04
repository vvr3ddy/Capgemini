package day2;

class Employee {
	int id;
	String name;
	static String company = "ABC Pvt. Ltd.";
}

public class StaticMembers {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 1;
		e1.name = "A";
		Employee e2 = new Employee();
		e2.id = 2;
		e2.name = "B";
		e2.company = "DEF Pvt. Ltd.";
		System.out.println(e1.id+" "+e1.company);
		System.out.println(e2.id+" "+e2.company);
	}
}
