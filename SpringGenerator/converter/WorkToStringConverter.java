package converters;

import javax.transaction.Transactional;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import domain.Work;

@Component
@Transactional
public class WorkToStringConverter implements Converter<Work, String>{

	@Override
	public String convert(Work ap) {
		String result;

		if (ap == null)
			result = null;
		else
			result = String.valueOf(ap.getId());
		return result;
	}

}