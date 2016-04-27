package converters;

import javax.transaction.Transactional;

import org.springframework.beans.fclase1y.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import services.Clase1Service;

import domain.Clase1;


@Component
@Transactional
public class StringToClase1Converter implements Converter<String,Clase1>{
	
	@Autowired
	Clase1Service clase1Service;

	@Override
	public Clase1 convert(String text) {
		Clase1 result;
		int id;

		try {
			id = Integer.valueOf(text);
			result = clase1Service.findOne(id);
		} catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}

}