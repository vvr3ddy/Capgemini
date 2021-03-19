package lab9.Employees.com.cg.eis.service;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import lab9.Employees.com.cg.eis.bean.Employee;

public class EmployeeService {

	public String getSumOfSalary(List<Employee> elist) {
		double sal = elist.stream().collect(Collectors.summingDouble(Employee::getSalary));
		return String.valueOf(sal);
		
		
	}

	public Map<String, Long> listDepts(List<Employee> elist) {

		return elist.stream().filter(e->e.getDepartment()!=null)
				.collect(Collectors.groupingBy(e -> e.getDepartment().getDepartmentName(), Collectors.counting()));

	}

//	public String getSeniorMostEmp(List<Employee> elist) {
//		elist.stream().max(Comparator.comparing(LocalDate::now));
//		return null; // TODO
//	}

	public List<Employee> getEmployeeWithoutDept(List<Employee> elist) {
		return elist.stream().filter(e -> e.getDepartment() == null).collect(Collectors.toList());
	}

	public List<Employee> didnotHaveManager(List<Employee> elist) {
		return elist.stream().filter(e -> e.getManagerId() == null).collect(Collectors.toList());
	}

//	public List<String> getSalInc(List<Employee> elist) {
//		List<String> list = elist.stream().map(e -> e.getFirstName()).map(e -> e.getSalary())
//				.map(e -> e.getSalary(1.15)).collect(Collectors.toList());
//		return list;
//	}

	public List<Employee> sortName(List<Employee> elist) {
		return elist.stream().sorted(Comparator.comparing(e->e.getFirstName())).collect(Collectors.toList());
	}

	public List<Employee> sortEmpId(List<Employee> elist) {
		return elist.stream().sorted(Comparator.comparing(Employee::getEmployeeId)).collect(Collectors.toList());
	}

	public List<Employee> sortDeptId(List<Employee> elist) {
		return elist.stream().filter(e -> e.getDepartment() != null)
				.sorted(Comparator.comparing(e -> e.getDepartment().getDepartmentId())).collect(Collectors.toList());
	}

}
