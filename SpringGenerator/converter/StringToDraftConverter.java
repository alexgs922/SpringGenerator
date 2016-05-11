package converters;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import services.DraftService;

import domain.Draft;


@Component
@Transactional
public class StringToDraftConverter implements Converter<String,Draft>{
	
	@Autowired
	DraftService draftService;

	@Override
	public Draft convert(String text) {
		Draft result;
		int id;

		try {
			id = Integer.valueOf(text);
			result = draftService.findOne(id);
		} catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}

}