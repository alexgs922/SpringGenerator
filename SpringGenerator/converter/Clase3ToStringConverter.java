package converters;

import javax.transaction.Transactional;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import domain.Clase3;

@Component
@Transactional
public class Clase3ToStringConverter implements Converter<Clase3, String>{

	@Override
	public String convert(Clase3 ap) {
		String result;

		if (ap == null)
			result = null;
		else
			result = String.valueOf(ap.getId());
		return result;
	}

}