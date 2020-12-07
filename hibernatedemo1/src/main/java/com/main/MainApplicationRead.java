package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.model.Employee;

public class MainApplicationRead {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("com/config/hibernate.cfg.xml")
				.build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		//Employee employee = session.get(Employee.class, 15);
		Employee employee = session.load(Employee.class, 14);
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());

		System.out.println("successfully read");
		
		/*Transaction transaction = session.beginTransaction();
		session.delete(employee);
		transaction.commit();                                          for deletion
		System.out.println("successfully deleted");*/
		
		session.close();
		factory.close();
	}
}