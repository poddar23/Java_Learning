package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;

public class ViewData {
		public static void main(String[] args) {
			
			
			
			SessionFactory sf = 
					new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Category.class)
					.addAnnotatedClass(Product.class)
					.buildSessionFactory();
			
			Session s  =sf.openSession();
			Transaction tx = s.beginTransaction();
			
			
			List<Category> categories =  s.createQuery("from Category").list();
			
			for(Category c  :categories)
			{
				System.out.println(c.getName()+" "+c.getId());
				for (Product product : c.getProducts()) {
					System.out.println(product.getName()+" "+product.getId());
						
				}
			}
			
					
			
		}
}
