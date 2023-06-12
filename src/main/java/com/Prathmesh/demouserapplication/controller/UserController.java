package com.Prathmesh.demouserapplication.controller;

import com.Prathmesh.demouserapplication.entities.User;
import com.Prathmesh.demouserapplication.service.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService ;

    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        return userService.createUser(user) ;
    }

    @GetMapping("/getUserByID/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUser(id) ;
    }


    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers() ;
    }

    @DeleteMapping("/deleteUser/{id}")
    public User deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }

    @PutMapping("/updateUser/{id}")
    public User updateUser(@PathVariable Long id,@RequestBody User user){
        return userService. updateUser(id,user) ;
    }

}
