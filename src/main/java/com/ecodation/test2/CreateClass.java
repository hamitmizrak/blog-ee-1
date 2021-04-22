package com.ecodation.test2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hamit.hibernatebean.Register;
import com.hamit.hibernateutils.PersistenceUtil;

public class CreateClass {

	public void createHibernate(Register register) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(PersistenceUtil.persistenceUtilName);
		EntityManager entityManager = factory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.persist(register);
		entityManager.getTransaction().commit();
		entityManager.close();
		System.out.println("ekleme başarılı");

	}

}
