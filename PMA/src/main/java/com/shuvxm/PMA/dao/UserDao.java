package com.shuvxm.PMA.dao;

import com.shuvxm.PMA.entity.User;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface UserDao {

    User createUser(User user);

    List<User> findAllUsers();

    Optional<User> findUserById(Long id);

    void deleteUserById(Long id);
}
