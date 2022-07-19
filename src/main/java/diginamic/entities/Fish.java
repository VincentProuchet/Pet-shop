package diginamic.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import diginamic.entities.enumeration.FishLivEnv;
import net.bytebuddy.implementation.bind.annotation.Super;

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
	public String toString() {
		return new StringBuilder(super.toString())
				
				.append("\t").append(this.livingEnv.getName())
				.toString();
		}

	 
}