package com.techpalle.controller;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.techpalle.model.Employee;

public class MyProgram {

	public static void main(String[]args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		
		
//Insert values in employee table		
		/*
	     Employee e1=new Employee("abhishek","Java developer",80000);
		
		Employee e2=new Employee("sanjay","python developer",50000);
		
		Employee e3=new Employee("raju","dotnet developer",60000);
		
		s.save(e1);
		s.save(e2);
		s.save(e3);
		
		*/
		
		

		
		
		
//	Read data from database 
		
	/*	Employee emp1=s.get(Employee.class, 1);
		System.out.println(emp1.getEno());
		System.out.println(emp1.getEname());
		System.out.println(emp1.getEdesgination());
		System.out.println(emp1.getEsal());
		
		*/
		

		
		
		
		
//update data in database
		
	/*	Employee empUpdate=s.get(Employee.class, 3);
		empUpdate.setEdesgination("Database developer");
		
		s.update(empUpdate);
		*/
		
		
		
// delete data in database
		
		Employee empDelete=s.get(Employee.class, 1);
		s.delete(empDelete);
		s.getTransaction().commit();
	
		
		
		
		t.commit();
		
		s.close();
		sf.close();
		
		
	}
}