package converters;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import services.OfferService;

import domain.Offer;


@Component
@Transactional
public class StringToOfferConverter implements Converter<String,Offer>{
	
	@Autowired
	OfferService offerService;

	@Override
	public Offer convert(String text) {
		Offer result;
		int id;

		try {
			id = Integer.valueOf(text);
			result = offerService.findOne(id);
		} catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}

}