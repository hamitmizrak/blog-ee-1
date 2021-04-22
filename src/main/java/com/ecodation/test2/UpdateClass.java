package com.ecodation.test2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hamit.hibernatebean.Register;
import com.hamit.hibernateutils.PersistenceUtil;

public class UpdateClass {

	public void updateHibernate(long id, Register register) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory(PersistenceUtil.persistenceUtilName);
		EntityManager entityManager = factory.createEntityManager();

		entityManager.getTransaction().begin();

		Register register2 = entityManager.find(Register.class, id);
		register2.setEmailAddress(register.getEmailAddress());
		register2.setNameSurname(register.getNameSurname());

		entityManager.merge(register2);
		entityManager.getTransaction().commit();

		entityManager.close();
		System.out.println("güncelleme başarılı");

	}

}
