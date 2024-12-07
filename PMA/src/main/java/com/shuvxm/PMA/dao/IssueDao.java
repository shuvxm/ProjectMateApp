package com.shuvxm.PMA.dao;

import com.shuvxm.PMA.entity.Issue;

import java.util.List;
import java.util.Optional;

public interface IssueDao {

    Issue createIssue(Issue issue);

    List<Issue> findAllIssue();

    Optional<Issue> findIssueById(Long id);


}
