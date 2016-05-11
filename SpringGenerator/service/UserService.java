package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import repositories.UserRepository;
import domain.User;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User findOne(int id) {
		return userRepository.findOne(id);
	}

	public void save(User a) {
		Assert.notNull(a);
		userRepository.save(a);
	}

	public Collection<User> findAll() {
		return userRepository.findAll();
	}


	public void delete(User user) {
		Assert.notNull(user);
		userRepository.delete(user);

	}

}