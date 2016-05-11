package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.CorrectionRepository;
import domain.Correction;

@Service
@Transactional
public class CorrectionService {
	@Autowired
	private CorrectionRepository correctionRepository;

	public Correction findOne(int id) {
		return correctionRepository.findOne(id);
	}

	public void save(Correction a) {
		Assert.notNull(a);
		correctionRepository.save(a);
	}

	public Collection<Correction> findAll() {
		return correctionRepository.findAll();
	}


	public void delete(Correction correction) {
		Assert.notNull(correction);
		correctionRepository.delete(correction);

	}

}