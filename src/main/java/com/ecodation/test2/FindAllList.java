package com.ecodation.test2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;
import com.hamit.hibernatebean.Register;

public class FindAllList {

	// Liste
	public static List<Register> findAll() {
		Session session = HibernateUtils.getSessionfactory().openSession();
		String hql = "from Register";
		// Query typedQuery = session.createQuery(hql);
		TypedQuery<Register> typedQuery2 = session.createQuery(hql, Register.class);
		return typedQuery2.getResultList();
		// return typedQuery.list();
	}

	public static void main(String[] args) {
		ArrayList<Register> listem = (ArrayList<Register>) findAll();
		for (Register registerTemp : listem) {
			System.out.println(registerTemp);
		}
	}
}
