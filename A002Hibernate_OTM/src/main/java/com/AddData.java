package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Country;
import model.president;

public class AddData {
		public static void main(String[] args) {
			
			
			
			SessionFactory sf = 
					new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Country.class)
					.addAnnotatedClass(president.class)
					.buildSessionFactory();
			
			Session s  =sf.openSession();
			Transaction tx = s.beginTransaction();
			
			
			Country c = new Country();
			c.setCountryName("USA");
			
			president p = new president();
			p.setPresidentName("Donald Trump");
			
			c.setPresident(p);
			
			s.save(c);
			
			
			tx.commit();
			
			
			
		}
}
