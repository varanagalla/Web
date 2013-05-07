/**
 * 
 */
package com.restfully.dao;

import org.hibernate.Session;

import com.restfully.startup.AppStartup;

/**
 * @author vpsrini
 *
 */

public class HibernateSessionBuilder {
	
	public Session getSession(){
		return AppStartup.getSessionFactory().openSession();
	}
	
	public void closeSession(Session session){
		if(session != null && session.isOpen()){
			session.clear();
			session.close();
		}
	}
	
	

}
