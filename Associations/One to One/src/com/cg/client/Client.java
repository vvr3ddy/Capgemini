package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Address;
import com.cg.entity.Employee;

public class Client {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Address ad = new Address();
		
		ad.setAddressId(1001);
		ad.setPincode(560054);
		ad.setStreetName("ABC Street");
		
		Employee emp = new Employee();
		emp.setAddress(ad);
		emp.setId(1001);
		emp.setDesignation("Manager");
		emp.setName("John Doe");
		emp.setSalary(100000);
		
		em.persist(emp);
		em.getTransaction().commit();
	}
}
