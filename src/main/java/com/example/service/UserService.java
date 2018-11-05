package com.example.service;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User findUser(Long id) { return userRepository.findOne(id); }
    public List<User> findAllUsers() { return userRepository.findAll(); }
    public User save(User user) { return userRepository.save(user); }
    public void delete(Long id) { userRepository.delete(id); }
}
