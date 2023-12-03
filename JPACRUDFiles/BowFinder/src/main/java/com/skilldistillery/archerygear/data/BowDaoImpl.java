package com.skilldistillery.archerygear.data;

import com.skilldistillery.archerygear.entities.Bow;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class BowDaoImpl implements BowDAO {
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
	
	
}
