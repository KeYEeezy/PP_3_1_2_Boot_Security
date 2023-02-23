package ru.kata.spring.boot_security.demo.util;

import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class UserCreator {

        private static final String ROLE_ADMIN = "ADMIN";
        private static final String ROLE_USER = "USER";

        public static List<User> createUsersWithRoles() {
            User user = new User("user", "user","kataStudent", 26, Arrays.asList("ROLE_USER"));
            User admin = new User("admin", "admin","kataStudentAdmin", 26, Arrays.asList("ROLE_ADMIN", "ROLE_USER"));
            return List.of(user, admin);
        }
    }

