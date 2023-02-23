package ru.kata.spring.boot_security.demo.services;


import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    void saveUser(User user);

    List<User> findAll();

    User findUser(Long id);

    void updateUser(Long id, User user);

    void deleteUser(Long id);

    User findByUsername(String username);
}
