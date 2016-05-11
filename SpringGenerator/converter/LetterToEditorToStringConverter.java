package converters;

import javax.transaction.Transactional;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import domain.LetterToEditor;

@Component
@Transactional
public class LetterToEditorToStringConverter implements Converter<LetterToEditor, String>{

	@Override
	public String convert(LetterToEditor ap) {
		String result;

		if (ap == null)
			result = null;
		else
			result = String.valueOf(ap.getId());
		return result;
	}

}