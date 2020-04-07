package io.swagger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.swagger.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user) {
		user.setId((int) userRepository.count()+1);
		return userRepository.save(user);
	}
	
	

	@Override
	public User modifyUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public User loginUser(String email, String password) {
		return userRepository.findUser(email, password);
	}

}