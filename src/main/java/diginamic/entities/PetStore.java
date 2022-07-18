package diginamic.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author Vincent
 *
 */
@Entity
public class PetStore {
	
	/** id */
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	/** name */
	@Column(length = 50)
	private String name;
	/** managerName */
	@Column (name = "manage_name", length = 50 )
	private String managerName;
	
	
	/** adresse */
	@OneToOne (mappedBy = "store")
	private Address address; 
	
	/** produits */
	@ManyToMany
	private Set<Product> products = new HashSet<>();
	/** animaux */
	@OneToMany (mappedBy = "petStore", cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH} )
	private Set<Animal> animals= new HashSet<>();
	
	/** Constructeur
	 * 
	 */
	public PetStore() {
		
	}

	/** Constructeur
	 * @param name
	 * @param managerName
	 */
	public PetStore(String name, String managerName) {
		super();
		this.name = name;
		this.managerName = managerName;
	}

	/** Constructeur
	 * @param name
	 * @param managerName
	 * @param address
	 */
	public PetStore(String name, String managerName, Address address) {
		super();
		this.name = name;
		this.managerName = managerName;
		this.address = address;
	}

	/** Getter
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/** Getter
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/** Getter
	 * @return the managerName
	 */
	public String getManagerName() {
		return managerName;
	}

	/** Getter
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/** Getter
	 * @return the products
	 */
	public Set<Product> getProducts() {
		return products;
	}

	/** Getter
	 * @return the annimals
	 */
	public Set<Animal> getAnimals() {
		return animals;
	}

	/** Setter
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** Setter
	 * @param managerName the managerName to set
	 */
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	/** Setter
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/** Setter
	 * @param products the products to set
	 */
	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	/** Setter
	 * @param animals the animals to set
	 */
	public void setAnimals(Set<Animal> annimals) {
		this.animals = annimals;
	}
	/** Setter
	 * @param animals the animals to set
	 */
	public void setAnimals(Animal animal) {
		animal.setPetStore(this);
	}
	
}
