package converters;

import javax.transaction.Transactional;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import domain.Draft;

@Component
@Transactional
public class DraftToStringConverter implements Converter<Draft, String>{

	@Override
	public String convert(Draft ap) {
		String result;

		if (ap == null)
			result = null;
		else
			result = String.valueOf(ap.getId());
		return result;
	}

}