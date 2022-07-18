package diginamic;

import static org.junit.Assert.assertTrue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void TestConnection() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_petstore");
		EntityManager em = emf.createEntityManager();
		assertTrue(em.isOpen());
		emf.close();
		em.close();
	}
}
