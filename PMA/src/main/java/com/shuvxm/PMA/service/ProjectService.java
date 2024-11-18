package com.shuvxm.PMA.service;

import com.shuvxm.PMA.entity.Project;
import org.springframework.http.ResponseEntity;

public interface ProjectService {

    ResponseEntity<?> createProject(Project project);
}
