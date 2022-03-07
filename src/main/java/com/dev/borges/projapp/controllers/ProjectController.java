package com.dev.borges.projapp.controllers;

import com.dev.borges.projapp.entities.Project;
import com.dev.borges.projapp.services.ProjectService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/projects")
public class ProjectController {

    private ProjectService projectService;

    @PostMapping
    public Project save(@RequestBody Project project) {

        return projectService.save(project);
    }
}
