package com.cg.day1.products;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class ProductService {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
//		Product p = new Product();
//		p.setpId(1003);		
//		p.setpName("Wireless Mouse");
//		p.setpCat("Electronics");
//		p.setpPrice(999.99f);
//		
//		em.persist(p);
//		Product p = em.find(Product.class,1001);
//		if(p!=null) {
//			System.out.println("Before update:");
//			System.out.println(p.getpId());
//			System.out.println(p.getpName());
//			
//			System.out.println("Updating details of 1001");
//			p.setpName("Mobile mouse");
//			em.persist(p);
//			
//			System.out.println("Updated details");
//			
//			System.out.println(p.getpName());
		
		TypedQuery<Product> qr = em.createNamedQuery("Product.abcd",Product.class).setParameter("id", 1001);
//		List<Product> prs = qr.getResultList();  
//		for(Product p:prs) {
//			System.out.println(p);
//		}
		Product p = qr.getSingleResult();
		System.out.println(p);
		em.getTransaction().commit();
	}
}
