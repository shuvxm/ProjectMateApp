package com.shuvxm.PMA.controller;

import com.shuvxm.PMA.entity.Issue;
import com.shuvxm.PMA.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/issues")
public class IssueController {

    @Autowired
    private IssueService issueService;

    @PostMapping
    public ResponseEntity<?> createIssue(@RequestBody Issue issue){
        return issueService.createIssue(issue);
    }

    @GetMapping
    public ResponseEntity<?> findAllIssues(){
        return issueService.findAllIssues();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findIssuesById(@PathVariable Long id){
        return issueService.findIssuesById(id);
    }

}
