package converters;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import services.SuscriptionService;

import domain.Suscription;


@Component
@Transactional
public class StringToSuscriptionConverter implements Converter<String,Suscription>{
	
	@Autowired
	SuscriptionService suscriptionService;

	@Override
	public Suscription convert(String text) {
		Suscription result;
		int id;

		try {
			id = Integer.valueOf(text);
			result = suscriptionService.findOne(id);
		} catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}

}