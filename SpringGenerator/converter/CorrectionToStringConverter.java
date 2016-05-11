package converters;

import javax.transaction.Transactional;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import domain.Correction;

@Component
@Transactional
public class CorrectionToStringConverter implements Converter<Correction, String>{

	@Override
	public String convert(Correction ap) {
		String result;

		if (ap == null)
			result = null;
		else
			result = String.valueOf(ap.getId());
		return result;
	}

}