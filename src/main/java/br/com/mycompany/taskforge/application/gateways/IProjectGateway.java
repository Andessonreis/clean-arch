package br.com.mycompany.taskforge.application.gateways;

import br.com.mycompany.taskforge.domain.entity.project.Project;

/**
 * Gateway interface for interacting with project-related data.
 */
public interface IProjectGateway {

    /**
     * Creates a new project with the provided details.
     *
     * @param project The project to be created.
     * @return The created project.
     */
    Project createProject(Project project);
}
