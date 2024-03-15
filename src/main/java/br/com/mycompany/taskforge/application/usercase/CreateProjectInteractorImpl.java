package br.com.mycompany.taskforge.application.usercase;

import br.com.mycompany.taskforge.application.gateways.IProjectGateway;
import br.com.mycompany.taskforge.domain.entity.project.Project;
 
/**
 * Implementation of the interactor for creating a project.
 */
public class CreateProjectInteractorImpl implements ICreateProjectInteractor {

    /**
     * Gateway for interacting with the project repository.
     */
    public final IProjectGateway projectGateway;

    /**
     * Constructor for dependency injection.
     *
     * @param projectGateway The project gateway implementation.
     */
    public CreateProjectInteractorImpl(IProjectGateway projectGateway) {
        this.projectGateway = projectGateway;
    }

    /**
     * Creates a new project with the given details.
     *
     * @param project The project to be created.
     * @return The created project.
     */
    public Project createProject(Project project) {
        return projectGateway.createProject(project);
    }
}
