package com.dev.borges.projapp.repositories;

import com.dev.borges.projapp.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
