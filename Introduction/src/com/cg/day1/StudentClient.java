package com.cg.day1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentClient {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Student s = new Student();
		s.setName("John");
		s.setId(2);
		s.setDept("TCE");
		//add details to the DB
		em.persist(s);
		System.out.println("Record inserted");
		
		em.getTransaction().commit();
	}
}
