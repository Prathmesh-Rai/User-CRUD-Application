package com.Prathmesh.demouserapplication.service;

import com.Prathmesh.demouserapplication.entities.User;
import com.Prathmesh.demouserapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository ;

    @Override
    public User createUser(User user) {
        return userRepository.save(user) ;
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll() ;
    }

    @Override
    public User deleteUser(Long id) {
        User u = userRepository.findById(id).get() ;
        userRepository.deleteById(id);
        return u ;
    }

    @Override
    public void updateUser(Long id, User user) {
        userRepository.deleteById(id) ;
        userRepository.save(user) ;
        return ;
    }
}
