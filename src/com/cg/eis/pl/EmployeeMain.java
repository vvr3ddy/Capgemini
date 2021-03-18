package com.cg.eis.pl;

import java.util.List;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.exceptions.IdNotFoundException;
import com.cg.eis.service.EmployeeServiceImpl;
import com.cg.eis.util.EmployeeRepo;

public class EmployeeMain {
	public static void main(String[] args) throws IdNotFoundException {
		EmployeeRepo er = new EmployeeRepo();

		EmployeeServiceImpl es = new EmployeeServiceImpl();

		Scanner read = new Scanner(System.in);

		List<Employee> employees = er.getEmployees();
		System.out.println("Details of employees:");

		employees.forEach(System.out::println);

		System.out.println("-----------------------------------");
		System.out.println("Total Salary of the organization:" + es.getSumSal(employees));
		System.out.println("-----------------------------------");
		System.out.println("Sort employees based on name");
		List<Employee> emps = es.sortByName(employees);
		// emps.forEach(System.out::println);
		for (Employee e : emps) {
			System.out.println(e);
		}
		System.out.println("-----------------------------------");
		System.out.println("Enter employee id:");
		int eId = read.nextInt();
		Employee em = es.findById(eId);
		try {
			if (em == null)
				throw new IdNotFoundException("Employee not found");

		} catch (IdNotFoundException e) {
			e.printStackTrace();
		}

	}
}
