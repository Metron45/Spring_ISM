package io.swagger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.swagger.model.User;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	

	@Override
	public User modifyUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public User loginUser(User user) {
		List<User> userList;
		//System.out.println("User to look for in DB:" + user.toString());
		userList= userRepository.findAll();
		for(User userOnList : userList) {
			//System.out.println("User in DB:" + userOnList.toString());
			if(userOnList.getEmail().equals(user.getEmail()) &&  userOnList.getPassword().equals(user.getPassword()) ) {
				//System.out.println("User found:" + userOnList.toString());
				return userOnList;
			}
		}
		return null;
	}

	@Override
	public User findById(Long id) {
		Optional<User> user = userRepository.findById(Long.valueOf(id));
		if(user.isPresent()) return user.get();
		else return null;
	}

}