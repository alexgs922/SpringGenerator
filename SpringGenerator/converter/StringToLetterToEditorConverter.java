package converters;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import services.LetterToEditorService;

import domain.LetterToEditor;


@Component
@Transactional
public class StringToLetterToEditorConverter implements Converter<String,LetterToEditor>{
	
	@Autowired
	LetterToEditorService lettertoeditorService;

	@Override
	public LetterToEditor convert(String text) {
		LetterToEditor result;
		int id;

		try {
			id = Integer.valueOf(text);
			result = lettertoeditorService.findOne(id);
		} catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}

}