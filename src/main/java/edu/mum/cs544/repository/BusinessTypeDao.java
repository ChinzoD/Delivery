package edu.mum.cs544.repository;
// Generated Sep 23, 2016 11:52:01 AM by Hibernate Tools 5.1.0.Beta1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class BusinessType.
 * @see edu.mum.cs544.repository.BusinessType
 * @author Hibernate Tools
 */
@Stateless
public class BusinessTypeHome {

	private static final Log log = LogFactory.getLog(BusinessTypeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(BusinessType transientInstance) {
		log.debug("persisting BusinessType instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(BusinessType persistentInstance) {
		log.debug("removing BusinessType instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public BusinessType merge(BusinessType detachedInstance) {
		log.debug("merging BusinessType instance");
		try {
			BusinessType result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BusinessType findById(Integer id) {
		log.debug("getting BusinessType instance with id: " + id);
		try {
			BusinessType instance = entityManager.find(BusinessType.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
