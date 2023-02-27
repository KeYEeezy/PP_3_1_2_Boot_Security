package ru.kata.spring.boot_security.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.models.User;
import ru.kata.spring.boot_security.demo.repositories.RoleRepository;

import java.util.Arrays;
import java.util.List;

public class UserCreator {


    private static final String ROLE_ADMIN = "ROLE_ADMIN";
        private static final String ROLE_USER = "ROLE_USER";


        public static List<User> createUsersWithRoles() {

            User user = new User("user", "user","kataStudent", 26, List.of(ROLE_USER));
            User admin = new User("admin", "admin","kataStudentAdmin", 26, List.of(ROLE_ADMIN));
            return List.of(user, admin);
        }
    }

