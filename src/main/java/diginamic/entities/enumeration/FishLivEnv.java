package diginamic.entities.enumeration;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Vincent
 *
 */
public enum FishLivEnv {
	/** FRESH_WATER */
	FRESH_WATER("Eau douce"),
	/** SEA_WATER */
	SEA_WATER("Eau de mer");

	
	/** libelle */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 25)
	private String name;
	

	/** Constructeur
	 * @param libelle
	 */
	FishLivEnv(String libelle){
		this.name = libelle;
		
	}
	/**
	 * Getter
	 * 
	 * @return the libelle
	 */
	public String getName() {
		return name;
	}
	/** Getter
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	

}