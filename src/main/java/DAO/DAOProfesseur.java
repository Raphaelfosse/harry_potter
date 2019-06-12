package DAO;

import java.util.List;

import javax.persistence.*;

import application.Context;
import metier.*;

public class DAOProfesseur implements DAO<Professeur, Integer> {
	
	public void insert(Professeur object) {
		EntityManagerFactory emf =Context.getInstance().getEmf();
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(object);
		
		em.getTransaction().commit();
		
		em.close();
	}

	public Professeur selectById(Integer id) {
		EntityManagerFactory emf =Context.getInstance().getEmf();
		EntityManager em=emf.createEntityManager();
		
		Professeur p= em.find(Professeur.class, id);
		
		em.close();
		
		return p;
	}

	public void update(Professeur object) {
		EntityManagerFactory emf =Context.getInstance().getEmf();
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.merge(object);
		
		em.getTransaction().commit();
		
		em.close();
	}

	public void delete(Professeur object) {
		EntityManagerFactory emf =Context.getInstance().getEmf();
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.remove(object);
		
		em.getTransaction().commit();
		
		em.close();
	}

	public List<Professeur> selectAll() {
		EntityManagerFactory emf =Context.getInstance().getEmf();
		EntityManager em=emf.createEntityManager();
		
		
		Query query = em.createQuery("from Professeur");
		List<Professeur> liste = query.getResultList();
		
		em.close();
		
		return liste;
	}

}
