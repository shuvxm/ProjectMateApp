package com.shuvxm.PMA.daoimpl;

import com.shuvxm.PMA.dao.UserDao;
import com.shuvxm.PMA.entity.User;
import com.shuvxm.PMA.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public Optional<User> findUserById(Long id) {
        return userRepo.findById(id);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepo.deleteById(id);
    }
}
