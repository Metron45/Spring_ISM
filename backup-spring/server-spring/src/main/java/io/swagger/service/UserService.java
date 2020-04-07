package io.swagger.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

import io.swagger.model.User;
import io.swagger.model.UserID;

public interface UserService {
    public User addUser(User user);
}
