package diginamic.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

/**
 * @author Vincent
 *
*/

@Entity
@Inheritance (strategy = InheritanceType.JOINED)
public class  Animal implements Serializable {

	/** id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/** birth */
	private LocalDate birth;
	/** couleur */
	@Column(length = 15)
	private String couleur;

	@ManyToOne
	private PetStore petStore;

	/**
	 * Constructeur
	 * 
	 */
	public Animal() {

	}
	

	/** Constructeur
	 * @param birth
	 * @param couleur
	 * @param petStore
	 */
	public Animal(LocalDate birth, String couleur) {
		super();
		this.birth = birth;
		this.couleur = couleur;
	}


	/**
	 * Getter
	 * 
	 * @return the birth
	 */
	public LocalDate getBirth() {
		return birth;
	}

	/**
	 * Getter
	 * 
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * Setter
	 * 
	 * @param birth the birth to set
	 */
	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	/**
	 * Setter
	 * 
	 * @param couleur the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Getter
	 * 
	 * @return the petStore
	 */
	public PetStore getPetStore() {
		return petStore;
	}

	/**
	 * Setter
	 * 
	 * @param petStore the petStore to set
	 */
	public void setPetStore(PetStore petStore) {
		// si l'annimal a déjà un store
		if (this.petStore != null) {
			// on demande a l'ancien petStore de le retirer
			this.petStore.getAnimals().remove(this);
		}
		// puis on assigne le nouveau petStrore à l'animal
		this.petStore = petStore;
		// et si le petstore n'est pas nul
		if (this.petStore != null) {
			// on demande nouveau au petStore d'ajouter l'animal à sa liste
			this.petStore.getAnimals().add(this);
		}
	}

}
