package diginamic.entities;

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
