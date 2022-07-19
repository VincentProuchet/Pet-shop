package diginamic.entities.enumeration.converter;

import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import diginamic.entities.enumeration.ProdType;
@Converter(autoApply = true)
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
		return Stream.of(ProdType.values())
				.filter(p->p.getName().equals(dbData))
				.findFirst()
				.orElseThrow(IllegalArgumentException::new)
				;
				
				
	}

}
