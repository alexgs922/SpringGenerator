package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.CreditCardRepository;
import domain.CreditCard;

@Service
@Transactional
public class CreditCardService {
	@Autowired
	private CreditCardRepository creditcardRepository;

	public CreditCard findOne(int id) {
		return creditcardRepository.findOne(id);
	}

	public void save(CreditCard a) {
		Assert.notNull(a);
		creditcardRepository.save(a);
	}

	public Collection<CreditCard> findAll() {
		return creditcardRepository.findAll();
	}


	public void delete(CreditCard creditcard) {
		Assert.notNull(creditcard);
		creditcardRepository.delete(creditcard);

	}

}