package com.shuvxm.PMA.serviceimpl;

import com.shuvxm.PMA.dao.ProjectDao;
import com.shuvxm.PMA.entity.Project;
import com.shuvxm.PMA.responsestructure.ResponseStructure;
import com.shuvxm.PMA.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectDao projectDao;

    @Override
    public ResponseEntity<?> createProject(Project project) {
        project = projectDao.createProject(project);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("Project has been created successfully").body(project).build());
    }

    @Override
    public ResponseEntity<?> findAllProjects() {
        List<Project> project = projectDao.findAllProjects();
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("All Projects fetched successfully").body(project).build());
    }

    public ResponseEntity<?> findProjectById(Long id){
        Optional<Project> optional = projectDao.findProjectById(id);
        return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("Project fetched by Id successfully").body(optional).build());
    }

    @Override
    public ResponseEntity deleteProjectById(Long id) {

        return null;
    }
}
