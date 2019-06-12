package DAO;

import java.util.List;

import javax.persistence.*;

import application.Context;
import metier.Maison;

public class DAOMaison {

	public void insert(Maison object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(object);

		em.getTransaction().commit();
		em.close();
	}


	public Maison selectById(Integer id) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Maison s = em.find(Maison.class, id);
		em.close();
		return s;
	}
	
	public Maison selectByName(String nom) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Maison s = em.find(Maison.class, nom);
		em.close();
		return s;
	}

	public void update(Maison object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.merge(object);

		em.getTransaction().commit();
		em.close();
	}

	public void delete(Maison object) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.remove(object);

		em.getTransaction().commit();
		em.close();
	}


	public List<Maison> selectAll() {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("from Maison");
		List<Maison> liste = query.getResultList();
		em.close();
		return liste;
	}

}



