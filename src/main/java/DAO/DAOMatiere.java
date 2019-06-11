package DAO;

import java.util.List;
import javax.persistence.*;
import javax.persistence.Persistence;
import metier.Matiere;;

public class DAOMatiere implements DAO<Matiere, Integer> {

	@Override
	public void insert(Matiere object) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hp");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(object);

		em.getTransaction().commit();
		em.close();
		Context.getInstance().destroy();
	}

	@Override
	public Matiere selectById(Integer id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hp");
		EntityManager em = emf.createEntityManager();

		Matiere s = em.find(Matiere.class, id);
		em.close();
		Context.getInstance().destroy();
		return s;
	}

	@Override
	public void update(Matiere object) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hp");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.merge(object);

		em.getTransaction().commit();
		em.close();
		Context.getInstance().destroy();

	}

	@Override
	public void delete(Matiere object) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hp");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.remove(object);

		em.getTransaction().commit();
		em.close();
		Context.getInstance().destroy();
	}

	@Override
	public List<Matiere> selectAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hp");
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("from Matiere");
		List<Matiere> liste = query.getResultList();
		em.close();
		Context.getInstance().destroy();
		return liste;
	}

}
