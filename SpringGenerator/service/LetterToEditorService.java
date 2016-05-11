package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.LetterToEditorRepository;
import domain.LetterToEditor;

@Service
@Transactional
public class LetterToEditorService {
	@Autowired
	private LetterToEditorRepository lettertoeditorRepository;

	public LetterToEditor findOne(int id) {
		return lettertoeditorRepository.findOne(id);
	}

	public void save(LetterToEditor a) {
		Assert.notNull(a);
		lettertoeditorRepository.save(a);
	}

	public Collection<LetterToEditor> findAll() {
		return lettertoeditorRepository.findAll();
	}


	public void delete(LetterToEditor lettertoeditor) {
		Assert.notNull(lettertoeditor);
		lettertoeditorRepository.delete(lettertoeditor);

	}

}