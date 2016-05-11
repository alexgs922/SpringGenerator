package converters;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import services.ArticleService;

import domain.Article;


@Component
@Transactional
public class StringToArticleConverter implements Converter<String,Article>{
	
	@Autowired
	ArticleService articleService;

	@Override
	public Article convert(String text) {
		Article result;
		int id;

		try {
			id = Integer.valueOf(text);
			result = articleService.findOne(id);
		} catch (Throwable oops) {
			throw new IllegalArgumentException(oops);
		}

		return result;
	}

}