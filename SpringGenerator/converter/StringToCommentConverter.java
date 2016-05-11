package converters;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import services.CommentService;

import domain.Comment;


@Component
@Transactional
public class StringToCommentConverter implements Converter<String,Comment>{
	
	@Autowired
	CommentService commentService;

	@Override
	public Comment convert(String text) {
		Comment result;
		int id;

		try {
			id = Integer.valueOf(text);
			result = commentService.findOne(id);
		} catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}

}