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
		// TODO Auto-generated method stub
		return null;
	}

	public java.util.List<Bow> findAll() {
		String jpql = "Select bow FROM Bow bow";
		return em.createQuery(jpql, Bow.class).getResultList();
	}
	
	public Bow update(int bowInt, Bow bow) {
		return null;
	}

	public boolean deleteById(int bowId) {
		return false;
	}
	
}
