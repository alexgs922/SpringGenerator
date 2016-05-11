package converters;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import services.SectionService;

import domain.Section;


@Component
@Transactional
public class StringToSectionConverter implements Converter<String,Section>{
	
	@Autowired
	SectionService sectionService;

	@Override
	public Section convert(String text) {
		Section result;
		int id;

		try {
			id = Integer.valueOf(text);
			result = sectionService.findOne(id);
		} catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}

}