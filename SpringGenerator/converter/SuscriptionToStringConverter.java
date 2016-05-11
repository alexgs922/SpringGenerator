package converters;

import javax.transaction.Transactional;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import domain.Suscription;

@Component
@Transactional
public class SuscriptionToStringConverter implements Converter<Suscription, String>{

	@Override
	public String convert(Suscription ap) {
		String result;

		if (ap == null)
			result = null;
		else
			result = String.valueOf(ap.getId());
		return result;
	}

}