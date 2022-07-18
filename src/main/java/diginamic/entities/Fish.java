package diginamic.entities;

import java.time.LocalDate;

import javax.persistence.Column;
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
	@Column(name = "living_env",nullable = false)
	private FishLivEnv livingEnv = FishLivEnv.FRESH_WATER;

	/**
	 * Constructeur
	 * 
	 */
	public Fish() {

	}
	

	/** Constructeur
	 * @param birth
	 * @param couleur
	 * @param petStore
	 * @param env
	 */
	public Fish(LocalDate birth, String couleur, FishLivEnv env) {
		super(birth, couleur);
		this.livingEnv = env;
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
