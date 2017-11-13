package com.elements.envato.repository;

import com.elements.envato.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    User findUserByUsername(String username);
}
