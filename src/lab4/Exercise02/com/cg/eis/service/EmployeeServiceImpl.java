package lab4.Exercise02.com.cg.eis.service;

import lab4.Exercise02.com.cg.eis.bean.*;

interface EmployeeService {
	void getEmployeeDetails(Employee employee);

	void findInsuranceScheme(Employee employee);

	void displayEmployeeDetails(Employee employee);

}

public class EmployeeServiceImpl extends Employee implements EmployeeService {

	@Override
	public void getEmployeeDetails(Employee employee) {
		System.out.println("Employee Details:");
		
		System.out.println("Name:" + employee.getName());
		System.out.println("Id:" + employee.getId());
		System.out.println("Designation:" + employee.getDesignation());
		System.out.println("Salary:"+employee.getSalary());
	}

	@Override
	public void findInsuranceScheme(Employee employee) {
		
	}

	@Override
	public void displayEmployeeDetails(Employee employee) {
		System.out.println(employee.getName());
		System.out.println(employee.getDesignation());
	}

}
