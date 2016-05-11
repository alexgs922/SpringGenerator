package converters;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import services.WorkService;

import domain.Work;


@Component
@Transactional
public class StringToWorkConverter implements Converter<String,Work>{
	
	@Autowired
	WorkService workService;

	@Override
	public Work convert(String text) {
		Work result;
		int id;

		try {
			id = Integer.valueOf(text);
			result = workService.findOne(id);
		} catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}

}