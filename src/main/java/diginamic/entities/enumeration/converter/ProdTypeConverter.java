package diginamic.entities.enumeration.converter;

import javax.persistence.AttributeConverter;

import diginamic.entities.enumeration.ProdType;

public class ProdTypeConverter implements AttributeConverter<ProdType, String> {

	@Override
	public String convertToDatabaseColumn(ProdType attribute) {
		if (attribute == null) {
			return null;
		}
		return attribute.getName();
	}

	@Override
	public ProdType convertToEntityAttribute(String dbData) {
		if (dbData == null) {
			return null;
		}
		return ProdType.valueOf(dbData);
	}

}
