package DAO;

import java.util.List;

import javax.persistence.*;

import application.Context;
import metier.*;

public class DAOEleve implements DAO<Eleve, Integer> {

	public void insert(Eleve object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(object);

		em.getTransaction().commit();

		em.close();
	}

	public Eleve selectById(Integer id) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Eleve e = em.find(Eleve.class, id);
		em.close();
		return e;
	}

	public void update(Eleve object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.merge(object);

		em.getTransaction().commit();

		em.close();
	}

	public void delete(Eleve object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.remove(object);

		em.getTransaction().commit();

		em.close();

	}

	public List<Eleve> selectAll() {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		Query query= em.createQuery("from Eleve");
		
		List<Eleve> liste = query.getResultList();

		em.close();
		return liste;
	}
	
	public List<Eleve> selectAllWithMatiere() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("maBase");
		EntityManager em = emf.createEntityManager();
		
		
		Query query = em.createNamedQuery("Eleve.findWithMatiere", Eleve.class);
		List<Eleve> liste = query.getResultList(); 
		
		em.close();
		return liste;
	}
	
	

}
