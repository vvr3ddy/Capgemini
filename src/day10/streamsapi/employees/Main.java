package day10.streamsapi.employees;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "John", "IT", 24, 23000));
		employees.add(new Employee(2, "Sam", "HR", 30, 65000));
		employees.add(new Employee(3, "Rose", "Manager", 32, 70000));
		employees.add(new Employee(4, "Joeseph", "Developer", 22, 35000));
		employees.add(new Employee(5, "William", "Developer", 30, 29000));

		// System.out.println("Employees:" + employees);
		// internal iteration using java 8 forEach loop
		System.out.println("METHOD 1: Method Referencing Way");
		employees.forEach(System.out::println);
		System.out.println();

		System.out.println("METHOD 2: Lambda Way");
		employees.forEach(s -> System.out.println(s));

		long empcount = employees.stream().count();
		System.err.println("No of employees in the organization:" + empcount);
		System.out.println();

		// Filter Demo
		System.out.println("Details of Developers in the company:");
		employees.stream().filter(e -> e.getDept().equalsIgnoreCase("DEVELOPER")).forEach(System.out::println);
		System.out.println("No of developers:"
				+ employees.stream().filter(e -> e.getDept().equalsIgnoreCase("developer")).count());

		// Map Demo
		System.out.println("\nList of employees name and their departments:");
		employees.stream().map(e -> e.getName() + ":" + e.getDept()).forEach(System.out::println);

		// Map Demo
		System.out.println("\nList of employees with old and their new salaries");
		employees.stream().map(e -> e.getSalary() + " " + e.getSalary() * (1.1)).forEach(System.out::println);

		System.out.println("\nTotal employee salary");
		System.out.println(employees.stream().mapToInt(s -> s.getSalary()).sum());

		System.out.println("\n Average Salary:");
		System.out.println(employees.stream().mapToDouble(s -> s.getSalary()).average().getAsDouble());
		// Use getAsDouble to make sure OptionalDouble isn't printed

		System.out.println("Developer Salary");
		System.out.println(employees.stream().filter(s -> s.getDept().equalsIgnoreCase("DEVELOPER"))
				.mapToInt(s -> s.getSalary()).sum());

		System.out.println("Employees who are developers:");
		employees.stream().filter(e -> e.getDept().equalsIgnoreCase("DEVELOPER")).map(e -> e.getName())
				.forEach(System.out::println);

		List<Employee> emplist = employees.stream().filter(s -> s.getAge() > 25).collect(Collectors.toList());
		System.out.println("\nEmployees older than 25 years of age");
		emplist.forEach(System.out::println);
		System.out.println();
		System.out.println("List of employees who are not developers:");
		List<Employee> nonDevs = employees.stream().filter(e -> !e.getDept().equalsIgnoreCase("DEVELOPER"))
				.collect(Collectors.toList());
		nonDevs.forEach(System.out::println);

		System.out.println("Sorted employees List:");
		List<Employee> sortedList = 
				employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.collect(Collectors.toList());
		sortedList.forEach(System.out::println);
		
		
	}
}
