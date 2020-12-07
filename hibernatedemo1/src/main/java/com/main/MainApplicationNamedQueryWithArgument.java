package com.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.model.Employee;

public class MainApplicationNamedQueryWithArgument {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("com/config/hibernate.cfg.xml")
				.build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		Query query = session.createNamedQuery("findByName");
		query.setParameter("Name", "sai");
		List<Employee> totalEmployees = query.getResultList();
		
		for (Employee employee : totalEmployees) {
			System.out.println("Employee Number       : " + employee.getEmpNo());
            System.out.println("Employee First name   : " + employee.getFirstName());
            System.out.println("Employee Second name  : "+employee.getLastName());
            
            System.out.println("");
		}

		 System.out.println("End of NativeQueryWithArgument Implementation");
		
		
		session.close();
		factory.close();
	}
}