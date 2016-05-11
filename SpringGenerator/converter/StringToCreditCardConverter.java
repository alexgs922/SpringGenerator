package converters;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import services.CreditCardService;

import domain.CreditCard;


@Component
@Transactional
public class StringToCreditCardConverter implements Converter<String,CreditCard>{
	
	@Autowired
	CreditCardService creditcardService;

	@Override
	public CreditCard convert(String text) {
		CreditCard result;
		int id;

		try {
			id = Integer.valueOf(text);
			result = creditcardService.findOne(id);
		} catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}

}