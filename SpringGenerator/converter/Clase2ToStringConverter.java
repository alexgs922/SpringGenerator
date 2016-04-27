package converters;

import javax.transaction.Transactional;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import domain.Clase2;

@Component
@Transactional
public class Clase2ToStringConverter implements Converter<Clase2, String>{

	@Override
	public String convert(Clase2 ap) {
		String result;

		if (ap == null)
			result = null;
		else
			result = String.valueOf(ap.getId());
		return result;
	}

}