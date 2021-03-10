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

