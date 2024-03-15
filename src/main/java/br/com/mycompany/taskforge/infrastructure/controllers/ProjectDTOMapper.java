package br.com.mycompany.taskforge.infrastructure.controllers;

import br.com.mycompany.taskforge.domain.entity.project.Project;

/**
 * Mapper for converting between project DTOs and domain objects.
 */
public class ProjectDTOMapper {
  
    /**
     * Converts a project domain object to a create project response DTO.
     *
     * @param project The project domain object.
     * @return The create project response DTO.
     */
    public CreateProjectResponse toResponse(Project project) {
        return new CreateProjectResponse(project.projectName(), project.projectDescription(), project.tasks());
    }
  
    /**
     * Converts a create project request DTO to a project domain object.
     *
     * @param request The create project request DTO.
     * @return The project domain object.
     */
    public Project toProject(CreateProjectRequest request) {
        return new Project(request.projectName(), request.projectDescription(), request.tasks());
    }
}
