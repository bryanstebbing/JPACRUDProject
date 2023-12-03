package com.skilldistillery.archerygear.client;

import java.util.List;

import com.skilldistillery.archerygear.entities.Bow;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPQLClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ArcheryGear");
		EntityManager em = emf.createEntityManager();
		
		String queryString = "SELECT bow FROM Bow bow";
		List<Bow> results = em.createQuery(queryString, Bow.class).getResultList();
		
	    em.close();
	    emf.close();
	}

}
