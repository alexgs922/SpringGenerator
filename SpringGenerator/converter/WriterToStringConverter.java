package converters;

import javax.transaction.Transactional;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import domain.Writer;

@Component
@Transactional
public class WriterToStringConverter implements Converter<Writer, String>{

	@Override
	public String convert(Writer ap) {
		String result;

		if (ap == null)
			result = null;
		else
			result = String.valueOf(ap.getId());
		return result;
	}

}