/**
 * 
 */
package com.restfully.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author vpsrini
 *
 */

public class HibernateSessionBuilder {
	
	private static SessionFactory sessionFactory = null;
	
	@PostConstruct
	public static void buildSessionFactory(){
		if(sessionFactory == null || sessionFactory.isClosed()){
			sessionFactory = new Configuration().configure().buildSessionFactory();
			System.out.println("Hibernate Session Factory built successfully.");
		}
	}
	
	@PreDestroy
	public static void close(){
		if(sessionFactory != null && !sessionFactory.isClosed()){
			sessionFactory.close();
			System.out.println("Hibernate Session Factory closed successfully.");
		}
	}
	
	public Session getSession(){
		return sessionFactory.openSession();
	}
	
	public void closeSession(Session session){
		if(session != null && session.isOpen()){
			session.close();
		}
	}
	
	

}
