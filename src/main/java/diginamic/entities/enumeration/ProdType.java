package diginamic.entities.enumeration;

/**
 * @author Vincent
 *
 */
/**
 * @author Vincent
 *
 */

public enum ProdType {
/** FOOD */
FOOD("food"),
/** ACCESSORY */
ACCESSORY("accessory"),
/** CLEANING */
CLEANING("cleanning");
	
	private String name;
	
	/** Constructeur
	 * 
	 */
	ProdType() {
	}
	
	
	private ProdType(String name) {
		this.name = name;
	}

	/** Getter
	 * @return the libelle
	 */
	public String getName() {
		return name;
	}
	
	
}
