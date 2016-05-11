package converters;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import services.NewsService;

import domain.News;


@Component
@Transactional
public class StringToNewsConverter implements Converter<String,News>{
	
	@Autowired
	NewsService newsService;

	@Override
	public News convert(String text) {
		News result;
		int id;

		try {
			id = Integer.valueOf(text);
			result = newsService.findOne(id);
		} catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}

}