package com.shuvxm.PMA.repository;

import com.shuvxm.PMA.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project,Long> {
}
