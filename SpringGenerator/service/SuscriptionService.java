package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.SuscriptionRepository;
import domain.Suscription;

@Service
@Transactional
public class SuscriptionService {
	@Autowired
	private SuscriptionRepository suscriptionRepository;

	public Suscription findOne(int id) {
		return suscriptionRepository.findOne(id);
	}

	public void save(Suscription a) {
		Assert.notNull(a);
		suscriptionRepository.save(a);
	}

	public Collection<Suscription> findAll() {
		return suscriptionRepository.findAll();
	}


	public void delete(Suscription suscription) {
		Assert.notNull(suscription);
		suscriptionRepository.delete(suscription);

	}

}