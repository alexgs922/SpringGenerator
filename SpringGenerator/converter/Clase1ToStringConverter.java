package converters;

import javax.transaction.Transactional;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import domain.Clase1;

@Component
@Transactional
public class Clase1ToStringConverter implements Converter<Clase1, String>{

	@Override
	public String convert(Clase1 ap) {
		String result;

		if (ap == null)
			result = null;
		else
			result = String.valueOf(ap.getId());
		return result;
	}

}