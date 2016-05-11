package converters;

import javax.transaction.Transactional;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import domain.Editor;

@Component
@Transactional
public class EditorToStringConverter implements Converter<Editor, String>{

	@Override
	public String convert(Editor ap) {
		String result;

		if (ap == null)
			result = null;
		else
			result = String.valueOf(ap.getId());
		return result;
	}

}