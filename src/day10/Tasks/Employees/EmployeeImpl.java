package day10.Tasks.Employees;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeImpl {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "John", 20000, "nitin", 10));
		empList.add(new Employee(2, "Ram", 50000, "ajay", 20));
		empList.add(new Employee(3, "Rahim", 70000, "smith", 30)); // max salary
		empList.add(new Employee(4, "Sam", 10000, "nitin", 10));
		empList.add(new Employee(5, "Johnson", 65000, "smith", 30));
		empList.add(new Employee(6, "Rohit", 35000, "smith", 30));
		empList.add(new Employee(7, "Rahul", 55000, "ajay", 20));

		System.out.println("Max salary in the list:");
		System.out.println(empList.stream().mapToDouble(e->e.getSalary()).max());
		
		System.out.println();
		System.out.println("List of employees with salary less than 50000");
		List<Employee> salaryBased = empList.stream().filter(e -> e.getSalary()<50000).collect(Collectors.toList());
		salaryBased.forEach(System.out::println);
		
		System.out.println();
		System.out.println("List of employees reporting to Nitin:");
		List<Employee> nitinEmployees = empList.stream().filter(e->e.getMgrName().equalsIgnoreCase("NITIN")).collect(Collectors.toList());
		nitinEmployees.forEach(System.out::println);
		
		System.out.println();
		System.out.println("List of employees working in dept 10");
		List<Employee> workingIn10 = empList.stream().filter(e->e.getDeptNo() == 10).collect(Collectors.toList());
		workingIn10.forEach(System.out::println);
		
		System.out.println();
		System.out.println("Count of employees working in dept 20");
		long count = empList.stream().filter(e-> e.getDeptNo()==20).count();
		System.out.println(count);
		
		System.out.println();
		System.out.println("List of employees with name starting with A");
		List<Employee> startWithA = empList.stream().filter(e -> e.getName().startsWith("A")).collect(Collectors.toList());
		startWithA.forEach(System.out::println);
		
		
	}
}
