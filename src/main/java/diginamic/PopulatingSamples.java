package diginamic;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import diginamic.entities.Address;
import diginamic.entities.Cat;
import diginamic.entities.Fish;
import diginamic.entities.PetStore;
import diginamic.entities.Product;
import diginamic.entities.enumeration.FishLivEnv;
import diginamic.entities.enumeration.ProdType;

public class PopulatingSamples {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_petstore");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		PetStore store1 = new PetStore("Los paraios", "Pratt");
		em.persist(store1);
		PetStore store2 = new PetStore("Au bon poil", "Roger");
		em.persist(store2);
		PetStore store3 = new PetStore("Au gros poil", "Hubert");
		em.persist(store3);
		
		store1.setAddress(new Address(2,"rue du labrador", "34500", "Béziers"));
		store3.setAddress(new Address(2,"Avenue du Général De Gaule", "34600", "Bédarieux"));
		store2.setAddress(new Address(18,"Passage du get","999","Paradis"));
		
		Product Produit1 = new Product("1234567891230", "Brosse pour Chien", ProdType.CLEANING, 15.5);				
		Product Produit2 = new Product("1234567845230", "Nourriture pour Chien Sac 2kg", ProdType.FOOD, 5.0);
		Product Produit3 = new Product("0000567845230", "Nourriture pour Chien Sac 4kg", ProdType.FOOD, 10.0);
		Product Produit4 = new Product("1200567845230", "Jouet pour Chien ", ProdType.ACCESSORY, 5.0);
		Product Produit5 = new Product("1234567845230", "Nourriture pour Chat Sac 2kg", ProdType.FOOD, 5.0);
		Product Produit6 = new Product("1234567845230", "Brosse pour Chat ", ProdType.CLEANING, 7.25);
		
		store1.setProducts(Produit1);
		store1.setProducts(Produit2);
		store1.setProducts(Produit3);
		
		store3.setProducts(Produit1);
		store3.setProducts(Produit2);
		store3.setProducts(Produit3);
		store3.setProducts(Produit4);
		
		store2.setProducts(Produit5);
		store2.setProducts(Produit6);
		
		
		store1.setAnimals(new Cat(LocalDate.of(2022, 01,1),		"gris", 	"0001354674812"));
		store1.setAnimals(new Cat(LocalDate.of(2022, 02,9),		"blanc",	"00655555474812"));
		store1.setAnimals(new Cat(LocalDate.of(2022, 02,4),		"noir",		"00018766654812"));
		store1.setAnimals(new Cat(LocalDate.of(2022, 04,7),		"gris",		"0001354674812"));
		store1.setAnimals(new Cat(LocalDate.of(2022, 05,11),	"blanc",	"00655555474812"));
		store3.setAnimals(new Cat(LocalDate.of(2022, 05,11),	"blanc",	"00655555474812"));
		store3.setAnimals(new Cat(LocalDate.of(2022, 05,11),	"gris",		"00655854364812"));
		store3.setAnimals(new Cat(LocalDate.of(2022, 05,11),	"blanc",	"04787676474812"));
		store3.setAnimals(new Cat(LocalDate.of(2022, 04,10),	"noir",		"45718766654748"));
		store2.setAnimals(new Fish(LocalDate.of(2022, 04,10),	"noir",			FishLivEnv.SEA_WATER));
		store2.setAnimals(new Fish(LocalDate.of(2022, 06,02),	"rouge",		FishLivEnv.FRESH_WATER));
		store2.setAnimals(new Fish(LocalDate.of(2022, 05,12),	"rouge",		FishLivEnv.SEA_WATER));
		store2.setAnimals(new Fish(LocalDate.of(2021, 10,14),	"blanc",		FishLivEnv.FRESH_WATER));
		
		
		
		
		
		
		
		
		
		
		
		
		
		transaction.commit();
		em.close();
		emf.close();
		

	}

}
