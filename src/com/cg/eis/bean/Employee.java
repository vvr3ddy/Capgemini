package com.cg.eis.bean;

public class Employee {
	private int empId;
	private String name;
	private double Salary;
	private String designation;
	private String managerName;

	public Employee(int empId, String name, double salary, String designation, String managerName) {
		super();
		this.empId = empId;
		this.name = name;
		Salary = salary;
		this.designation = designation;
		this.managerName = managerName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", Salary=" + Salary + ", designation=" + designation
				+ ", managerName=" + managerName + "]";
	}
}
