package io.swagger.service;

import io.swagger.model.User;

public interface UserService {
    public User addUser(User user);
    public User loginUser(User user);
    public User modifyUser(User user);
    public User findById(Long id);
}
