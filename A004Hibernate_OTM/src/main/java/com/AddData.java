package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;

public class AddData {
		public static void main(String[] args) {
			
			
			
			SessionFactory sf = 
					new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Category.class)
					.addAnnotatedClass(Product.class)
					.buildSessionFactory();
			
			Session s  =sf.openSession();
			Transaction tx = s.beginTransaction();
			
			
			Category c = new Category();
			c.setName("Cloths");
			
			Product p = new Product();
			p.setName("Shirt");
			p.setPrice(500);
			p.setCategory(c);
			
			Product p1 = new Product();
			p1.setName("T-Shirt");
			p1.setPrice(500);
			p1.setCategory(c);
			
			
			s.save(c);
			s.save(p);
			s.save(p1);
			
			
			
			tx.commit();
			
			
			
		}
}
