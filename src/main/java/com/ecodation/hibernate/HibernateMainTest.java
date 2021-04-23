package com.ecodation.hibernate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ecodation.hibernate.LoginHib;
import com.ecodation.hibernateutil.PersistenceUtil;

public class HibernateMainTest {

	public static void main ( String [ ] args ) {
		LoginHib loginHib=new LoginHib (0,"Hamit","Mýzrak","hamitmizrak@gmail.com","123","55544422" );
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory ( PersistenceUtil.persistenceUtilName );
		EntityManager entityManager=entityManagerFactory.createEntityManager ( );
		
		entityManager.getTransaction ( ).begin ( );
		entityManager.persist ( loginHib );
		entityManager.getTransaction ( ).commit ( );
		entityManager.close ( );
		System.out.println ( "Baþarýlý bir þekilde eklendi" );
	}
}
