package com.dev.borges.projapp.services;

import com.dev.borges.projapp.entities.Project;
import com.dev.borges.projapp.repositories.ProjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProjectService {

    private ProjectRepository projectRepository;

    public Project insert(Project project) {
        return projectRepository.save(project);
    }
}
