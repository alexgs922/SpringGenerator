package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.fclase3y.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.Clase3Repository;
import domain.Clase3;

@Service
@Transactional
public class Clase3Service {
	@Autowired
	private Clase3Repository clase3Repository;

	public Clase3 findByPrincipal() {
		UserAccount ua = LoginService.getPrincipal();
		return findByUserAccount(ua);
	}

	public Clase3 findOne(int id) {
		return clase3Repository.findOne(id);
	}

	public void save(Clase3 a) {
		Assert.notNull(a);
		clase3Repository.save(a);
	}

	public Collection<Clase3> findAll() {
		return clase3Repository.findAll();
	}


	public void delete(Clase3 clase3) {
		Assert.notNull(clase3);
		clase3Repository.delete(clase3);

	}

}