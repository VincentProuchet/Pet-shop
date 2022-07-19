package diginamic.entities.enumeration.converter;

import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import diginamic.entities.enumeration.FishLivEnv;

@Converter(autoApply = true)
public class FishLivEnvConverter implements AttributeConverter<FishLivEnv, String> {

	@Override
	public String convertToDatabaseColumn(FishLivEnv attribute) {
		if (attribute == null) {
			return null;
		}
		return attribute.getName();
	}

	@Override
	public FishLivEnv convertToEntityAttribute(String dbData) {
		if (dbData == null) {
			return null;
		}
		return Stream.of(FishLivEnv.values())
				.filter(f->f.getName().equals(dbData)).findFirst()
				.orElseThrow(IllegalArgumentException::new)
				;
	}
	

}
