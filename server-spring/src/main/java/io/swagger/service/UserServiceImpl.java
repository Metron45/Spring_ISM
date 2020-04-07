package io.swagger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.swagger.model.User;
import io.swagger.model.UserID;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user) {
		user.setId((int) userRepository.count());
		return userRepository.save(user);
	}

	@Override
	public User findUser(Integer id) {
		Optional<User> os = userRepository.findById(Long.valueOf(id));
		if(os.isPresent()) return os.get();
		else return null;
	}

	@Override
	public User deleteUser(Integer id) {
		Optional<User> os = userRepository.findById(Long.valueOf(id));
		if(os.isPresent()) userRepository.deleteById(Long.valueOf(id));
		return os.get();
	}

	@Override
	public User updateUser(User user) {
		userRepository.updateUserById(user.getId(),
				user.getName(),
				user.getSurname(),
				user.getDescription(),
				user.getParticipantInfo(),
				user.getEmail(),
				user.getPassword(),
				user.getImage()
				);
		return user;
	}
}