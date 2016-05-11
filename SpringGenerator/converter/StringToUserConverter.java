package converters;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import services.UserService;

import domain.User;


@Component
@Transactional
public class StringToUserConverter implements Converter<String,User>{
	
	@Autowired
	UserService userService;

	@Override
	public User convert(String text) {
		User result;
		int id;

		try {
			id = Integer.valueOf(text);
			result = userService.findOne(id);
		} catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}

}