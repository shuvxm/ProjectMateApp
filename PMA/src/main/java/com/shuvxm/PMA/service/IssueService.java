package com.shuvxm.PMA.service;

import com.shuvxm.PMA.entity.Issue;
import org.springframework.http.ResponseEntity;

public interface IssueService {
    ResponseEntity<?> createIssue(Issue issue);

    ResponseEntity<?> findAllIssues();

    ResponseEntity<?> findIssuesById(Long id);
}
