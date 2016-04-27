package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.fclase1y.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.Clase1Repository;
import domain.Clase1;

@Service
@Transactional
public class Clase1Service {
	@Autowired
	private Clase1Repository clase1Repository;

	public Clase1 findByPrincipal() {
		UserAccount ua = LoginService.getPrincipal();
		return findByUserAccount(ua);
	}

	public Clase1 findOne(int id) {
		return clase1Repository.findOne(id);
	}

	public void save(Clase1 a) {
		Assert.notNull(a);
		clase1Repository.save(a);
	}

	public Collection<Clase1> findAll() {
		return clase1Repository.findAll();
	}


	public void delete(Clase1 clase1) {
		Assert.notNull(clase1);
		clase1Repository.delete(clase1);

	}

}