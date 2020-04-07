package io.swagger.service;

import io.swagger.model.User;

public interface UserService {
    public User addUser(User user);
    public User loginUser(String email, String password);
    public User modifyUser(User user);
}
