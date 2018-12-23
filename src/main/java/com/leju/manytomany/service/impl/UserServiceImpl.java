package com.leju.manytomany.service.impl;

import com.leju.manytomany.model.User;
import com.leju.manytomany.repository.UserRepository;
import com.leju.manytomany.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
