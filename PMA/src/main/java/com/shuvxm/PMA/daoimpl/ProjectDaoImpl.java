package com.shuvxm.PMA.daoimpl;

import com.shuvxm.PMA.dao.ProjectDao;
import com.shuvxm.PMA.entity.Project;
import com.shuvxm.PMA.repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProjectDaoImpl implements ProjectDao {

    @Autowired
    private ProjectRepo projectRepo;

    @Override
    public Project createProject(Project project) {
        return projectRepo.save(project);
    }

    @Override
    public Optional<Project> findProjectById(Long id) {
        return projectRepo.findById(id);
    }

    @Override
    public List<Project> findAllProjects() {
        return projectRepo.findAll();
    }

    @Override
    public void deleteProject(Long id) {
        projectRepo.deleteById(id);
    }

    @Override
    public Project updateProject(Project project) {
        return projectRepo.save(project);
    }

    @Override
    public List<Project> findProjectsByOwner(Long ownerId) {
        return projectRepo.findProjectsByOwner(ownerId);
    }

    @Override
    public List<Project> findProjectsByTeamMember(Long userId) {
        return projectRepo.findProjectsByTeamMember(userId);
    }
}
