package com.main;

import java.util.Iterator;
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

public class MainApplicationHQL {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("com/config/hibernate.cfg.xml")
				.build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
	
		String hql = "From Employee";
		/*String hql = "From Employee where empNo = 11";*/
		Query query = session.createQuery(hql);
		List<Employee>listOfEmployee = query.getResultList();
		
		for (Employee employee : listOfEmployee) {
			System.out.println("Employee Number "+employee.getEmpNo());
			System.out.println("Employee First Name "+employee.getFirstName());
			System.out.println("Employee Second Name "+employee.getLastName());
		}
		System.out.println("Successfully details got");
		session.close();
		factory.close();
	}
}