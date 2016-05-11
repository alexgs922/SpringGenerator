package converters;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import services.ActorService;

import domain.Actor;


@Component
@Transactional
public class StringToActorConverter implements Converter<String,Actor>{
	
	@Autowired
	ActorService actorService;

	@Override
	public Actor convert(String text) {
		Actor result;
		int id;

		try {
			id = Integer.valueOf(text);
			result = actorService.findOne(id);
		} catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}

}