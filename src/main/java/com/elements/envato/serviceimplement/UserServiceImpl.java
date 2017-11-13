package com.elements.envato.serviceimplement;

import com.elements.envato.model.User;
import com.elements.envato.repository.UserRepository;
import com.elements.envato.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findOneByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }
}
