package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.WriterRepository;
import domain.Writer;

@Service
@Transactional
public class WriterService {
	@Autowired
	private WriterRepository writerRepository;

	public Writer findOne(int id) {
		return writerRepository.findOne(id);
	}

	public void save(Writer a) {
		Assert.notNull(a);
		writerRepository.save(a);
	}

	public Collection<Writer> findAll() {
		return writerRepository.findAll();
	}


	public void delete(Writer writer) {
		Assert.notNull(writer);
		writerRepository.delete(writer);

	}

}