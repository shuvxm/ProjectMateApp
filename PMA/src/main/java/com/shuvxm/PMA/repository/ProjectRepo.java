package com.shuvxm.PMA.repository;

import com.shuvxm.PMA.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProjectRepo extends JpaRepository<Project, Long> {

    @Query("SELECT p FROM Project p WHERE p.owner.id = :ownerId")
    List<Project> findProjectsByOwner(Long ownerId);

    @Query("SELECT DISTINCT p FROM Project p JOIN p.team t WHERE t.id = :userId")
    List<Project> findProjectsByTeamMember(Long userId);

}
