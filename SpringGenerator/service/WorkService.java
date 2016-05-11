package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.WorkRepository;
import domain.Work;

@Service
@Transactional
public class WorkService {
	@Autowired
	private WorkRepository workRepository;

	public Work findOne(int id) {
		return workRepository.findOne(id);
	}

	public void save(Work a) {
		Assert.notNull(a);
		workRepository.save(a);
	}

	public Collection<Work> findAll() {
		return workRepository.findAll();
	}


	public void delete(Work work) {
		Assert.notNull(work);
		workRepository.delete(work);

	}

}