package com.shuvxm.PMA.serviceimpl;

import com.shuvxm.PMA.dao.UserDao;
import com.shuvxm.PMA.entity.User;
import com.shuvxm.PMA.responsestructure.ResponseStructure;
import com.shuvxm.PMA.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public ResponseEntity<?> createUser(User user) {
        user = userDao.createUser(user);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("User has been created successfully").body(user).build());
    }

    @Override
    public ResponseEntity<?> findAllUsers() {
        List<User> users = userDao.findAllUsers();
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("All users has been fetched successfully").body(users).build());
    }

    @Override
    public ResponseEntity<?> findUserById(Long id) {
        Optional<User> optional = userDao.findUserById(id);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("User has been fetched successfully by id").body(optional).build());
    }

    @Override
    public ResponseEntity<?> deleteUserById(Long id) {
        Optional<User> optional = userDao.findUserById(id);

        if (optional.isPresent()) {
            userDao.deleteUserById(id);
            return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("User has been deleted successfully").body("User with ID " + id + " has been removed").build());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ResponseStructure.builder().status(HttpStatus.NOT_FOUND.value()).message("User not found").body("No user found with ID " + id).build());
        }
    }

}
