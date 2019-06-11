package DAO;

import java.util.List;

import javax.persistence.*;

import application.Context;
import metier.Eleve;

public class DAOEleve implements DAO<Eleve, Integer> {

	public void insert(Eleve object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(object);

		em.getTransaction().commit();

		em.close();
		Context.destroy();
	}

	public Eleve selectById(Integer id) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Eleve e = em.find(Eleve.class, id);
		em.close();
		Context.destroy();
		return e;
	}

	public void update(Eleve object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.merge(object);

		em.getTransaction().commit();

		em.close();
		Context.destroy();

	}

	public void delete(Eleve object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.remove(object);

		em.getTransaction().commit();

		em.close();
		Context.destroy();

	}

	public List<Eleve> selectAll() {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		Query query= em.createQuery("from Eleve");
		
		List<Eleve> liste = query.getResultList();

		em.close();
		Context.destroy();
		return liste;
	}
	
	

}
