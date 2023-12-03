import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.archerygear.entities.Bow;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

class BowTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	
	@BeforeEach
	void setUp() throws Exception {
	    em = emf.createEntityManager();
	}

	@AfterEach
	void tearDown() throws Exception {
	    emf.close();
	}

	@Test
	void test_find_bow() {
		Bow bow = em.find(Bow.class, 1);
		assertNotNull(bow);
		assertEquals("compound", bow.getTypeOfBow());

	}
	
	@Test
	void test_update_bow() {
		Bow bow = em.find(Bow.class, 1);
		assertNotNull(bow);
		assertEquals("compound", bow.getTypeOfBow());
	}
}
