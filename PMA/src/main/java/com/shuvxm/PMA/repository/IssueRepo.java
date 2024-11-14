package com.shuvxm.PMA.repository;

import com.shuvxm.PMA.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepo extends JpaRepository<Issue, Long> {
}
