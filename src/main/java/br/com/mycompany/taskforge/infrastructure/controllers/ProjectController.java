package br.com.mycompany.taskforge.infrastructure.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mycompany.taskforge.application.usercase.ICreateProjectInteractor;
import br.com.mycompany.taskforge.domain.entity.project.Project;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

/**
 * Controller for handling project-related HTTP requests.
 */
@RestController
@RequestMapping("projects")
@RequiredArgsConstructor
public class ProjectController {

    /**
     * Interactor for creating projects.
     */
    private final ICreateProjectInteractor createProjectInteractor;

    /**
     * Mapper for converting between project DTOs and domain objects.
     */
    private final ProjectDTOMapper projectDTOMapper;

    /**
     * Endpoint for creating a new project.
     *
     * @param request The request body containing project creation details.
     * @return The response containing information about the created project.
     */
    @PostMapping
    public CreateProjectResponse createProject(@Valid @RequestBody CreateProjectRequest request) {
        Project project = projectDTOMapper.toProject(request);
        Project createdProject = createProjectInteractor.createProject(project);
        return projectDTOMapper.toResponse(createdProject);
    }
}
