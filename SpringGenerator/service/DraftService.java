package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.DraftRepository;
import domain.Draft;

@Service
@Transactional
public class DraftService {
	@Autowired
	private DraftRepository draftRepository;

	public Draft findOne(int id) {
		return draftRepository.findOne(id);
	}

	public void save(Draft a) {
		Assert.notNull(a);
		draftRepository.save(a);
	}

	public Collection<Draft> findAll() {
		return draftRepository.findAll();
	}


	public void delete(Draft draft) {
		Assert.notNull(draft);
		draftRepository.delete(draft);

	}

}