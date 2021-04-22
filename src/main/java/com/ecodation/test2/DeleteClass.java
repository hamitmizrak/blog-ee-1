package com.ecodation.test2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hamit.hibernatebean.Register;
import com.hamit.hibernateutils.PersistenceUtil;

//DELETE FROM `hibernatedb`.`tablo_adi` WHERE (`id` = '2');
public class DeleteClass {

	public void deleteHibernate(long id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(PersistenceUtil.persistenceUtilName);
		EntityManager entityManager = factory.createEntityManager();

		Register register = entityManager.find(Register.class, id);

		entityManager.getTransaction().begin();
		entityManager.remove(register);
		entityManager.getTransaction().commit();
		entityManager.close();
		System.out.println("Silme işlemi başarılı");
	}
}
