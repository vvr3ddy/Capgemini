package lab9.Employees.com.cg.eis.pl;

import java.util.List;
import java.util.Map;

import lab9.Employees.com.cg.eis.bean.Employee;
import lab9.Employees.com.cg.eis.pl.EmployeeRepository;
import lab9.Employees.com.cg.eis.service.EmployeeService;

public class EmpMain {
	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
		List<Employee> elist = EmployeeRepository.getEmployees();
		System.out.println("Sum of the Salary: " + es.getSumOfSalary(elist));

		System.out.println("\n-------------List of Departments and count of employees----------");
		System.out.printf("%-10s\t%-10s%n","Department","Count of emp");
		Map<String, Long> depts = es.listDepts(elist);
		depts.forEach((k, v) -> System.out.printf("%-10s\t%-2d%n", k, v));

//		System.out.println("\nSenior Most Employee in the organization:"+es.getSeniorMostEmp(elist)); TODO
		
		System.out.println("\nEmployee without dept : ");
		List<Employee> el2 = es.getEmployeeWithoutDept(elist);
		for (Employee e : el2)
			System.out.println(e);

		System.out.println("\nEmployee without manager : ");
		List<Employee> el3 = es.didnotHaveManager(elist);
		for (Employee e : el3)
			System.out.println(e);

//		 System.out.println("\n------------Employee salary increased by 15%----------");
//		 List<String> el4=es.getSalInc(elist);
//		 for(String e:el4)
//		 System.out.println(e);

		System.out.println("\n-------------List sorted by First Name----------");
		List<Employee> el5 = es.sortName(elist);
		for (Employee e : el5)
			System.out.println(e);

		System.out.println("\n-------------List sorted by Employee id----------");
		List<Employee> el6 = es.sortEmpId(elist);
		for (Employee e : el6)
			System.out.println(e);

		System.out.println("\n-------------List sorted by Department id----------");
		List<Employee> el7 = es.sortDeptId(elist);
		for (Employee e : el7)
			System.out.println(e);
	}
}
