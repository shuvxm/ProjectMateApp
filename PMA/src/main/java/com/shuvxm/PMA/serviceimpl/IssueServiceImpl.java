package com.shuvxm.PMA.serviceimpl;

import com.shuvxm.PMA.dao.IssueDao;
import com.shuvxm.PMA.entity.Issue;
import com.shuvxm.PMA.responsestructure.ResponseStructure;
import com.shuvxm.PMA.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IssueServiceImpl implements IssueService {

    @Autowired
    private IssueDao issueDao;

    @Override
    public ResponseEntity<?> createIssue(Issue issue) {
        issue = issueDao.createIssue(issue);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("Issue has been assigned successfully").body(issue).build());
    }

    @Override
    public ResponseEntity<?> findAllIssues() {
        List<Issue> issues = issueDao.findAllIssue();
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("All Issues has been fetched successfully").body(issues).build());
    }

    @Override
    public ResponseEntity<?> findIssuesById(Long id) {
        Optional<Issue> optional = issueDao.findIssueById(id);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("Issue has been fetched successfully by id").body(optional).build());
    }
}
