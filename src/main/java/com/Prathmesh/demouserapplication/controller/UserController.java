package com.Prathmesh.demouserapplication.controller;

import com.Prathmesh.demouserapplication.entities.User;
import com.Prathmesh.demouserapplication.service.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService ;

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user) ;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUser(id) ;
    }


    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers() ;
    }

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id,@RequestBody User user){
        userService.updateUser(id,user) ;
    }

}
