package com.beauti.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;           

public class EmpConfiguration {
	
	public static SessionFactory getSessionFactory()
	
	{
	
		Properties properties = new Properties();
		
		

		properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		properties.put(Environment.JAKARTA_JDBC_URL, "jdbc:mysql://localhost:3306/hibernate");
		properties.put(Environment.JAKARTA_JDBC_USER, "root");
		properties.put(Environment.JAKARTA_JDBC_PASSWORD, "851204");
		properties.put(Environment.HBM2DDL_AUTO, "create");
		properties.put(Environment.SHOW_SQL, "true");
		//properties.put(Environment.FORMAT_SQL, "true");


		
		//StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(properties).build();
		//Metadata  MetaData = new MetadataSource(ssr).getMetadataBuilder().build();
		//SessionFactory sessionFactory = metaData.buildSessionFactory();
		
		
		
		return new MetadataSources(new StandardServiceRegistryBuilder().applySettings(properties).build())
				.addAnnotatedClass(com.beauti.entity.Employee.class).getMetadataBuilder().build().buildSessionFactory();

		 
		
	
		
	}

}
