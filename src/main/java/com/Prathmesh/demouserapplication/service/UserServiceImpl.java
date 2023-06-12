package com.Prathmesh.demouserapplication.service;

import com.Prathmesh.demouserapplication.entities.User;
import com.Prathmesh.demouserapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


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
    public User updateUser(Long id, User user) {
        User currentRecord = userRepository.findById(id).get() ;
        if(Objects.nonNull(user.getAge())){
            currentRecord.setAge(user.getAge());
        }

        if(Objects.nonNull(user.getName()) && !"".equalsIgnoreCase(user.getName())){
            currentRecord.setName(user.getName());
        }

        if(Objects.nonNull(user.getEmailID()) && !"".equalsIgnoreCase(user.getEmailID())){
            currentRecord.setEmailID(user.getEmailID());
        }

        userRepository.save(currentRecord) ;

        return currentRecord ;

    }
}
