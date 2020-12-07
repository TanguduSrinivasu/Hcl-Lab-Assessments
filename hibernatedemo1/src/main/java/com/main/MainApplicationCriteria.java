package com.main;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


import com.model.Employee;

public class MainApplicationCriteria {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("com/config/hibernate.cfg.xml")
				.build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		CriteriaQuery cq = session.getCriteriaBuilder().createQuery(Employee.class);
        cq.from(Employee.class);
         List<Employee> listOfEmployee =  session.createQuery(cq).getResultList();
         for (Employee employee : listOfEmployee) {
            System.out.println("Employee Number       : " + employee.getEmpNo());
            System.out.println("Employee First name   : " + employee.getFirstName());
            System.out.println("Employee Second name  : "+employee.getLastName());
            System.out.println("");
        }
	
		

		System.out.println("End of the Criteria Query");
		
		
		
		session.close();
		factory.close();
	}
}