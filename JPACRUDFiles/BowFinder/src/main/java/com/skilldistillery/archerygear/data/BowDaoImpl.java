package com.skilldistillery.archerygear.data;

import org.springframework.stereotype.Service;

import com.skilldistillery.archerygear.entities.Bow;
import java.lang.String;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class BowDaoImpl implements BowDAO {

	@PersistenceContext
	private EntityManager em;
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ArcheryGear");

	public void launch() {
//		create(null);
	}

	public Bow create(Bow bow) {
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(bow);
		em.flush();
		em.getTransaction().commit();
		return bow;
	}

	public void updateBow() {
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Bow detachedBow = new Bow();

		Bow managedBow = em.find(Bow.class, 1);

		detachedBow.setTypeOfBow("Nope");
		detachedBow.setName("Not Gonna Happen");
		detachedBow.setWeightOfPull(3);
		detachedBow.setWeightOfBow(4);

		managedBow.setTypeOfBow("Nope");
		managedBow.setName("Not Gonna Happen");
		managedBow.setWeightOfPull(3);
		managedBow.setWeightOfBow(4);

		em.getTransaction().commit();
	}

	public Bow findByInt(int bowId) {
		return em.find(Bow.class, bowId);
	}

	public java.util.List<Bow> findAll() {
		String jpql = "Select bow FROM Bow bow";
		return em.createQuery(jpql, Bow.class).getResultList();
	}

	public Bow update(int bowInt, Bow updatedBow) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Bow managedBow = em.find(Bow.class, bowInt);

		if (managedBow != null) {
			managedBow.setTypeOfBow(updatedBow.getTypeOfBow());
			managedBow.setName(updatedBow.getName());
			managedBow.setWeightOfPull(updatedBow.getWeightOfPull());
			managedBow.setWeightOfBow(updatedBow.getWeightOfBow());

			em.getTransaction().commit();
			return managedBow;
		} else {
			return null;
		}
	}

	public boolean deleteById(int bowId) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Bow bowToDelete = em.find(Bow.class, bowId);

		if (bowToDelete != null) {
			em.remove(bowToDelete);
			em.getTransaction().commit();
			return true;
		} else {
			em.getTransaction().commit();
			return false;
		}
	}

}
