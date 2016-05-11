package converters;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import services.EditorService;

import domain.Editor;


@Component
@Transactional
public class StringToEditorConverter implements Converter<String,Editor>{
	
	@Autowired
	EditorService editorService;

	@Override
	public Editor convert(String text) {
		Editor result;
		int id;

		try {
			id = Integer.valueOf(text);
			result = editorService.findOne(id);
		} catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}

}