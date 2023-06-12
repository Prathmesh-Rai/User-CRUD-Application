package com.Prathmesh.demouserapplication.service;

import com.Prathmesh.demouserapplication.entities.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUser(Long id);

    List<User> getAllUsers();

    User deleteUser(Long id);

    User updateUser(Long id, User user);
}
