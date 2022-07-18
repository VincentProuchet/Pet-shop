package diginamic.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author Vincent
 *
 */
@Entity
public class Cat extends Animal {

/** chipId */
	@Column (name = "chip_id")
private String chipId;


/** Constructeur
 * 
 */
public Cat() {
	
}

/** Constructeur
 * @param birth
 * @param couleur
 * @param petStore
 * @param chipId
 */
public Cat(LocalDate birth, String couleur,String chipId) {
	super(birth, couleur);
	this.chipId = chipId;
}

/** Getter
 * @return the chipId
 */
public String getChipId() {
	return chipId;
}

/** Setter
 * @param chipId the chipId to set
 */
public void setChipId(String chipId) {
	this.chipId = chipId;
} 



}
