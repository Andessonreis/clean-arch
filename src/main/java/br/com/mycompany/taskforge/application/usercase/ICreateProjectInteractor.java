package br.com.mycompany.taskforge.application.usercase;

import br.com.mycompany.taskforge.domain.entity.project.Project;

/**
 * Represents an interactor for creating a project.
 */
public interface ICreateProjectInteractor {

    /**
     * Creates a new project with the given details.
     *
     * @param project The project to be created.
     * @return The created project.
     */
    Project createProject(Project project);
}
