package com.cg.eis.pl;

import java.util.List;
import java.util.Scanner;

import com.cg.eis.service.IEmployeeService;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;

public class EmployeeMain {
	public static void main(String[] args) {
		IEmployeeService es = new EmployeeService();
		Scanner read = new Scanner(System.in);
		List<Employee> elist = EmployeeRepository.getEmployees();
		List<Employee> emp = null;
		System.out.println("Sum of the Salary: " + es.getSumSal(elist));
		// ---------------------------------------------------------------------
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Enter the emp Id to display corresponding details:");
		int id = read.nextInt();
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Details of the employee corresponding to id " + id + " are:");
		emp = es.getEmployeeById(elist, id);
		if (emp.size() != 0)
			emp.forEach(System.out::println);
		else
			System.out.println("Employee does not exist in the database");
		// ---------------------------------------------------------------------
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Employee with highest Salary");
		System.out.println(es.empWithHighestSal(elist));
		// ---------------------------------------------------------------------
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Employees without reporting manager:");
		emp = es.getEmployeeWithoutMgr(elist);
		emp.forEach(System.out::println);
		// ---------------------------------------------------------------------
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Employees sorted by Id");
		emp = es.sortById(elist);
		emp.forEach(System.out::println);
		// ---------------------------------------------------------------------
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Employees sorted by Name");
		emp = es.sortByName(elist);
		emp.forEach(System.out::println);
		// ---------------------------------------------------------------------
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Employees sorted by Salary");
		emp = es.sortBySal(elist);
		emp.forEach(System.out::println);

	}
}
