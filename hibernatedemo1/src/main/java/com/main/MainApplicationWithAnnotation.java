
package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.model.Address;
import com.model.Employee;

public class MainApplicationWithAnnotation {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("com/config/hibernate.cfg.xml")
				.build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		
		
		Address address = new Address();

		address.setCity("Srikakulam");
		address.setState("AP");
		
		Transaction transaction = session.beginTransaction(); 
		session.persist(address);
		transaction.commit();
		
		System.out.println("Address is successfully saved");
		session.close();
		factory.close();
	}
}