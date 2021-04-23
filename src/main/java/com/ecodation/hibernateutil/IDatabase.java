package com.ecodation.hibernateutil;

import java.util.ArrayList;

import org.hibernate.Session;

public interface IDatabase <T>{
	public void create(T t);
	public void  delete(long id);
	public void update(T t , long id);
	public ArrayList <T> list();
	
	default T find(long id){
		return null;
	}
	
	default T singleResult(long id){
		return null;		
	}
	
	
	
	default Session databaseConnectionHibernate() {
		return HibernateUtils.getSessionfactory ( ).openSession ( );
	}

}
