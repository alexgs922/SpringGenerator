package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.fclase2y.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.Clase2Repository;
import domain.Clase2;

@Service
@Transactional
public class Clase2Service {
	@Autowired
	private Clase2Repository clase2Repository;

	public Clase2 findByPrincipal() {
		UserAccount ua = LoginService.getPrincipal();
		return findByUserAccount(ua);
	}

	public Clase2 findOne(int id) {
		return clase2Repository.findOne(id);
	}

	public void save(Clase2 a) {
		Assert.notNull(a);
		clase2Repository.save(a);
	}

	public Collection<Clase2> findAll() {
		return clase2Repository.findAll();
	}


	public void delete(Clase2 clase2) {
		Assert.notNull(clase2);
		clase2Repository.delete(clase2);

	}

}