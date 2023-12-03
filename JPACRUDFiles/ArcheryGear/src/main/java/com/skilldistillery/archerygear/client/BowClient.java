package com.skilldistillery.archerygear.client;

import com.skilldistillery.archerygear.entities.Bow;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class BowClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ArcheryGear");
		EntityManager em = emf.createEntityManager();
		
		Bow bow = em.find(Bow.class, 1);
		
	    em.close();
	    emf.close();
	}

}
