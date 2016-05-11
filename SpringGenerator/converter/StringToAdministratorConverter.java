package converters;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import services.AdministratorService;

import domain.Administrator;


@Component
@Transactional
public class StringToAdministratorConverter implements Converter<String,Administrator>{
	
	@Autowired
	AdministratorService administratorService;

	@Override
	public Administrator convert(String text) {
		Administrator result;
		int id;

		try {
			id = Integer.valueOf(text);
			result = administratorService.findOne(id);
		} catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}

}