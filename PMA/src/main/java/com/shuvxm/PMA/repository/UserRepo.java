package com.shuvxm.PMA.repository;

import com.shuvxm.PMA.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
