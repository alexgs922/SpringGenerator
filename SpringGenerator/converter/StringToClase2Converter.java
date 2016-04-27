package converters;

import javax.transaction.Transactional;

import org.springframework.beans.fclase2y.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import services.Clase2Service;

import domain.Clase2;


@Component
@Transactional
public class StringToClase2Converter implements Converter<String,Clase2>{
	
	@Autowired
	Clase2Service clase2Service;

	@Override
	public Clase2 convert(String text) {
		Clase2 result;
		int id;

		try {
			id = Integer.valueOf(text);
			result = clase2Service.findOne(id);
		} catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}

}