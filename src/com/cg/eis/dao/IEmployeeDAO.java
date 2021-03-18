package com.cg.eis.dao;

import java.util.List;

import com.cg.eis.bean.Employee;

public interface IEmployeeDAO {
	public double getSumSal(List<Employee> elist);

	List<Employee> getEmployeeById(List<Employee> elist, int id);

	public List<Employee> getEmployeeWithoutMgr(List<Employee> elist);

	Employee empWithHighestSal(List<Employee> elist);

	public List<Employee> sortById(List<Employee> elist);

	public List<Employee> sortByName(List<Employee> elist);

	public List<Employee> sortBySal(List<Employee> elist);
}
