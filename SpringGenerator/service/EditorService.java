package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.EditorRepository;
import domain.Editor;

@Service
@Transactional
public class EditorService {
	@Autowired
	private EditorRepository editorRepository;

	public Editor findOne(int id) {
		return editorRepository.findOne(id);
	}

	public void save(Editor a) {
		Assert.notNull(a);
		editorRepository.save(a);
	}

	public Collection<Editor> findAll() {
		return editorRepository.findAll();
	}


	public void delete(Editor editor) {
		Assert.notNull(editor);
		editorRepository.delete(editor);

	}

}