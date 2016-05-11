package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.ArticleRepository;
import domain.Article;

@Service
@Transactional
public class ArticleService {
	@Autowired
	private ArticleRepository articleRepository;

	public Article findOne(int id) {
		return articleRepository.findOne(id);
	}

	public void save(Article a) {
		Assert.notNull(a);
		articleRepository.save(a);
	}

	public Collection<Article> findAll() {
		return articleRepository.findAll();
	}


	public void delete(Article article) {
		Assert.notNull(article);
		articleRepository.delete(article);

	}

}