package com.ecodation.test2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.hamit.hibernatebean.Register;
import com.hamit.hibernateutils.PersistenceUtil;

public class Select {

	public static void main(String[] args) {

		String password = "20";

		EntityManagerFactory factory = Persistence.createEntityManagerFactory(PersistenceUtil.persistenceUtilName);
		EntityManager entityManager = factory.createEntityManager();

		String jpql = "select takma from Register as takma where takma.password >:key";
		TypedQuery<Register> query = entityManager.createQuery(jpql, Register.class);
		query.setParameter("key", password);

		List<Register> registerList = query.getResultList();

		entityManager.close();

		for (Register temp : registerList) {
			System.out.println(temp.getId() + " " + temp.getEmailAddress() + " " + temp.getNameSurname());
		}

	}
}
