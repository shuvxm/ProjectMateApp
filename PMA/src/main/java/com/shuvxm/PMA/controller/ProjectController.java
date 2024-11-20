package com.shuvxm.PMA.controller;

import com.shuvxm.PMA.entity.Project;
import com.shuvxm.PMA.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping
    public ResponseEntity<?> createProject(@RequestBody Project project){
        return projectService.createProject(project);
    }

    @GetMapping
    public ResponseEntity<?> findAllProjects(){
        return projectService.findAllProjects();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findProjectById(@PathVariable Long id){
        return projectService.findProjectById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProjectById(@PathVariable Long id){
        return projectService.deleteProjectById(id);
    }

}
