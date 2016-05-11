package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.ActorRepository;
import domain.Actor;

@Service
@Transactional
public class ActorService {
	@Autowired
	private ActorRepository actorRepository;

	public Actor findOne(int id) {
		return actorRepository.findOne(id);
	}

	public void save(Actor a) {
		Assert.notNull(a);
		actorRepository.save(a);
	}

	public Collection<Actor> findAll() {
		return actorRepository.findAll();
	}


	public void delete(Actor actor) {
		Assert.notNull(actor);
		actorRepository.delete(actor);

	}

}