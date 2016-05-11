package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.SectionRepository;
import domain.Section;

@Service
@Transactional
public class SectionService {
	@Autowired
	private SectionRepository sectionRepository;

	public Section findOne(int id) {
		return sectionRepository.findOne(id);
	}

	public void save(Section a) {
		Assert.notNull(a);
		sectionRepository.save(a);
	}

	public Collection<Section> findAll() {
		return sectionRepository.findAll();
	}


	public void delete(Section section) {
		Assert.notNull(section);
		sectionRepository.delete(section);

	}

}