package converters;

import javax.transaction.Transactional;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import domain.Offer;

@Component
@Transactional
public class OfferToStringConverter implements Converter<Offer, String>{

	@Override
	public String convert(Offer ap) {
		String result;

		if (ap == null)
			result = null;
		else
			result = String.valueOf(ap.getId());
		return result;
	}

}