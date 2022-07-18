package diginamic.entities.enumeration;

import javax.persistence.Column;

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

}