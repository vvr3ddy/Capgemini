package lab4.Exercise02.com.cg.eis.pl;

import java.util.*;

import lab4.Exercise02.com.cg.eis.bean.Employee;
import lab4.Exercise02.com.cg.eis.service.EmployeeServiceImpl;

public class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Employee e = new Employee();
		System.out.println("Enter Employee details:");
		System.out.println("Name:");
		e.setName(read.nextLine());
		System.out.println("Salary:");
		e.setSalary(read.nextDouble());
		System.out.println("Designation:");
		e.setDesignation(read.nextLine());

		// Invoke Employee Services
		EmployeeServiceImpl imp = new EmployeeServiceImpl();
		imp.displayEmployeeDetails(e);
		imp.findInsuranceScheme(e);
		imp.getEmployeeDetails(e);
	}
}
