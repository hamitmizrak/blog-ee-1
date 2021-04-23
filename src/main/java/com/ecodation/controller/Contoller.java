package com.ecodation.controller;

import java.util.ArrayList;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.ecodation.hibernate.LoginHiber;
import com.ecodation.hibernateutil.IDatabase;

public class Contoller implements IDatabase<LoginHiber> {

	@Override
	public void create ( LoginHiber loginHiber ) {
		Session session=databaseConnectionHibernate ( );
		session.getTransaction ( ).begin ( );
		session.persist ( loginHiber );
		session.getTransaction ( ).commit ( );
		System.out.println ( "success insert "+LoginHiber.class );
		
	}

	@Override
	public void delete ( long id ) {
		LoginHiber loginHiber=find ( id );
		Session session=databaseConnectionHibernate ( );
		session.getTransaction ( ).begin ( );
		session.remove ( loginHiber );
		session.getTransaction ( ).commit ( );
		System.out.println ( "success delete "+LoginHiber.class );
		
	}

	@Override
	public void update ( LoginHiber loginHiber , long id ) {
		LoginHiber loginHiber2=find ( id );
		loginHiber2.setRegisterEmail ( loginHiber.getRegisterEmail ( ) );
		loginHiber2.setRegisterName( loginHiber.getRegisterName ( ) );
		loginHiber2.setRegisterSurname ( loginHiber.getRegisterSurname ( ) );
		loginHiber2.setRegisterPassword ( loginHiber.getRegisterPassword ( ) );
		
		Session session=databaseConnectionHibernate ( );
		session.getTransaction ( ).begin ( );
		session.merge( loginHiber );
		session.getTransaction ( ).commit ( );
		System.out.println ( "success update "+LoginHiber.class );
		
		
	}

	@Override
	public ArrayList <LoginHiber> list ( ) {
		Session session=databaseConnectionHibernate ( );
		String sql="select log from LoginHiber as log where log.id>:key";
		TypedQuery <LoginHiber> typedQuery=session.createQuery ( sql, LoginHiber.class);
		long id=4L;
		typedQuery.setParameter ( "key" , id );
		ArrayList <LoginHiber> hiberList=( ArrayList <LoginHiber> ) typedQuery.getResultList ( );
		return hiberList;
	}

}
