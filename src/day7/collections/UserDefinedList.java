package day7.collections;

import java.util.*;

class Employee {
	int id;
	String name;
	String dept;

	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		
	}

	@Override
	public String toString() { //need to use this if we have to print the values of the Employee object
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

}

public class UserDefinedList {
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "John Doe", "IT"));
		empList.add(new Employee(2, "Sam Smith", "HR"));
		empList.add(new Employee(3, "Rose", "Networking"));
		System.out.println(empList.toString());
		
		Iterator<Employee> itr = empList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
