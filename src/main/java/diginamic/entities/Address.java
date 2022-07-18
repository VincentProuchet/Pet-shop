package diginamic.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author Vincent
 *
 */
/**
 * @author Vincent
 *
 */
@Entity
public class Address {
	/** id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/** number */
	private String number;
	/** street */
	private String street;
	/** zipcode */
	private String zipcode;
	/** city */
	private String city;
	@OneToOne
	private PetStore store;

	/** Constructeur
	 * 
	 */
	public Address() {
		
	}

	public Address(String number, String street, String zipcode, String city) {
		super();
		this.number = number;
		this.street = street;
		this.zipcode = zipcode;
		this.city = city;
	}

	/** Getter
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/** Getter
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/** Getter
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/** Getter
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/** Setter
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/** Setter
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/** Setter
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/** Setter
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
