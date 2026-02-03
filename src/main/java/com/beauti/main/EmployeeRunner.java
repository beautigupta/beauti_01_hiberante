package com.beauti.main;


import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.beauti.config.EmpConfiguration;
import com.beauti.entity.Address;
import com.beauti.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args) {

//		Employee emp1 = new Employee();
//		emp1.setName("Vinay");
//		emp1.setGender("M");
//		emp1.setSalary(400000);
//
//		Address add1 = new Address();
//		add1.setCity("Noida");
//		add1.setState("UP");
//		add1.setEmployee(emp1);
//		
//		Address add2 = new Address();
//		add2.setCity("GZB");
//		add2.setState("UP");
//		add2.setEmployee(emp1);
//
//		Address add3 = new Address();
//		add3.setCity("Lucknow");
//		add3.setState("UP");
//		add3.setEmployee(emp1);
//
//		
//		
//		ArrayList<Address> listOfAddresses = new ArrayList<>();
//		listOfAddresses.add(add1);
//		listOfAddresses.add(add2);
//		listOfAddresses.add(add3);
//		
//		emp1.setAddresses(listOfAddresses);

		//Session session = EmpConfiguration.getSessionFactory().openSession();
		//Transaction tx = session.beginTransaction();
//		session.persist(add1);
//		session.persist(add2);
//		session.persist(add3);
//		session.persist(emp1);
//		tx.commit();
		
		
//		Employee employee = session.find(Employee.class, 1);
//		System.out.println(employee);
//		System.out.println(employee.getAddresses());

		//Address address = session.find(Address.class, 2);
		//System.out.println(address);
		//System.out.println(address.getEmployee());
		Employee emp1 = new Employee();
		emp1.setName("Vinay");
		emp1.setGender("M");
		emp1.setSalary(400000);
		
		Employee emp2 = new Employee();
		emp2.setName("vimal");
		emp2.setGender("M");
		emp2.setSalary(460000);                                                                                                                                                                            
        
Address add1 = new Address();
		add1.setCity("Noida");
		add1.setState("UP");
//		add1.setEmployee(emp1);
		
		Address add2 = new Address();
		add2.setCity("GZB");
		add2.setState("UP");
//		add2.setEmployee(emp1);

ArrayList<Address> listOfAddresses = new ArrayList<>();
		listOfAddresses.add(add1);
		listOfAddresses.add(add2);
	

		emp1.setAddresses(listOfAddresses);
		emp2.setAddresses(listOfAddresses);
		


		Session session = EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.persist(add1);
		session.persist(add2);
		
		session.persist(emp1);
		session.persist(emp2);
		
			tx.commit();
		
	}

}

