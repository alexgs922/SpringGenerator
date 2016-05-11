package converters;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import services.WriterService;

import domain.Writer;


@Component
@Transactional
public class StringToWriterConverter implements Converter<String,Writer>{
	
	@Autowired
	WriterService writerService;

	@Override
	public Writer convert(String text) {
		Writer result;
		int id;

		try {
			id = Integer.valueOf(text);
			result = writerService.findOne(id);
		} catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}

}