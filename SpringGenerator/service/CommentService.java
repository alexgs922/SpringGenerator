package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.CommentRepository;
import domain.Comment;

@Service
@Transactional
public class CommentService {
	@Autowired
	private CommentRepository commentRepository;

	public Comment findOne(int id) {
		return commentRepository.findOne(id);
	}

	public void save(Comment a) {
		Assert.notNull(a);
		commentRepository.save(a);
	}

	public Collection<Comment> findAll() {
		return commentRepository.findAll();
	}


	public void delete(Comment comment) {
		Assert.notNull(comment);
		commentRepository.delete(comment);

	}

}