package com.ecodation.hibernateutil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ecodation.hibernate.LoginHib;

//singleton design pattern
public class HibernateUtils {

	private static final SessionFactory sessionFactory = sessionFactoryHibernate();

	private static SessionFactory sessionFactoryHibernate() {
		try {
			Configuration configuration = new Configuration();
		
			configuration.addAnnotatedClass(LoginHib.class);

			SessionFactory sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

}
