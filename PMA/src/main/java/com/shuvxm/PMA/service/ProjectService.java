package com.shuvxm.PMA.service;

import com.shuvxm.PMA.entity.Project;
import com.shuvxm.PMA.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProjectService {

    ResponseEntity<?> createProject(Project project);
//    ResponseEntity<?> createProject(Project project, Long userId);

    ResponseEntity<?> findAllProjects();

    ResponseEntity<?> findProjectById(Long id);

    ResponseEntity<?> deleteProjectById(Long id);

//    List<Project> findProjectByTeam(User user, String category)
}
