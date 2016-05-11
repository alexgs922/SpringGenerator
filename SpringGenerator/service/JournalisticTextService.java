package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.JournalisticTextRepository;
import domain.JournalisticText;

@Service
@Transactional
public class JournalisticTextService {
	@Autowired
	private JournalisticTextRepository journalistictextRepository;

	public JournalisticText findOne(int id) {
		return journalistictextRepository.findOne(id);
	}

	public void save(JournalisticText a) {
		Assert.notNull(a);
		journalistictextRepository.save(a);
	}

	public Collection<JournalisticText> findAll() {
		return journalistictextRepository.findAll();
	}


	public void delete(JournalisticText journalistictext) {
		Assert.notNull(journalistictext);
		journalistictextRepository.delete(journalistictext);

	}

}