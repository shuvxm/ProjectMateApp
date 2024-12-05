package com.shuvxm.PMA.service;

import com.shuvxm.PMA.entity.User;
import org.springframework.http.ResponseEntity;

public interface UserService {


    ResponseEntity<?> createUser(User user);

    ResponseEntity<?> findAllUsers();

    ResponseEntity<?> findUserById(Long id);

    ResponseEntity<?> deleteUserById(Long id);
}
