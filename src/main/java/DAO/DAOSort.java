package DAO;

import java.util.List;

import javax.persistence.*;

import application.Context;
import metier.*;

public class DAOSort implements DAO<Sort, Integer> {

	public void insert(Sort object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(object);

		em.getTransaction().commit();

		em.close();
	}

	public Sort selectById(Integer id) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Sort s = em.find(Sort.class, id);
		em.close();
		return s;
	}

	public void update(Sort object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.merge(object);

		em.getTransaction().commit();

		em.close();
	}

	public void delete(Sort object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.remove(object);

		em.getTransaction().commit();

		em.close();
	}

	public List<Sort> selectAll() {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		Query query= em.createQuery("from Sort");
		
		List<Sort> liste = query.getResultList();

		em.close();
		return liste;
	}
	
	

}
