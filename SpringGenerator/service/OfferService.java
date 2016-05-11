package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.OfferRepository;
import domain.Offer;

@Service
@Transactional
public class OfferService {
	@Autowired
	private OfferRepository offerRepository;

	public Offer findOne(int id) {
		return offerRepository.findOne(id);
	}

	public void save(Offer a) {
		Assert.notNull(a);
		offerRepository.save(a);
	}

	public Collection<Offer> findAll() {
		return offerRepository.findAll();
	}


	public void delete(Offer offer) {
		Assert.notNull(offer);
		offerRepository.delete(offer);

	}

}