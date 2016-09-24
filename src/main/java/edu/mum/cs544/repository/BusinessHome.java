package edu.mum.cs544.repository;
// Generated Sep 23, 2016 11:52:01 AM by Hibernate Tools 5.1.0.Beta1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Business.
 * @see edu.mum.cs544.repository.Business
 * @author Hibernate Tools
 */
@Stateless
public class BusinessHome {

	private static final Log log = LogFactory.getLog(BusinessHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Business transientInstance) {
		log.debug("persisting Business instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Business persistentInstance) {
		log.debug("removing Business instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Business merge(Business detachedInstance) {
		log.debug("merging Business instance");
		try {
			Business result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Business findById(Integer id) {
		log.debug("getting Business instance with id: " + id);
		try {
			Business instance = entityManager.find(Business.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
