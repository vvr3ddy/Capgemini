package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;
import com.cg.eis.exceptions.IdNotFoundException;

public interface IEmployeeService {

	public double getSumSal(List<Employee> elist);

	public List<Employee> sortByName(List<Employee> elist);
	
	public Employee findById(int id);
}
