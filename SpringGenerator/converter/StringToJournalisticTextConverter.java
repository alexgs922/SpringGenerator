package converters;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import services.JournalisticTextService;

import domain.JournalisticText;


@Component
@Transactional
public class StringToJournalisticTextConverter implements Converter<String,JournalisticText>{
	
	@Autowired
	JournalisticTextService journalistictextService;

	@Override
	public JournalisticText convert(String text) {
		JournalisticText result;
		int id;

		try {
			id = Integer.valueOf(text);
			result = journalistictextService.findOne(id);
		} catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}

}