package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;
import com.cg.eis.dao.EmployeeDAO;
import com.cg.eis.dao.IEmployeeDAO;

public class EmployeeService implements IEmployeeService {
	IEmployeeDAO DAO = new EmployeeDAO();

	@Override
	public double getSumSal(List<Employee> elist) {
		return DAO.getSumSal(elist);
	}

	@Override
	public List<Employee> getEmployeeById(List<Employee> elist, int id) {
		return DAO.getEmployeeById(elist, id);
	}

	@Override
	public List<Employee> getEmployeeWithoutMgr(List<Employee> elist) {
		return DAO.getEmployeeWithoutMgr(elist);
	}

	@Override
	public Employee empWithHighestSal(List<Employee> elist) {
		return DAO.empWithHighestSal(elist);
	}

	@Override
	public List<Employee> sortById(List<Employee> elist) {
		return DAO.sortById(elist);
	}

	@Override
	public List<Employee> sortByName(List<Employee> elist) {

		return DAO.sortByName(elist);
	}

	@Override
	public List<Employee> sortBySal(List<Employee> elist) {

		return DAO.sortBySal(elist);
	}
	

}
