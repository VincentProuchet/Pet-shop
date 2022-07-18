package diginamic.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import diginamic.entities.enumeration.FishLivEnv;

/**
 * @author Vincent
 *
 */
@Entity
public class Fish extends Animal {

	/** livingEnv */
	private FishLivEnv livingEnv = FishLivEnv.FRESH_WATER;

	/**
	 * Constructeur
	 * 
	 */
	public Fish() {

	}

	/**
	 * Getter
	 * 
	 * @return the livingEnv
	 */
	public FishLivEnv getLivingEnv() {
		return livingEnv;
	}

	/**
	 * Setter
	 * 
	 * @param livingEnv the livingEnv to set
	 */
	public void setLivingEnv(FishLivEnv livingEnv) {
		this.livingEnv = livingEnv;
	}

}
