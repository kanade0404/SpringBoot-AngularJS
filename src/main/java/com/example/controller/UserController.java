package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers() {
        return userService.findAllUsers();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") Long id) {
        return userService.findUser(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public User createUser(@Validated @RequestBody User user){
        return userService.save(user);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public User updateUser(@PathVariable("id") Long id, @RequestBody User user){
        user.setId(id);
        return userService.save(user);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") Long id){
        userService.delete(id);
    }
}

