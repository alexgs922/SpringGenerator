package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.NewsRepository;
import domain.News;

@Service
@Transactional
public class NewsService {
	@Autowired
	private NewsRepository newsRepository;

	public News findOne(int id) {
		return newsRepository.findOne(id);
	}

	public void save(News a) {
		Assert.notNull(a);
		newsRepository.save(a);
	}

	public Collection<News> findAll() {
		return newsRepository.findAll();
	}


	public void delete(News news) {
		Assert.notNull(news);
		newsRepository.delete(news);

	}

}