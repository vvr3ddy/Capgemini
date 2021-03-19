package lab7.Exercise01.com.cg.eis.pl;

import java.util.Scanner;

import lab7.Exercise01.com.cg.eis.bean.Employee;
import lab7.Exercise01.com.cg.eis.service.EmployeeServiceImpl;
import lab7.Exercise01.com.cg.eis.service.IEmployeeService;

public class EmpMain {
	public static void main(String[] args) {
		IEmployeeService empService = new EmployeeServiceImpl();
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the Employee details to determine insurance scheme:");
		Employee e = new Employee(read.nextInt(), read.nextLine(), read.nextDouble(), read.nextLine());
		System.out.println("The details of insurance scheme are:");
		empService.getInsuranceByDetails(e);
	}
}
