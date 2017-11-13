package com.elements.envato.service;

import com.elements.envato.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User findOneByUsername(String username);
}
