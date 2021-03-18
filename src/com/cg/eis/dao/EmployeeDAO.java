package com.cg.eis.dao;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.cg.eis.bean.Employee;

public class EmployeeDAO implements IEmployeeDAO {

	@Override
	public double getSumSal(List<Employee> elist) {

		return elist.stream().collect(Collectors.summingDouble(Employee::getSalary));
	}

	@Override
	public List<Employee> getEmployeeById(List<Employee> elist, int id) {
		return elist.stream().filter(e -> e.getEmpId() == id).collect(Collectors.toList());
	}

	@Override
	public List<Employee> getEmployeeWithoutMgr(List<Employee> elist) {
		return elist.stream().filter(e -> e.getManagerName() == null).collect(Collectors.toList());
	}

	@Override
	public Employee empWithHighestSal(List<Employee> elist) {
		return elist.stream().max(Comparator.comparing(Employee::getSalary)).get();
	}

	@Override
	public List<Employee> sortById(List<Employee> elist) {
		return elist.stream().sorted(Comparator.comparing(Employee::getEmpId)).collect(Collectors.toList());
	}

	@Override
	public List<Employee> sortByName(List<Employee> elist) {
		return elist.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
	}

	@Override
	public List<Employee> sortBySal(List<Employee> elist) {
		return elist.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
	}

}
