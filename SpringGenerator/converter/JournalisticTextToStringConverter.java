package converters;

import javax.transaction.Transactional;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import domain.JournalisticText;

@Component
@Transactional
public class JournalisticTextToStringConverter implements Converter<JournalisticText, String>{

	@Override
	public String convert(JournalisticText ap) {
		String result;

		if (ap == null)
			result = null;
		else
			result = String.valueOf(ap.getId());
		return result;
	}

}