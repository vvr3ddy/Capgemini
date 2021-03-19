package lab7.Exercise01.com.cg.eis.util;

import java.util.HashMap;
import java.util.Map;

import lab7.Exercise01.com.cg.eis.bean.Employee;

public class EmployeeRepository {
	public static Map<Integer, Employee> getEmployees() {
		Map<Integer, Employee> employees = new HashMap<>();
		employees.put(1, new Employee(1, "John", 42000, "Manager"));
		employees.put(2, new Employee(2, "Ram", 12000, "System Associate"));
		employees.put(3, new Employee(3, "Anand", 25000, "Programmer"));
		employees.put(4, new Employee(4, "Krishna", 17000, "System Associate"));
		employees.put(5, new Employee(5, "Smriti", 4000, "Clerk"));
		employees.put(6, new Employee(6, "Vinay", 2000, "Clerk"));
		
		return employees;
	}
}
