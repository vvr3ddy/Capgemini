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
		
		Department dept = new Department();
		dept.setDeptId(1002);
		dept.setDeptName("HR");
		
		Employee e1 = new Employee();
		e1.setId(1001);
		e1.setDepartment(dept);
		e1.setName("John");
		e1.setSalary(100000);

		Employee e2 = new Employee();
		e2.setId(1002);
		e2.setDepartment(dept);
		e2.setName("Smith");
		e2.setSalary(10000);

		em.persist(dept);
		em.persist(e1);
		em.persist(e2);
		em.getTransaction().commit();
	}
}
