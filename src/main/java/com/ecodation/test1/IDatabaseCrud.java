package com.ecodation.test1;

import java.util.ArrayList;

import org.hibernate.Session;

import com.ecodation.hibernateutil.HibernateUtils;

public interface IDatabaseCrud<T> {

	public void create(T t);

	public void delete(Long id);

	public void update(T t, Long id);

	default T find(Long id) {
		return null;
	}

	default T singleResult(Long id) {
		return null;
	}

	default Long singleResultAggregateCount() {

		return null;
	}

	default Long singleResultAggregateOther() {
		return null;
	}

	default ArrayList<T> list() {
		return null;
	}

	// Session session = HibernateUtils.getSessionfactory().openSession();
	default Session databaseConnectionHibernate() {
		return HibernateUtils.getSessionfactory().openSession();
	}
}
