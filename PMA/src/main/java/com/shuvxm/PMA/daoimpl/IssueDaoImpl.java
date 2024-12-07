package com.shuvxm.PMA.daoimpl;

import com.shuvxm.PMA.dao.IssueDao;
import com.shuvxm.PMA.entity.Issue;
import com.shuvxm.PMA.repository.IssueRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class IssueDaoImpl implements IssueDao {

    @Autowired
    private IssueRepo issueRepo;

    @Override
    public Issue createIssue(Issue issue) {
        return issueRepo.save(issue);
    }

    @Override
    public List<Issue> findAllIssue() {
        return issueRepo.findAll();
    }

    @Override
    public Optional<Issue> findIssueById(Long id) {
        return issueRepo.findById(id);
    }
}
