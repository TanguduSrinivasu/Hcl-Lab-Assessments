package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.model.Employee;

public class MainApplicationNamedQuery {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("com/config/hibernate.cfg.xml")
				.build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		List<Employee> totalEmployees = session.createNamedQuery("findAll").getResultList();
		for (Employee employee : totalEmployees) {
			System.out.println("Employee Number       : " + employee.getEmpNo());
            System.out.println("Employee First name   : " + employee.getFirstName());
            System.out.println("Employee Second name  : "+employee.getLastName());
            System.out.println("");
		}

		 System.out.println("End of NativeQuery Implementation");
		
		
		session.close();
		factory.close();
	}
}