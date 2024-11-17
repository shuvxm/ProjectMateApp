package com.shuvxm.PMA.dao;

import com.shuvxm.PMA.entity.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectDao {

    // Basic CRUD Methods
    Project createProject(Project project);

    Optional<Project> findProjectById(Long id);

    List<Project> findAllProjects();

    void deleteProject(Long id);

    Project updateProject(Project project);

    // Query Methods
    List<Project> findProjectsByOwner(Long ownerId);

//    List<Project> findProjectsByNameContaining(String keyword);

//    List<Project> findProjectsByCategory(String category);

    List<Project> findProjectsByTeamMember(Long userId);

//    List<Project> findProjectsByTag(String tag);

    // Utility Methods
//    long countProjectsByOwner(Long ownerId);

//    boolean existsById(Long id);
}
