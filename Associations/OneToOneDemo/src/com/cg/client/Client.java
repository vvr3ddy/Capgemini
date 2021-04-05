package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Passport;
import com.cg.entity.Person;

public class Client {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Passport passport  = new Passport();
		passport.setNationality("US");
		passport.setPassportId(1002);
		
		Person p = new Person();
		p.setPersonId(102);
		p.setPersonName("Jean doe");
		p.setPassport(passport);
		
		passport.setPerson(p);
		em.persist(passport);
		em.getTransaction().commit();
	}
}
