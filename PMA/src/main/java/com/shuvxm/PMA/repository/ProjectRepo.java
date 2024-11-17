package com.shuvxm.PMA.repository;

import com.shuvxm.PMA.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;

import java.util.List;

public interface ProjectRepo extends JpaRepository<Project,Long> {

    
    List<Project> findProjectsByOwner(Long ownerId);

    List<Project> findProjectsByTeamMember(Long userId);
}
