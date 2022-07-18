package diginamic.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import diginamic.entities.enumeration.ProdType;

/**
 * @author Vincent
 *
 */
@Entity
public class Product {
	/** id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/** code */
	@Column(length = 13)
	private String code;
	/** label */
	@Column(length = 50)
	private String label;
	/** type */
	private ProdType type;
	/** price */
	private Double price;
	@ManyToMany (mappedBy = "products")
	private Set<PetStore> petStore = new HashSet<PetStore>();
	
	/** Getter
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/** Getter
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/** Getter
	 * @return the type
	 */
	public ProdType getType() {
		return type;
	}

	/** Getter
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/** Setter
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/** Setter
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/** Setter
	 * @param type the type to set
	 */
	public void setType(ProdType type) {
		this.type = type;
	}

	/** Setter
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/** Getter
	 * @return the petStore
	 */
	public Set<PetStore> getPetStore() {
		return petStore;
	}

	/** Setter
	 * @param petStore the petStore to set
	 */
	public void setPetStore(PetStore petStore) {
		this.petStore.add(petStore);
	}
	/** Setter
	 * @param petStore the petStore to set
	 */
	public void remPetStore(PetStore petStore) {
		this.petStore.remove(petStore);
	}


	/** Constructeur
	 * 
	 */
	public Product() {
		super();
	}

	/** Constructeur
	 * @param code
	 * @param label
	 * @param type
	 * @param price
	 */
	public Product(String code, String label, ProdType type, Double price) {
		super();
		this.code = code;
		this.label = label;
		this.type = type;
		this.price = price;
	}
	
	
	
}

