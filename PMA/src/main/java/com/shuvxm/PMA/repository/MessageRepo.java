package com.shuvxm.PMA.repository;

import com.shuvxm.PMA.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
