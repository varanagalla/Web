/**
 * 
 */
package com.springinaction.db.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springinaction.db.SpitterDAO;
import com.springinaction.hibernate.mapping.Spitter;

/**
 * @author Sysadmin
 *
 */
@Transactional
@Repository()
public class HibernateSpitterDAO implements SpitterDAO{
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public HibernateSpitterDAO(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	private Session currentSession(){
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public void addSpitter(Spitter spitter) {
		this.currentSession().save(spitter);
	}

	@Override
	public Spitter getSpitterById(Integer id) {
		return (Spitter)this.currentSession().get(Spitter.class, id);	
	}
	
	public void updateSpitter(Spitter spitter){
		currentSession().update(spitter);
	}

}
