package com.cg.client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Department;
import com.cg.entity.Employee;

public class Client {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		List<Employee> list = new ArrayList<Employee>();

		
		Department dept = new Department();
		dept.setDeptId(101);
		
		
		Employee e1 = new Employee();
		e1.setId(1001);
		e1.setName("John");
		e1.setSalary(100000);

		Employee e2 = new Employee();
		e2.setId(1002);
		e2.setName("Smith");
		e2.setSalary(10000);

		list.add(e1);
		list.add(e2);

		dept.setDeptName("Admin");
		dept.setEmployee(list);

		em.persist(dept);
		em.getTransaction().commit();
	}
}
