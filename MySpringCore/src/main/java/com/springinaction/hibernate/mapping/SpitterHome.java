package com.springinaction.hibernate.mapping;

// Generated May 4, 2013 10:17:37 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Spitter.
 * @see com.springinaction.hibernate.mapping.Spitter
 * @author Hibernate Tools
 */
public class SpitterHome {

	private static final Log log = LogFactory.getLog(SpitterHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Spitter transientInstance) {
		log.debug("persisting Spitter instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Spitter instance) {
		log.debug("attaching dirty Spitter instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Spitter instance) {
		log.debug("attaching clean Spitter instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Spitter persistentInstance) {
		log.debug("deleting Spitter instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Spitter merge(Spitter detachedInstance) {
		log.debug("merging Spitter instance");
		try {
			Spitter result = (Spitter) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Spitter findById(int id) {
		log.debug("getting Spitter instance with id: " + id);
		try {
			Spitter instance = (Spitter) sessionFactory.getCurrentSession()
					.get("com.springinaction.hibernate.mapping.Spitter", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Spitter> findByExample(Spitter instance) {
		log.debug("finding Spitter instance by example");
		try {
			List<Spitter> results = (List<Spitter>) sessionFactory
					.getCurrentSession()
					.createCriteria(
							"com.springinaction.hibernate.mapping.Spitter")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
