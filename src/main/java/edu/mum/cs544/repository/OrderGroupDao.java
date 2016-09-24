package edu.mum.cs544.repository;
// Generated Sep 23, 2016 11:52:01 AM by Hibernate Tools 5.1.0.Beta1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class OrderGroup.
 * @see edu.mum.cs544.repository.OrderGroup
 * @author Hibernate Tools
 */
@Stateless
public class OrderGroupHome {

	private static final Log log = LogFactory.getLog(OrderGroupHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(OrderGroup transientInstance) {
		log.debug("persisting OrderGroup instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(OrderGroup persistentInstance) {
		log.debug("removing OrderGroup instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public OrderGroup merge(OrderGroup detachedInstance) {
		log.debug("merging OrderGroup instance");
		try {
			OrderGroup result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public OrderGroup findById(Integer id) {
		log.debug("getting OrderGroup instance with id: " + id);
		try {
			OrderGroup instance = entityManager.find(OrderGroup.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
