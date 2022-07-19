package diginamic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import diginamic.entities.Animal;

public class QueryThings {

	public static final String QUERY_ALL_ANIMALS = "SELECT a FROM Animal a JOIN a.petStore p  where p.name LIKE :valeur ";
	public static final String VALEUR_SQL = "valeur";

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_petstore");
		EntityManager em = emf.createEntityManager();

		String PetStoreRecherche = "%" + "Au bon poil" + "%";
		TypedQuery<Animal> animalsQuery = em.createQuery(QUERY_ALL_ANIMALS, Animal.class);
		animalsQuery.setParameter(VALEUR_SQL, PetStoreRecherche);

//		System.out.println(animals.getResultList());
		List<Animal> animals = animalsQuery.getResultList();
		if (animals.size() > 0) {
			for (Animal a : animalsQuery.getResultList()) {
				System.out.println(a.getPetStore().getName() + a.getCouleur());
			}

		}

	}

}
