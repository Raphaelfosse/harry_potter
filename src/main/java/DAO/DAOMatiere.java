package DAO;

import java.util.List;
import javax.persistence.*;
import javax.persistence.Persistence;
import metier.Matiere;


import application.Context;


public class DAOMatiere implements DAO<Matiere, Integer> {

	@Override
	public void insert(Matiere object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(object);

		em.getTransaction().commit();
		em.close();
	}

	@Override
	public Matiere selectById(Integer id) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Matiere s = em.find(Matiere.class, id);
		em.close();
		return s;
	}

	@Override
	public void update(Matiere object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.merge(object);

		em.getTransaction().commit();
		em.close();

	}

	@Override
	public void delete(Matiere object) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.remove(object);

		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<Matiere> selectAll() {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("from Matiere");
		List<Matiere> liste = query.getResultList();
		em.close();
		return liste;
	}

}
