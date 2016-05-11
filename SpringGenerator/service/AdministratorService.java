package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.AdministratorRepository;
import domain.Administrator;

@Service
@Transactional
public class AdministratorService {
	@Autowired
	private AdministratorRepository administratorRepository;

	public Administrator findOne(int id) {
		return administratorRepository.findOne(id);
	}

	public void save(Administrator a) {
		Assert.notNull(a);
		administratorRepository.save(a);
	}

	public Collection<Administrator> findAll() {
		return administratorRepository.findAll();
	}


	public void delete(Administrator administrator) {
		Assert.notNull(administrator);
		administratorRepository.delete(administrator);

	}

}