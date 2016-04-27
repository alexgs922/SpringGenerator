package converters;

import javax.transaction.Transactional;

import org.springframework.beans.fclase3y.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import services.Clase3Service;

import domain.Clase3;


@Component
@Transactional
public class StringToClase3Converter implements Converter<String,Clase3>{
	
	@Autowired
	Clase3Service clase3Service;

	@Override
	public Clase3 convert(String text) {
		Clase3 result;
		int id;

		try {
			id = Integer.valueOf(text);
			result = clase3Service.findOne(id);
		} catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}

}