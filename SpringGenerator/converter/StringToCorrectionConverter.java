package converters;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import services.CorrectionService;

import domain.Correction;


@Component
@Transactional
public class StringToCorrectionConverter implements Converter<String,Correction>{
	
	@Autowired
	CorrectionService correctionService;

	@Override
	public Correction convert(String text) {
		Correction result;
		int id;

		try {
			id = Integer.valueOf(text);
			result = correctionService.findOne(id);
		} catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}

}